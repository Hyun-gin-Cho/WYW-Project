/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.60
 * Generated at: 2021-03-09 12:15:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StoryPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');
 response.setContentType("text/html; charset=UTF-8"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>StoryPage</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("\t\t<!-- Style -->\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t#s0{ float: left; width: 34% }\r\n");
      out.write("\t\t\t#s1{ float: left; width: 33%; padding: 25px 0px 25px 0px }\r\n");
      out.write("\t\t\t#s2{ float: left; width: 100%; height: 50px; }\r\n");
      out.write("\t\t\t#s4{ padding: 8px 0px 0px 0px; margin-left: 25px; }\r\n");
      out.write("\t\t\t#s6{ float: left; }\r\n");
      out.write("\t\t\t#ask1{ \r\n");
      out.write("\t\t\t\tborder: 2px solid black;\r\n");
      out.write("\t\t\t\tbackground-color: #fffbc1; \r\n");
      out.write("\t\t\t\tfont-weight: bold; \r\n");
      out.write("\t\t\t\tcolor: #3f385a;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ta{ text-decoration: none }\r\n");
      out.write("\t\t\t.avatacon {\r\n");
      out.write("\t\t\t    width: 30px; \r\n");
      out.write("\t\t\t    height: 30px;\r\n");
      out.write("\t\t\t    object-fit: cover;\r\n");
      out.write("\t\t\t    object-position: top;\r\n");
      out.write("\t\t\t    border-radius: 50%;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#select {\r\n");
      out.write("\t\t\t\tfont-size: 15px;\r\n");
      out.write("\t\t\t\tbackground: #ff6382;\r\n");
      out.write("\t\t\t\tvertical-align: middle; \r\n");
      out.write("\t\t\t\ttext-align-last: center;\r\n");
      out.write("\t\t\t\tcolor: #d3d3d3;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t<!-- Scripts -->\r\n");
      out.write("\t\t<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/js/jquery.poptrox.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/js/skel.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\twindow.onload = function(){\r\n");
      out.write("\t\t\t\tvar h = document.getElementById('hidemenu');\r\n");
      out.write("\t\t\t\tvar op = document.getElementById('viewmenu');\r\n");
      out.write("\t\t\t\tvar opp = document.getElementById('menu');\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\top.style.display = 'none';\r\n");
      out.write("\t\t\t\topp.style.display = 'none';\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\th.onclick = function(){\r\n");
      out.write("\t\t\t\t\th.style.display = 'none';\r\n");
      out.write("\t\t\t\t\top.style.display = '';\r\n");
      out.write("\t\t\t\t\topp.style.display = '';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\top.onclick = function(){\r\n");
      out.write("\t\t\t\t\top.style.display = 'none';\r\n");
      out.write("\t\t\t\t\topp.style.display = 'none';\r\n");
      out.write("\t\t\t\t\th.style.display = '';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Wrapper -->\r\n");
      out.write("\t\t\t<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Header -->\r\n");
      out.write("\t\t\t\t\t<header>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"s0\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img alt=\"WYW_날씨를 입다\" src=\"images/logo/logo_wyw_yellow.png\" width=\"200\" height=\"100\" onclick=\"location.href='mainController.do?command=mainpage'\">\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"s1\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"s1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img id=\"s4\" class=\"icons\" src=\"images/icon/setting.png\" alt=\"setting\" align=\"right\" width=\"30px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img id=\"s4\" class=\"icons\" src=\"images/icon/user.png\" alt=\"user\" align=\"right\" width=\"30px\" onclick=\"location.href='mainController.do?command=mypage'\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img id=\"s4\" class=\"icons\" src=\"images/icon/up.png\" alt=\"upload\" align=\"right\" width=\"30px\" onclick=\"location.href='mainController.do?command=StoryPage'\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img id=\"s4\" class=\"icons\" src=\"images/icon/search.png\" alt=\"search\" align=\"right\" width=\"30px\" onclick=\"location.href='mypageController.do?command=searchpage'\">\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"s2\"></div><!-- 위쪽 div 와 아래쪽 div를 나누는 용도 -->\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Main -->\r\n");
      out.write("\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"position: absolute;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"position: relative;top: 160px; left: 385px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t<img class=\"avatacon\" src=\"images/avatar.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t    \t<strong>&nbsp;&nbsp;userID</strong>\r\n");
      out.write("\t\t\t\t\t\t\t    \t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"position: relative;top: 125px; left: 690px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img id=\"hidemenu\" alt=\"menu\" src=\"images/icon/menu.png\" width=\"30px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img id=\"viewmenu\" alt=\"menu\" src=\"images/icon/overmenu.png\" width=\"30px\">\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"menu\" style=\"position: relative; top: 83px; left: 728px; background-color: #fffbc1; color: black; font-weight: bold;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form method=\"post\" action=\"UploadController\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<col width=\"250\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"select\" name=\"city\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">현제 계신 도시를 선택해주세요.</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"seoul\">서울특별시</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"incheon\">인천광역시</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"daejeon\">대전광역시</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"gwangju\">광주광역시</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"daegu\">대구광역시</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"ulsan\">울산광역시</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"busan\">부산광역시</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"gyeonggi-do\">경기도</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"gangwon-do\">강원도</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"chungcheongbuk-do\">충청북도</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"chungcheongnam-do\">충청남도</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"jeollabuk-do\">전라북도</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"jeollanam-do\">전라남도</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"gyeongsangbuk-do\">경상북도</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"gyeongsangnam-do\">경상남도</option>\r\n");
      out.write("\t\t\t\t\t\t\t                            <option value=\"jeju-do\">제주도</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"userid\" id=\"select\" type=\"text\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.userid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" readonly>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"userno\" id=\"select\" type=\"hidden\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.userno }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"title\" id=\"select\" type=\"text\" value=\"제목을 입력해 주세요\" onfocus=\"this.value='';return true;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"content\" id=\"select\" type=\"text\" value=\"내용을 입력해 주세요\" onfocus=\"this.value='';return true;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"file\" type=\"file\" value=\"사진 선택\" style=\"color: black;\" accept=\".jpg, .jpeg, .png, .gif, .bmp; images/storyimg/*; capture=camera\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\"><input type=\"submit\" style=\"width: 100%; height: 100%;\" value=\"내용 업로드\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t    <div id=\"header\">\r\n");
      out.write("\t\t\t\t\t\t    \t<img alt=\"img\" src=\"images/thumbs/01.jpg\"/>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Footer -->\r\n");
      out.write("\t\t\t\t\t<footer id=\"footer\">\r\n");
      out.write("\t\t\t\t\t\t<p>&copy; Untitled. All rights reserved. Design: <a href=\"http://templated.co\">TEMPLATED</a>. Demo Images: <a href=\"http://unsplash.com\">Unsplash</a>.</p>\r\n");
      out.write("\t\t\t\t\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
