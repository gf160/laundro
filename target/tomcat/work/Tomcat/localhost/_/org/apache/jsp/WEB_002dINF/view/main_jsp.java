/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.86
 * Generated at: 2022-11-05 07:03:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Main Page</title>\r\n");
      out.write("    <script src=\"/lib/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/lib/boostrap/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"/lib/boostrap/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/main.css\">\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function(){\r\n");
      out.write("            $('#dropOffBtn').click(function(){\r\n");
      out.write("                location.href = '/main/dropOff.do';\r\n");
      out.write("            });\r\n");
      out.write("            $('#takeOut').click(function(){\r\n");
      out.write("                location.href = '/main/takeOut.do';\r\n");
      out.write("            });\r\n");
      out.write("            clock();\r\n");
      out.write("            setInterval(clock, 1000);\r\n");
      out.write("        });\r\n");
      out.write("        function clock() {\r\n");
      out.write("            var Target = document.getElementById(\"clock\");\r\n");
      out.write("            var time = new Date();\r\n");
      out.write("\r\n");
      out.write("            var month = time.getMonth();\r\n");
      out.write("            var date = time.getDate();\r\n");
      out.write("\r\n");
      out.write("            var hours = time.getHours();\r\n");
      out.write("            var minutes = time.getMinutes();\r\n");
      out.write("\r\n");
      out.write("            Target.innerText = (month + 1) + '월 '\r\n");
      out.write("                + (date) + '일 '\r\n");
      out.write("                + (hours) + '시 '\r\n");
      out.write("                + (minutes) + '분 ';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div style=\"width: 100%\" align=\"center\">\r\n");
      out.write("        <h1 style=\"font-size:70px; font-weight: 900;\">청학 세탁소</h1>\r\n");
      out.write("        <div id=\"clock\" style=\"text-align: right; font-size:25px\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("    <div>\r\n");
      out.write("        <button type=\"button\" class=\"action-btn\" style=\"color: blue;\" id=\"dropOffBtn\"> 맡기기</button>\r\n");
      out.write("        <button type=\"button\" class=\"action-btn\" style=\"color: red;\" id=\"takeOut\"> 반  출</button>\r\n");
      out.write("        <div style=\"float:right\">\r\n");
      out.write("            <button type=\"button\" class=\"action-btn2\" style=\"height:400px;\"> 조  회</button><br>\r\n");
      out.write("            <button type=\"button\" class=\"action-btn2\" style=\"height: 100px;\"> 관  리</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
