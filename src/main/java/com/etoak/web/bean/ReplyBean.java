package com.etoak.web.bean;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**回复表
 * @author wang
 */
@TableName("tb_reply")
@Data
public class ReplyBean implements Serializable {

    private int id;

    /**
     * 回复内容
     */
    @TableField("reply_content")
    private String replyContent;

    /**
     * 回复时间
     */
    @TableField("reply_date")
    private String replyDate;

    /**
     * 回复文章的id
     */
    @TableField("article_id")
    private int articleID;

    /**
     * 评论id
     */
    @TableField("comment_id")
    private int commentId;

    @TableField("user_id")
    private int userId;

}
