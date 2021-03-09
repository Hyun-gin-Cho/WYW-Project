package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.dao.UserDataDao;
import com.mvc.dto.UserDataDto;

@WebServlet("/mainController")
public class mainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String command = request.getParameter("command");
		System.out.println("["+command+"]");
		
		UserDataDao dao = new UserDataDao();
		
		if(command.equals("mainpage")) {
			response.sendRedirect("mainPage.jsp");
			
		} else if(command.equals("StoryPage")) {
	         response.sendRedirect("StoryPage.jsp");
	     
		} else if(command.equals("mypage")) {
			response.sendRedirect("mypage.jsp");
			
	    } else if(command.equals("clothesReco")) {
	    	List<UserDataDto> list = dao.clothesReco();
	    	
	    	request.setAttribute("list", list);
	    	
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("mypage.jsp");
	    	
	    	dispatcher.forward(request, response);
	    	
		
		
		}
		
		
		
	}		
		
		
		
		
		
		
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}