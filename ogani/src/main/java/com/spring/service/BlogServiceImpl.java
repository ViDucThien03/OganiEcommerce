package com.spring.service;

import com.spring.dao.BlogDao;
import com.spring.model.BlogDetail;
import com.spring.model.BlogTags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogDao blogDao;
    @Override
    public List<BlogTags> getBlogTags() {
        return blogDao.getBlogTags();
    }

    @Override
    public List<BlogDetail> getBlogDetail() {
        return blogDao.getBlogDetail();
    }

    @Override
    public List<BlogDetail> getRecentNews() {
        return blogDao.getRecentNews();
    }

    @Override
    public List<BlogDetail> getByBlogTag(int tagid) {
        return blogDao.getByBlogTag(tagid);
    }

    @Override
    public BlogDetail getBlogByID(int blogid) {
        return blogDao.getBlogByID(blogid);
    }
}
