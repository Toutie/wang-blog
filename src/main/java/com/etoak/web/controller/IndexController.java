package com.etoak.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**页面跳转管理
 * @author wang
 */
@Controller
@Slf4j
public class IndexController {

    /**跳转首页
     * @return
     */
    @RequestMapping("/")
    public String hello() {

        return "index";

    }

    @RequestMapping("/blogPage")
    public String  blogPage(){
        return "/blog/blog";
    }
}
