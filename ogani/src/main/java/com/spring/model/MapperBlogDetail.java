package com.spring.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapperBlogDetail implements RowMapper<BlogDetail> {
    @Override
    public BlogDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
        BlogDetail detail = new BlogDetail();
        detail.setBlogid(rs.getInt("blogid"));
        detail.setContent(rs.getNString("content"));
        detail.setTitle(rs.getNString("title"));
        detail.setDescription(rs.getNString("description"));
        detail.setImage(rs.getString("image"));
        detail.setCreateDate(rs.getDate("createdate"));
        detail.setTagid(rs.getInt("tagid"));
        detail.setUserid(rs.getInt("userid"));
        return detail;
    }
}
