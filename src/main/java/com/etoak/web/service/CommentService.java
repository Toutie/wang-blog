package com.etoak.web.service;



import com.etoak.web.bean.CommentBean;

import java.util.List;

/**评论管理接口
 * @author wang
 */
public interface CommentService {

    /**文章添加
     * @param commentBean
     * @return
     */
    int addComment(CommentBean commentBean);

    /**文章修改
     * @param commentBean
     * @return
     */
    int updateComment(CommentBean commentBean);

    /**文章删除
     * @param id
     * @return
     */
    int deleteComment(String id);

    /**文章查询
     * @param commentBean
     * @return
     */
    List<CommentBean> queryComment(CommentBean commentBean);

}
