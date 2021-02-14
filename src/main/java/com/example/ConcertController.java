package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ConcertController {

    @Autowired
    private ConcertService service;

    @GetMapping("/concerts")
    public List<Concert> list() {
        return service.listAll();
    }

    @GetMapping("/concerts/{id}")
    public ResponseEntity<Concert> get(@PathVariable Integer id) {
        try {
            Concert concert = service.get(id);
            return new ResponseEntity<>(concert, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/concerts")
    public void add(@RequestBody Concert concert) {
        service.save(concert);
    }

    @PutMapping("/concerts/{id}")
    public ResponseEntity<?> update(@RequestBody Concert concert,
                                    @PathVariable Integer id) {
        try {
            Concert existingConcert = service.get(id);
            service.save(concert);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/concerts/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
