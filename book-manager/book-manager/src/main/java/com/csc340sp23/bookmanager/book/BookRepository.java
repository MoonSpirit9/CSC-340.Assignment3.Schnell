package com.csc340sp23.bookmanager.book;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sam Schnell
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
