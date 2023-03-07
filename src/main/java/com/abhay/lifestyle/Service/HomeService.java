package com.abhay.lifestyle.Service;


import com.abhay.lifestyle.Model.Movies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class HomeService {

    public List<Movies> getMovies() {

        List<Movies> movies = new ArrayList<>();

        Movies movie = new Movies(1,"https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F6%2F2015%2F06%2Fant-man-poster-02.jpg&q=60","Ant-Man","From the Studio that Brought you the AVENGERS");

        movies.add(movie);

        return movies;
    }
}
