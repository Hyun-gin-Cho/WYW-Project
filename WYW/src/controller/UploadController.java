package controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.mvc.dao.UserDataDao;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/UploadController")
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String fileName = request.getParameter("file");
        System.out.println(fileName);
        
        ServletContext context = getServletContext(); //어플리케이션에 대한 정보를 ServletContext 객체가 갖게 됨. 
        String saveDir = context.getRealPath("Upload"); //절대경로를 가져옴
        System.out.println("절대경로 >> " + saveDir);
        
        int maxSize = 10*1024*1024; // 10MB
        String encoding = "euc-kr";
        
        boolean isMulti = ServletFileUpload.isMultipartContent(request);
        if(isMulti) {
        	 MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
        	 UserDataDao dao = new UserDataDao();
        	 
        	 String city = multi.getParameter("city");
        	 String title = multi.getParameter("title");
        	 String content = multi.getParameter("content");
        	 String userimgname = multi.getFilesystemName("userimgname");
        	 
        	 try {
				int result = dao.imgUpload(city,title,content,userimgname);
				String moveUrl = "";
				if(result>0) {
					System.out.println("저장 완료");
					moveUrl = "selectService";
				}else {
					System.out.println("저장 실패");
					moveUrl = "StoryPage.jsp";
				}
				
				response.sendRedirect(moveUrl);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
        }else {
        	System.out.println("일반 전송 form 입니다.");
        }
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
