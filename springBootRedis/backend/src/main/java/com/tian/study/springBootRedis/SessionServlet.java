package com.tian.study.springBootRedis;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author tiayin
 * @date 2017/8/3
 */
@WebServlet("/session")
public class SessionServlet extends HttpServlet {
    private static final long serialVersionUID = 3998443221836550909L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String attributeName=req.getParameter("attributeName");
        String attributeValue=req.getParameter("attributeValue");
        req.getSession().setAttribute(attributeName,attributeValue);
        resp.sendRedirect(req.getContextPath()+"/");

    }
}
