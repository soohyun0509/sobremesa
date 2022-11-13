package controller.page;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;


@WebServlet("/page/reserve")
public class reserve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public reserve() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id=(String)request.getSession().getAttribute("id");
		
		int mno=DAO.getInstance().getMno(id);
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String r_date=request.getParameter("r_date");
		int r_size=Integer.parseInt(request.getParameter("r_size"));
	
		
		boolean result=DAO.getInstance().reserve(mno,name,phone,r_date,r_size);
		response.getWriter().print(result);
	
	}

}
