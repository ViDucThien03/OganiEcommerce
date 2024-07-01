package com.spring.dao;

import com.spring.model.BlogDetail;
import com.spring.model.BlogTags;
import com.spring.model.MapperBlogDetail;
import com.spring.model.MapperBlogTags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BlogDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<BlogTags> getBlogTags(){
        List<BlogTags> list = new ArrayList<BlogTags>();
        String sql = "select* from blogtag";
        list = jdbcTemplate.query(sql, new MapperBlogTags());
        return list;
    }
    public List<BlogDetail> getBlogDetail(){
        List<BlogDetail> listblog = new ArrayList<BlogDetail>();
        String sql = "select * from blog";
        listblog = jdbcTemplate.query(sql, new MapperBlogDetail());
        return listblog;
    }
    public List<BlogDetail> getRecentNews(){
        List<BlogDetail> listblog = new ArrayList<BlogDetail>();
        String sql = "SELECT * FROM blog WHERE createdate >= DATE_SUB(NOW(), INTERVAL 7 DAY)";
        listblog = jdbcTemplate.query(sql, new MapperBlogDetail());
        return listblog;
    }
    public List<BlogDetail> getByBlogTag(int tagid){
        String sql = "select * from blog where tagid=?";
        return jdbcTemplate.query(sql, new Object[]{tagid}, new MapperBlogDetail());

    }
    public BlogDetail getBlogByID(int blogid){
        String sql  = "select * from blog where blogid=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{blogid}, new MapperBlogDetail());
    }
}
