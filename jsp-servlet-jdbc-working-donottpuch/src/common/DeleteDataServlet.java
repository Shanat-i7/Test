package common;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteDataServlet
 */
@WebServlet("/deleteDataServlet/delete")
public class DeleteDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
      String mobileinstring = request.getParameter("mobile");
		
		int mobileinint = Integer.parseInt(mobileinstring);
		
		
		Database database = new Database();
		database.deleteCustData(mobileinint);
		
        List<Employee> empDataSet = database.getDataCust();
	
		request.setAttribute("empData", empDataSet);
		
				
		request.getRequestDispatcher("/jiji.jsp").forward(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		doGet(request, response);
	}

}
