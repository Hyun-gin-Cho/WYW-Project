package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import com.mvc.biz.ManagerBiz;
import com.mvc.dto.UserDataDto;

@WebServlet("/manager.do")
public class managerpageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 기본 세팅
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String command = request.getParameter("command");
		System.out.println("[" + command + "]"); // command 올바르게 넘어오는 지 확인용

		ManagerBiz biz = new ManagerBiz();
		HttpSession session = request.getSession(); // 세션 이렇게 가져오는 것 맞는지 확인 필요

		if (command.equals("noticelist")) {
			List<UserDataDto> list = biz.selectAllNotice();
			request.setAttribute("list", list);

			dispatch("noticeBoardList", request, response);
		} else if (command.equals("noticedetail")) {
			int boardno = Integer.parseInt(request.getParameter("boardno"));

			UserDataDto dto = biz.selectOneNotice(boardno);

			request.setAttribute("dto", dto);
			dispatch("noticeBoardDetail.jsp", request, response);

		} else if (command.equals("noticewriteform")) {
			String userrole = (String) session.getAttribute("userrole");

			// 접근 권한에 따라 이동
			if (userrole == "MANAGER") {
				response.sendRedirect("noticeBoardWrite.jsp");
			} else {
				jsResponse("접근 권한이 없습니다.", "manager.do?command=noticelist", response);
			}

		} else if (command.equals("noticewrite")) {
			String userid = request.getParameter("userid");
			String writer = request.getParameter("writer");
			String title = request.getParameter("title");
			String content = request.getParameter("content");

			UserDataDto dto = new UserDataDto(userid, writer, title, content);

			boolean res = biz.insertNotice(dto);

			if (res) {
				jsResponse("글 작성 성공", "manager.do?command=noticelist", response);
			} else {
				dispatch("manager.do?command=noticewriteform", request, response);
			}

		} else if (command.equals("noticeupdateform")) {
			String userrole = (String) session.getAttribute("userrole");

			// 접근 권한에 따라 이동
			if (userrole == "MANAGER") {
				response.sendRedirect("noticeBoardUpdate.jsp");
			} else {
				jsResponse("접근 권한이 없습니다.", "manager.do?command=noticelist", response);
			}

		} else if (command.equals("noticeupdate")) {
		
			int boardno = Integer.parseInt(request.getParameter("boardno"));
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			UserDataDto dto = new UserDataDto(boardno, title, content);
			
			boolean res = biz.updateNotice(dto);
			
			if (res) {
				jsResponse("글 수정 성공", "manager.do?command=noticelist", response);
			} else {
				dispatch("manager.do?command=noticeupdateform", request, response);
			}
			
			
		} else if (command.equals("noticedelete")) {
			String userrole = (String) session.getAttribute("userrole");

			if (userrole == "MANAGER") {
				int boardno = Integer.parseInt(request.getParameter("boardno"));

				boolean res = biz.deleteNotice(boardno);

				if (res) {
					dispatch("manager.do?command=noticelist", request, response);
				} else {
					dispatch("manager.do?command=noticedetail&boardno=" + boardno, request, response);
				}
			} else {
				jsResponse("접근 권한이 없습니다.", "manager.do?command=noticelist", response);
			}

		}else if (command.equals("memberlistall")) {

			//다 완성하고 나서 접근권한 설정하기
			

			List<UserDataDto> list = biz.selectAllMember();
			request.setAttribute("list", list);
			dispatch("memberList.jsp", request, response);
			
			
			

			
			
			
			
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void jsResponse(String msg, String url, HttpServletResponse response) throws IOException {
		String s = "<script type='text/javascript'>" + "alert('" + msg + "');" + "location.href='" + url + "';"
				+ "</script>";

		PrintWriter out = response.getWriter();
		out.print(s);

	}

	private void dispatch(String url, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatch = request.getRequestDispatcher(url);
		dispatch.forward(request, response);
	}

}