package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import model.DAO;


@WebServlet("/member/signin")
public class signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public signin() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 세션 저장하기	
		// 로그인 정확히 되면 세션에 저장해야지...
		String id=request.getParameter("id");
		String password=request.getParameter("password");
	
		boolean result=DAO.getInstance().login(id, password);
		if(result) {
		//	HttpSession session=request.getSession();
		//	session.setAttribute("id", id);
			
			request.getSession().setAttribute("id", id);
			
		}
		response.getWriter().print(result);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
