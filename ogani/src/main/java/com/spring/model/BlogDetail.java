package com.spring.model;

import java.util.Date;

public class BlogDetail {
    private int blogid;
    private String content;
    private Date createDate;
    private String title;
    private String description;
    private String image;
    private int tagid;
    private int userid;

    public int getBlogid() {
        return blogid;
    }

    public void setBlogid(int blogid) {
        this.blogid = blogid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public BlogDetail() {
    }

    public BlogDetail(int blogid, String content, Date createDate, String title, String description, String image, int tagid, int userid) {
        this.blogid = blogid;
        this.content = content;
        this.createDate = createDate;
        this.title = title;
        this.description = description;
        this.image = image;
        this.tagid = tagid;
        this.userid = userid;
    }
}
