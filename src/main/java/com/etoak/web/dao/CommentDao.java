package com.etoak.web.dao;



import com.etoak.web.bean.CommentBean;

import java.util.List;

/**评论持久层接口
 * @author wang
 */
public interface CommentDao {

    /**add
     * @param commentBean
     * @return
     */
    int addComment(CommentBean commentBean);

    /**update
     * @param commentBean
     * @return
     */
    int updateComment(CommentBean commentBean);


    /**delete
     * @param id
     * @return
     */
    int deleteComment(String id);

    /**query
     * @param commentBean
     * @return
     */
    List<CommentBean> queryComment(CommentBean commentBean);

}
