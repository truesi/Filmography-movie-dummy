package com.retake.filmographymoviedummy;

import lombok.Data;

public @Data class MovieDummy {
    private String name;
    private String movieID;
    private String description;

    public MovieDummy(){}

    public MovieDummy(String movieId, String name, String description) {
        this.movieID = movieId;
        this.name = name;
        this.description = description;
    }
}
