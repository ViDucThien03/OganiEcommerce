package com.spring.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapperBlogTags implements RowMapper<BlogTags> {
    @Override
    public BlogTags mapRow(ResultSet rs, int rowNum) throws SQLException {
        BlogTags tags = new BlogTags();
        tags.setTagid(rs.getInt("tagid"));
        tags.setTagName(rs.getNString("tagname"));
        return tags;
    }
}
