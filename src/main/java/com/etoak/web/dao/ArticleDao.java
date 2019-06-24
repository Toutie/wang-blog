package com.etoak.web.dao;

import com.etoak.web.bean.ArticlesBean;

import java.util.List;

/**文章管理持久层接口
 * @author wang
 */
public interface ArticleDao {


    /**添加文章
     * @param articlesBean
     * @return
     */
    public int addArticle(ArticlesBean articlesBean);

    /**修改文章
     * @param articlesBean
     * @return
     */
    public int updateArticle(ArticlesBean articlesBean);

    /**删除文章
     * @param id
     * @return
     */
    public int deleteArticle(int[] id);

    /**  查询文章列表
     * @param articlesBean
     * @return
     */
    public List<ArticlesBean> queryArticleList(ArticlesBean articlesBean);

}
