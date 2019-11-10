package com.retake.filmographymoviedummy;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public @Data class MovieSumUp {
    private String id;
    private String title;
    private String overview;

    public String getId() {
        return id;
    }

    public String getOverview() {
        return overview;
    }

    public String getTitle() {
        return title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
