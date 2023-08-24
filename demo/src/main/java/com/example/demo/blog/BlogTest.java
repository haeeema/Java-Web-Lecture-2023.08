package com.example.demo.blog;

import java.util.List;

public class BlogTest {

	public static void main(String[] args) {
		BlogDao bDao = new BlogDao();
		
		// Insert
//		Blog blog = new Blog("Programer", "JAVA", "JAVA is OOP.");
//		bDao.insertBlog(blog);
		
		// find
//		Blog b = bDao.getBlog(3);

		
		// update
//		Blog blog = bDao.getBlog(4);
//		blog.setTitle("Python");
//		blog.setContent("Python is esay to learn");
//		bDao.updateBlog(blog);
		
		// delete
//		bDao.deleteBlog(3);
		
		// viewCount
		bDao.increaseViewCount(1);
		bDao.increaseViewCount(4);
		
		
		// list
		List<Blog> list = bDao.getBlogList("title", "");
		for (Blog b: list)
			System.out.println(b);
	}

}
