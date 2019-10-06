package com.example.jokeapp.controllers;

import com.example.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = {"/", ""})
    public String getJokes(Model model) {
        model.addAttribute("joke", jokeService.getRandomQuotes());
        return "chucknorris";
    }
}
