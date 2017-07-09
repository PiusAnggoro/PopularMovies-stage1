package com.gmail.piusanggoro.popularmovies;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by piusanggoro on 7/5/17.
 */

public interface PopularMoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}
