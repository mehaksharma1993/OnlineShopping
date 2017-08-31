package com.mehak.shopbackend.daoimpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mehak.shopbackend.dao.CategoryDAO;
import com.mehak.shopbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();

	static {

		Category category=new Category();
		category.setId(1);
		category.setName("TV");
		category.setDescription("This is some description for TV");
		category.setImageURL("CAT_1.png");
		
	    categories.add(category);
	    
	    //second category
	    category=new Category();
		category.setId(2);
		category.setName("CAKE");
		category.setDescription("This is some description for Cake");
		category.setImageURL("CAT_2.png");
		
	    categories.add(category);
	    
	    //third category
	    category=new Category();
		category.setId(3);
		category.setName("Pen");
		category.setDescription("This is some description for Pen");
		category.setImageURL("CAT_3.png");
		
	    categories.add(category);
	
	}

	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loops
		for(Category category : categories)
		{
			if(category.getId()==id) return category;
		}
		return null;
	}

}
