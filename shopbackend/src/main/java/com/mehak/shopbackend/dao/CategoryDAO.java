package com.mehak.shopbackend.dao;

import java.util.List;

import com.mehak.shopbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);
}
