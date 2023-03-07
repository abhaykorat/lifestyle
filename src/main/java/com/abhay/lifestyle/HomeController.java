package com.abhay.lifestyle;

import com.abhay.lifestyle.Model.Movies;
import com.abhay.lifestyle.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public  String index(){
        return "index";
    }
    @GetMapping("/index.html")
    public  String index1(){
        return "index.html";
    }


    @GetMapping("/movies.html")
    public  String movies(Model model){
        model.addAttribute("Movies.html",homeService.getMovies());
        return "movies.html";
    }

    @GetMapping("/tv.html")
    public  String tv(){
        return "tv.html";
    }

    @GetMapping("/celebs.html")
    public  String celebs(){
        return "celebs.html";
    }
}
