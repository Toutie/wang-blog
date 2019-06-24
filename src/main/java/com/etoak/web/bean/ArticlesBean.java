package com.etoak.web.bean;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**文章表
 * @author wang
 */
@TableName("tb_articles")
@Data
public class ArticlesBean implements Serializable{



    private int id;

    /**
     * 文章标题
     */
    @TableField("title")
    private String title;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 发布时间
     */
    @TableField("release_time")
    private String releaseTime;

    /**
     * 评论数
     */
    @TableField("comment_count")
    private int commentCount;

    /**
     * 点赞数
     */
    @TableField("like_count")
    private int likeCount;

    /**
     * 发布者id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 标签
     */
    @TableField("label")
    private String label;
}
