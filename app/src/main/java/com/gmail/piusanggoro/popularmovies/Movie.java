package com.gmail.piusanggoro.popularmovies;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by piusanggoro on 7/5/17.
 */

public class Movie implements Parcelable {
    private String title;
    @SerializedName("poster_path")
    private String poster;
    @SerializedName("overview")
    private String description;
    @SerializedName("backdrop_path")
    private String backdrop;
    @SerializedName("release_date")
    private String movie_release_date;
    @SerializedName("vote_average")
    private String average_vote;
    @SerializedName("vote_count")
    private String count_vote;

    public Movie() {
    }

    protected Movie(Parcel in) {
        title = in.readString();
        poster = in.readString();
        description = in.readString();
        backdrop = in.readString();
        average_vote = in.readString();
        movie_release_date = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return "http://image.tmdb.org/t/p/w500" + poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBackdrop() {
        return "http://image.tmdb.org/t/p/w500" + backdrop;
    }

    public void setBackdrop(String backdrop) {
        this.backdrop = backdrop;
    }

    public String getAverageVote() {
        return average_vote;
    }

    public void setAverageVote(String description) {
        this.average_vote = average_vote;
    }

    public String getReleasedate() {
        return movie_release_date;
    }

    public void setReleasedate(String description) {
        this.movie_release_date = movie_release_date;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(poster);
        parcel.writeString(description);
        parcel.writeString(backdrop);
        parcel.writeString(average_vote);
        parcel.writeString(movie_release_date);
    }

    public static class MovieResult {
        private List<Movie> results;
        public List<Movie> getResults() {
            return results;
        }
    }
}
