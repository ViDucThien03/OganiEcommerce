package com.spring.service;

import com.spring.model.BlogDetail;
import com.spring.model.BlogTags;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BlogService {
    public List<BlogTags> getBlogTags();
    public List<BlogDetail> getBlogDetail();
    public List<BlogDetail> getRecentNews();
    public List<BlogDetail> getByBlogTag(int tagid);
    public BlogDetail getBlogByID(int blogid);
}
