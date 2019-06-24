package com.etoak.web.controller;


import com.etoak.web.bean.vo.UserBeanVo;

import com.etoak.web.service.UserService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 登陆控制
 *
 * @author wang
 */
@Controller
@Slf4j
@RequestMapping("/user")
public class LoginController {

    @Autowired
    UserService userService;

    private static final String SESSION_KEY = "user";
    private static final String adminNo = "768389433";


    /**用session判断用户是否登录了
     * 并跳转到相应的页面
     * @param request
     * @return
     */
    @RequestMapping("/loginPage")
    public String loginPage(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute(SESSION_KEY) == null) {
            return "/login/login";
        } else if (session.getAttribute(SESSION_KEY) != null) {
            return "/admin/admin";
        }
        return "/login/login";
    }

    /**登录实现（ 简陋版）
     * @param userBean
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping("/login")
    public String login(UserBeanVo userBean, HttpServletRequest request) throws Exception {

        if (userBean.getUserName() != null && userBean.getPassword() != null) {
            if (!adminNo.equals(userBean.getUserName())){
                 return "/login/error";
            }
            List<UserBeanVo> userBeanVos = userService.queryUser(userBean);
            if (userBeanVos.size() != 0) {
                HttpSession session = request.getSession();
                session.setAttribute(SESSION_KEY, userBeanVos);
                return "/admin/admin";
            } else if (userBeanVos.size() == 0) {
                return "/login/error";
            }

        } else {
            throw new Exception("没有拿到用户名或密码");
        }

        return "index";
    }
}
