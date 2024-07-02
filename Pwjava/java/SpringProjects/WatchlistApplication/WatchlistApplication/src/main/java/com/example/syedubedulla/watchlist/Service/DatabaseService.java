package com.example.syedubedulla.watchlist.Service;

import com.example.syedubedulla.watchlist.entity.Movie;
import com.example.syedubedulla.watchlist.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseService
{
    @Autowired
    MovieRepo movieRepo;
    public void create(Movie movie)
    {
        movieRepo.save(movie);
    }
    public List<Movie> getAllMovies()
    {
        return movieRepo.findAll();
    }
    public Movie getMovieById(Integer id)
    {
        return movieRepo.findById(id).get();
    }

    public void update(Movie movie, Integer id)
    {
        Movie toBeUpdated = getMovieById(id);
        toBeUpdated.setTitle(movie.getTitle());
        toBeUpdated.setRating(movie.getRating());
        toBeUpdated.setComment(movie.getComment());
        toBeUpdated.setPriority(movie.getPriority());
        movieRepo.save(toBeUpdated);
    }
}
