package com.example.jeboot.base;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;

public class RequestFilter implements Filter {

    public static ThreadLocal<String> requestIdThreadLocal = new ThreadLocal<String>();
    public static final String REQUEST_ID_KEY = "requestId";

    private static final Logger logger = LoggerFactory.getLogger(RequestFilter.class);

    public static String getRequestId(HttpServletRequest request) {
        String requestId = null;
        String parameterRequestId = request.getParameter(REQUEST_ID_KEY);
        String headerRequestId = request.getHeader(REQUEST_ID_KEY);
        if (parameterRequestId == null && headerRequestId == null) {
            logger.info("request parameter 和header 都没有requestId入参");
            requestId = UUID.randomUUID().toString();
        } else {
            requestId = parameterRequestId != null ? parameterRequestId : headerRequestId;
        }
        String s = requestIdThreadLocal.get();
        if (StringUtils.isNotBlank(s)){
            return requestId;
        }
        requestIdThreadLocal.set(requestId);
        return requestId;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        getRequestId((HttpServletRequest) servletRequest);
    }

    @Override
    public void destroy() {
        requestIdThreadLocal.remove();
    }
}
