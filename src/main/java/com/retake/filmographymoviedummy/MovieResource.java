package com.retake.filmographymoviedummy;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("/{movieID}")
    public MovieDummy getMovies(@PathVariable String movieID){
        return new MovieDummy("Test Nname", movieID);
    }
}
