package com.example.jeboot.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.NotFoundException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Aspect
@Configuration
@Slf4j
public class LogAop {


    @Pointcut("@annotation(org.springframework.web.bind.annotation.RestController)")
    public void params() {
    }

    /**
     * 定义环绕通知
     *
     * @param joinPoint
     * @throws ClassNotFoundException
     * @throws NotFoundException
     * @throws IOException
     */
    @Around("params()")
    public Object doBefore(ProceedingJoinPoint joinPoint) throws Throwable {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();
        String url = request.getRequestURL().toString();
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String queryString = request.getQueryString();

        System.out.println("请求开始, 各个参数, url: " + url + ", method: " + method + ", uri:" + uri + ", params:" + queryString);
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String[] parameterNames = methodSignature.getParameterNames();
        Object[] param = joinPoint.getArgs();
        StringBuffer str = new StringBuffer();
        if (parameterNames != null) {
            for (int i = 0; i < param.length; i++) {
                str.append("参数名:").append(parameterNames[i]).append("=").append(param[i]);
            }
        }
        Object result = joinPoint.proceed();
        return result;
    }


}
