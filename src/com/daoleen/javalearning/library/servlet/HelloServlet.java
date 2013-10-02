package com.daoleen.javalearning.library.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 11:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter pw = servletResponse.getWriter();
        pw.write("<b>Hello from servlet!</b>");
        pw.close();
    }
}
