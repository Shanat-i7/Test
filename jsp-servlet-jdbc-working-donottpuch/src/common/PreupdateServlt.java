package common;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PreupdateServlt
 */
@WebServlet("/PreupdateServlt")
public class PreupdateServlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PreupdateServlt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest uuu, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

		String ageinstring =  uuu.getParameter("age");
		String mobilinstring =  uuu.getParameter("mobile");
		String playerinstring =  uuu.getParameter("player");
		String batinstring =  uuu.getParameter("bat");
		
		int ageinint = Integer.parseInt(ageinstring);
		int mobinint =  Integer.parseInt(mobilinstring);
		int playerinint =  Integer.parseInt(playerinstring);
		int batinint =  Integer.parseInt(batinstring);
		
		Employee employee = new Employee();
		employee.setAge(ageinint);
		employee.setMobile(mobinint);
		employee.setPlayer(playerinint);
		employee.setBat(batinint);
		
		
		uuu.setAttribute("emp", employee);
		
		
		uuu.getRequestDispatcher("/updateData.jsp").forward(uuu, response);
		
		response.getWriter().append("Served at: ").append(uuu.getContextPath());
		

		
		
		doGet(uuu, response);
	}

}
