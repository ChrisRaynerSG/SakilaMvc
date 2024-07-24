package com.sparta.cr.sakilamvcproject;

import com.sparta.cr.sakilamvcproject.entities.Actor;
import com.sparta.cr.sakilamvcproject.services.ActorService;
import com.sparta.cr.sakilamvcproject.services.FilmService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ActorTest {

    @Autowired
    private ActorService service;

    @Autowired
    private FilmService filmService;

    @Test
    public void findByInt(){
        String expected = "GUINESS";
        String actual = service.findById(1).getLastName();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findByLastName(){
        int expected = 3;
        int actual = service.findByLastName("gui").size();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @Transactional
    void findAllActorsInFilm(){
        List<Actor> actors = service.findActorsInFilm(filmService.getFilmById(2));
        for(Actor actor : actors){
            System.out.println(actor.toString());
        }
    }
}
