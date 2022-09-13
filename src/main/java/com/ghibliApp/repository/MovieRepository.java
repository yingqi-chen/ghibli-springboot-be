package com.ghibliApp.repository;

import com.ghibliApp.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MovieRepository extends MongoRepository<Movie, String> {
//     long count();
//     Optional<Listing> findListingsByName(String name);
     List<Movie> findByTitle(String title);

}
