package com.example.SemTaskB9ZL3Q.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SemTaskB9ZL3Q.entity.Pool;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface PoolRepository extends CrudRepository<Pool, Integer> {

}