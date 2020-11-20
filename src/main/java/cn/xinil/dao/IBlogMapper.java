package cn.xinil.dao;

import cn.xinil.domain.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBlogMapper {
    int addBlog(Blog blog);

    //使用if查询博客
    List<Blog> findBlogUseIf(@Param("author") String writer,
                             @Param("title") String t);

    List<Blog> findBlogUseChoose(@Param("author") String writer,
                                 @Param("title") String t);

    int updateBlogUseSet(@Param("id") int id,
                         @Param("title") String title,
                         @Param("views") int views);

    List<Blog> findBlogUseForeachById(@Param("ids") List<Integer> list);
}
