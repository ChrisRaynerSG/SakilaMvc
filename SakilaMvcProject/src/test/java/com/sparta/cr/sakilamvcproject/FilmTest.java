package com.sparta.cr.sakilamvcproject;

import com.sparta.cr.sakilamvcproject.entities.Film;
import com.sparta.cr.sakilamvcproject.services.ActorService;
import com.sparta.cr.sakilamvcproject.services.FilmService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FilmTest {

    @Autowired
    FilmService filmService;

    @Autowired
    ActorService actorService;

    @Test
    @Transactional
    void getAllFilmsByActor(){
        List<Film> filmList= filmService.getFilmsByActorId(1);
        for(Film film:filmList){
            System.out.println(film.toString());
        }
    }
}
