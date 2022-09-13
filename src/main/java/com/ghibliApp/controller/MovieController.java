package com.ghibliApp.controller;

import com.ghibliApp.domain.Movie;
import com.ghibliApp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {

    @Autowired
    private MovieRepository repository;

    @GetMapping(value = "/movies")
    public Page<Movie> listings() {
        return repository.findAll(PageRequest.of(1, 10));
    }

    @GetMapping(value = "/movie-count")
    public String listingCount() {
        Long count = repository.count();
        return "There are total " + count + " movies";
    }

    @RequestMapping(value = "/movie/{name}", method = RequestMethod.GET)
    public List<Movie> findByTitle(@PathVariable(value = "name") String name) {
        return repository.findByTitle(name);
    }

}
