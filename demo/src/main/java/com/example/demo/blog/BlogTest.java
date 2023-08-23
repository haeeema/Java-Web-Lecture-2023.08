package com.example.demo.blog;

import java.util.List;

public class BlogTest {

	public static void main(String[] args) {
		BlogDao bDao = new BlogDao();
		
		// Insert
//		Blog blog = new Blog("Programer", "JAVA", "JAVA is OOP.");
//		bDao.insertBlog(blog);
		
		// list
//		Blog b = bDao.getBlog(3);

		List<Blog> list = bDao.getBlogList("title", "");
		for (Blog b: list)
			System.out.println(b);
	}

}
