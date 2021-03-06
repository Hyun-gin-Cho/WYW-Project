package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.dao.UserDataDao;
import com.mvc.dto.UserDataDto;

@WebServlet("/selectOneController")
public class selectOneController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		int num = Integer.parseInt(request.getParameter("boardno"));
		
		UserDataDao dao = UserDataDao.getInstance();

		UserDataDto dto = dao.selectOneContent(num);
		
		if(dto != null) {
			request.setAttribute("dto", dto);
		}else {
			System.out.println("실패");
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("view.jsp");
		dis.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
