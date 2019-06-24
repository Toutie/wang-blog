package com.etoak.web.bean.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户
 *
 * @author wang
 */
@TableName("tb_user")
@Data
public class UserBeanVo implements Serializable {


    /**
     * id
     */
    private int id;

    /**
     * 用户名
     */
    @TableField("username")
    private String userName;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 是否启用
     */
    @TableField("is_enable")
    private int isEnable;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private String createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private String updateTime;

    private String code;


}
