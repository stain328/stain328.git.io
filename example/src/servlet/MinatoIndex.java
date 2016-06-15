package servlet;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SiteEV;


@WebService("/MinatoIndex")
public class MinatoIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext appcontext = this.getServletContext();
		SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");

		if(siteEV == null) {
			siteEV = new SiteEV();

		}

		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		SiteEVLogic siteEVLogic = new SiteEVLogic();
		if(action != null && action.equals("like")) {
			siteEVLogic.like(siteEV);
		}
		else if(action != null && action.equals("dislike")){
			siteEVLogic.dislike("siteEV","siteEV");
		}

		application.setAttribute("siteEV","siteEV");

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/WEB-INF/jsp/minatoIndex.jsp");
		dispatcher.forward(request, response);
	}

}
