

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Clinica;

/**
 * Servlet implementation class __SaveController
 */
@WebServlet("/__SaveController")
public class __SaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public __SaveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id").trim();
		if(id.equals("-1"))
			Clinica.addMascota(request.getParameter("nombre"), request.getParameter("edad"), request.getParameter("descripcion"));
		else
			Clinica.updateMascota(id,request.getParameter("nombre"), request.getParameter("edad"), request.getParameter("descripcion"));
		response.sendRedirect("__ListController");
	}

}
