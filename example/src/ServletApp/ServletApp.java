package ServletApp;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletApp
 */
public class ServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// アプリケーションスコープに保存するインスタンスの生成
		Human human = new Human("山田 太郎",23);

		//ServletContextインスタンスの取得
		ServletContext application = this.getServletContext();

		//アプリケーションスコープにインスタンス保存
		application.setAttribute("human", human);

		//アプリケーションスコープからインスタンスを取得
		Human h = (Human) application.getAttribute("human");

		//アプリケーションスコープからインスタンスを削除
		application.removeAttribute("human");

	}
}
