package com.etoak.web.controller;


import com.etoak.web.bean.dto.ResponseCode;
import com.etoak.web.bean.vo.UserBeanVo;
import com.etoak.web.service.UserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**用户信息管理接口
 * @author wang
 */
@RestController
@Slf4j
@Api("用户管理接口")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public boolean addUser(@RequestBody UserBeanVo userBeanVo){
        log.info("param userBeanVo:{}",userBeanVo);
        return userService.addUser(userBeanVo)>0;
    }

    @RequestMapping("/queryUser")
    public ResponseCode queryUserList(UserBeanVo userBeanVo){
        userBeanVo.setCode("0");

        return ResponseCode.success(userService.queryUser(userBeanVo));
    }

}
