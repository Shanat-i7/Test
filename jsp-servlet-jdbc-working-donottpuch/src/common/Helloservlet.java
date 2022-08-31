package common;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Helloservlet
 */
@WebServlet("/customer/register")
public class Helloservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Helloservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database databaseobje = new Database();
		
		String age = request.getParameter("age");
		String mobile = request.getParameter("mobile");
	    String player = request.getParameter("player");
		String bat = request.getParameter("bat");
		
		int ageinint = Integer.parseInt(age);
		int mobileinint = Integer.parseInt(mobile);
		int playerinint = Integer.parseInt(player);
		int batinint = Integer.parseInt(bat);
		
		databaseobje.saveData(ageinint, mobileinint, playerinint, batinint);
		//List<Integer> data = databaseobje.getData();
		List<Employee> empDataSet = databaseobje.getDataCust();
	    List<Updater> UpdaterDataSet = databaseobje.getUpdaterCust();
	
		
		//System.out.println(data);
		//request.setAttribute("jspdata", data);
		
		request.setAttribute("empData", empDataSet);
		request.setAttribute("UpdaterData", UpdaterDataSet);
		request.getRequestDispatcher("/jiji.jsp").forward(request, response);;
		
		
		// TODO Auto-generated method stub
		//System.out.println("inside hello");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	} 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
