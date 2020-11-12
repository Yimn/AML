package com.yimnlu.AML.executor.Interceptor;

import com.yimnlu.AML.executor.staticReturn.TodayWorkDate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        _Pre_rule_get_Handle(request, response);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    private void _pre_rule_get_Handle(HttpServletRequest request, HttpServletResponse response) {
        String method = request.getMethod();
        if ("GET".equals(method)) {
            Enumeration enu = request.getParameterNames();
            while (enu.hasMoreElements()) {
                String paraName = (String) enu.nextElement();
                if (paraName.equals("DEPARTID") && request.getParameter(paraName).equals("00000000")) {
                    log.info("Turn default '00000000' to Today.");
                    log.info(paraName);
                    request.setAttribute(paraName, "10385194");
                }
                if (paraName.equals("WORKDATE") && request.getParameter(paraName).equals("00000000")) {
                    request.setAttribute(paraName, TodayWorkDate.WORKDATE());
                    log.info("Turn default '00000000' to default DEPARTID.");
                    log.info(paraName);
                }
            }
        }
    }
}
