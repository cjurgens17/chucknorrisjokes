package com.jokes.chucknorris.controllers;

import com.jokes.chucknorris.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    @RequestMapping({"/",""})
    public String joke(Model model){

        model.addAttribute("joke", jokeService.getjoke());

        return "index";
    }
}
