package com.mohit.betterreads.book;

import org.springframework.data.cassandra.repository.CassandraRepository;


public interface BookRepository extends CassandraRepository<Book, String>{
    
}
