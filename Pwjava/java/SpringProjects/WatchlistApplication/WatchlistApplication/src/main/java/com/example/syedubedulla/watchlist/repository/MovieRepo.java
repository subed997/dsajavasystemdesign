package com.example.syedubedulla.watchlist.repository;

import com.example.syedubedulla.watchlist.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {
}
