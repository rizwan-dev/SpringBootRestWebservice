package com.riztech.springboot.service;


import java.util.List;

import com.kswaughs.services.booksvc.Book;
import com.riztech.springboot.model.Movie;
import com.riztech.springboot.model.User;

public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers();
	
	List<Movie> findAllMovies();
	
	void deleteAllUsers();
	
	boolean isUserExist(User user);
	
	void addBook(Book book);
	
}
