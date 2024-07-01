package com.spring.model;

public class BlogTags {
    private int tagid;
    private String tagName;

    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public BlogTags() {
    }

    public BlogTags(int tagid, String tagName) {
        this.tagid = tagid;
        this.tagName = tagName;
    }
}
