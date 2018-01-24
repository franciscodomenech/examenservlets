

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Clinica;

/**
 * Servlet implementation class __ListController
 */
@WebServlet("/__ListController")
public class __ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public __ListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tosearch = request.getParameter("valuesearchin");
		if(tosearch==null)
			tosearch = "";
		else
			request.getSession().setAttribute("valuesearch", tosearch);
		request.setAttribute("mascotas", Clinica.search(tosearch));
		request.setAttribute("valuesearch", tosearch);
		request.getRequestDispatcher("Mascotas.jsp").forward(request, response);
	}

}
