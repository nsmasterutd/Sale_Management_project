package lovely;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class serv
 */
@WebServlet("/fca")
public class serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String why = request.getParameter("why"); // if parameter name is wrong you get logical errors.
		
		
		if(why.equals("checkDeptName"))
		{
			
			
			
			String str=request.getParameter("deptid");
		
			Employee em=new Employee();
			Object pn =em.getPageName(str);
			request.setAttribute("key", pn);
			
			
		RequestDispatcher rq= request.getRequestDispatcher("deptid.jsp");
		rq.forward(request, response);
	
		}

	}

}
