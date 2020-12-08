package com.example.SemTaskB9ZL3Q.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SemTaskB9ZL3Q.entity.Pool;
import com.example.SemTaskB9ZL3Q.repo.PoolRepository;

@Service
public class PoolService {

	@Autowired
    private PoolRepository poolRepository;

    public List<Pool> findAll() {
        return (List<Pool>) poolRepository.findAll();
    }

    public Pool findById(Integer id) {
        return poolRepository.findById(id).get();
    }

    public void save(Pool p) {
        poolRepository.save(p);
    }

    public void delete(Pool p) {
        poolRepository.delete(p);
    }

}
