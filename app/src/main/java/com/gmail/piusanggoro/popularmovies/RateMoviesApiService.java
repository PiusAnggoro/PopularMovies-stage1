package com.gmail.piusanggoro.popularmovies;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by piusanggoro on 7/5/17.
 */

public interface RateMoviesApiService {
    @GET("/movie/top_rated")
    void getRateMovies(Callback<Movie.MovieResult> cb);
}