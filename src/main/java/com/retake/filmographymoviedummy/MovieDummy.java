package com.retake.filmographymoviedummy;

import lombok.Data;

public @Data class MovieDummy {
    private String name;
    private String movieID;

    public MovieDummy(){}

    public MovieDummy(String name, String movieID) {
        this.name = name;
        this.movieID = movieID;
    }
}
