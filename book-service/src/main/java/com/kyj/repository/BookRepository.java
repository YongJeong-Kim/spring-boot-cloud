package com.kyj.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kyj.Book;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, String> {
  Optional<Book> findById(String id);
}
