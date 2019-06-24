package com.etoak.web.service;



import com.etoak.web.bean.vo.UserBeanVo;

import java.util.List;

/**
 * @author wang
 */
public interface UserService {

    /**添加用户
     * @param userBeanVo 用户vo类
     * @return
     */
    int addUser(UserBeanVo userBeanVo);

    /**修改用户信息
     * @param userBeanVo 用户vo类
     * @return
     */
    int updateUser(UserBeanVo userBeanVo);

    /**查询用户信息
     * @param userBeanVo
     * @return
     */
    List<UserBeanVo> queryUser(UserBeanVo userBeanVo);
}
