package com.etoak.web.service.serviceimpl;


import com.etoak.web.bean.vo.UserBeanVo;
import com.etoak.web.dao.UserDao;
import com.etoak.web.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**用户管理实现类
 * @author wang
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserDao userDao;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addUser(UserBeanVo userBeanVo) {

        return userDao.addUser(userBeanVo);
    }

    @Override
    public int updateUser(UserBeanVo userBeanVo) {
        return userDao.updateUser(userBeanVo);
    }

    @Override
    public List<UserBeanVo> queryUser(UserBeanVo userBeanVo) {
        log.info("userBean:{}",userBeanVo);
        return userDao.queryUserList(userBeanVo);
    }
}
