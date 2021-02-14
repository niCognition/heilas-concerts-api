package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertService {

    @Autowired
    private ConcertRepository repo;

    public List<Concert> listAll() {
        return repo.findAll();
    }

    public void save(Concert concert) {
        repo.save(concert);
    }

    public Concert get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
