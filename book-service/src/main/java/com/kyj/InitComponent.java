package com.kyj;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.kyj.repository.BookRepository;

@Component
public class InitComponent {
  private final BookRepository bookRepository;
  
  private final String first;
  
  @Autowired
  public InitComponent(BookRepository bookRepository, @Value("${name.first}") String first) {
    this.bookRepository = bookRepository;
    this.first = first;
    System.out.println(first);
  }
  
  public String getFirst() {
    return first;
  }

  @PostConstruct
  public void init() {
    if (bookRepository.findAll().isEmpty()) {
      Book book1 = Book.builder().name("aaa").build();
      bookRepository.save(book1);
      Book book2 = Book.builder().name("bbb").build();
      bookRepository.save(book2);
      Book book3 = Book.builder().name("ccc").build();
      bookRepository.save(book3);
    }
  }
}
