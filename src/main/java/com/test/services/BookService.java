package com.test.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.Entity.Book;
import com.test.dao.BookRepository;
@Component
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
//	private static List<Book>list  = new ArrayList<Book>();
//	static {
//		list.add(new Book(12,"Java Reference Book","XYZ"));
//		list.add(new Book(13,"Think Java","ABC"));
//		list.add(new Book(14,"Head First to Java","LMN"));
//	}
	//get all books
	public List<Book> getAllBooks(){
		List<Book> list = (List<Book>)this.bookRepository.findAll();
		return list;
	}
	
	//get single book id 
	public Book getBookById(int id) {
		Book b = null;
		try {
		//b=list.stream().filter(e->e.getId()==id).findFirst().get();
		b = this.bookRepository.findById(id);	
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	//adding the boook

	public Book addBook(Book b) {
		Book result = this.bookRepository.save(b);
		return result;
	}

	public void deleteBook(int bid) {
		// TODO Auto-generated method stub
//		list=list.stream().filter(book->{
//			if(book.getId()!=bid) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}).collect(Collectors.toList());
		this.bookRepository.deleteById(bid);
	}
	public void updateBook(Book book,int bookId) {
//		list=list.stream().map(b->{
//			if(b.getId()==bookId) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;
//		}).collect(Collectors.toList());
		book.setId(bookId);
		//this.bookRepository.save(book);
		this.bookRepository.save(book);
	}
}
