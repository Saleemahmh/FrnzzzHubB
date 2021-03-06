package com.frnzzzhubb.service;

import java.util.List;

import com.frnzzzhubb.model.Blog;



public interface BlogService {

	List<Blog> getAllblogs();

	boolean saveBlog(Blog blog);

	boolean updateStatus(Blog blog);

	void deleteBlog(String blogId);
	
	Blog getBlogById(String blogId);
	
	Blog updateBlog(String blogId , Blog blog);

	void increaseLikes(String blogId);
	
	void increaseDislikes(String blogId);
}
