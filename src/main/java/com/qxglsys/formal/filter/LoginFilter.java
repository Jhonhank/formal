package com.qxglsys.formal.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter
public class LoginFilter implements Filter {

    public LoginFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response= (HttpServletResponse) servletResponse;
        StringBuffer url=request.getRequestURL();
        String path=url.toString();
        Object user=request.getSession().getAttribute("user");
        if(path.endsWith(".do")||path.endsWith(".html")){
            //
//            System.out.println("进入edit页面");
            if (path.endsWith("/")
                ||path.endsWith("login.do")
                ||path.endsWith("logout.do")){
                filterChain.doFilter(request,response);
            }else {
                processControl(request,response,filterChain);
            }
        }else{
            filterChain.doFilter(request,response);
        }
    }

    private void processControl(HttpServletRequest request,HttpServletResponse response,
                                FilterChain chain)throws IOException,ServletException{
        Object user=request.getSession().getAttribute("user");
        String url=request.getRequestURL().toString();
        if (null==user){
            response.sendRedirect("/");
        }else {
            chain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {

    }
}
