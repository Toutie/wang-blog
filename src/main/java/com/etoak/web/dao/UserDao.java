package com.etoak.web.dao;



import com.etoak.web.bean.vo.UserBeanVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**用户管理持久层接口
 * @author wang
 */
@Mapper

public interface UserDao {

    /**添加用户信息
     * @param userBeanVo
     * @return
     */
    int addUser(UserBeanVo userBeanVo);

    /**更改用户信息
     * @param userBeanVo
     * @return
     */
    int updateUser(UserBeanVo userBeanVo);

    /**查询用户信息
     * @param userBeanVo
     * @return
     */
    List<UserBeanVo> queryUserList(UserBeanVo userBeanVo);
}
