package com.example.sql.mongodb;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Mongorepository extends MongoRepository<MongoEntity, Long> {
}