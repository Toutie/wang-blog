package com.etoak.web.bean;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;


/**
 * <p>
 * 评论表
 * </p>
 *
 * @author wang
 * @since 2019-06-04
 */
@TableName("tb_comment")
@Data
public class CommentBean implements Serializable{

    private static final long serialVersionUID = 1L;

	private Integer id;
    /**
     * 评论文章的id
     */
	@TableField("articles_id")
	private Integer articlesId;
    /**
     * 评论人id
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 点赞数
     */
	@TableField("like_count")
	private Integer likeCount;
    /**
     * 评论内容
     */
	@TableField("comment_content")
	private String commentContent;
    /**
     * 评论时间
     */
	@TableField("comment_date")
	private Date commentDate;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getArticlesId() {
		return articlesId;
	}

	public void setArticlesId(Integer articlesId) {
		this.articlesId = articlesId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	@Override
	public String toString() {
		return "Comment{" +
			"id=" + id +
			", articlesId=" + articlesId +
			", userId=" + userId +
			", likeCount=" + likeCount +
			", commentContent=" + commentContent +
			", commentDate=" + commentDate +
			"}";
	}
}
