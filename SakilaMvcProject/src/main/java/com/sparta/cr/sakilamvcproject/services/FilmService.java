package com.sparta.cr.sakilamvcproject.services;

import com.sparta.cr.sakilamvcproject.entities.Actor;
import com.sparta.cr.sakilamvcproject.entities.Film;
import com.sparta.cr.sakilamvcproject.repositories.FilmRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    private final FilmRepository filmRepository;
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }
    public Film getFilmById(int id) {
        return filmRepository.findById(id).orElse(null);
    }

    @Transactional
    public List<Film> getFilmsByActorId(int id) {
        return getAllFilms().stream().filter(film -> {
            Actor actor = film.getFilmActors().stream().filter(filmActor -> filmActor.getActor().getId()==id).findFirst().get().getActor();
            return actor != null;
        }).toList();
    }

    public List<Film> getFilmsByFilmName(String filmName) {
        return filmRepository.findAll().stream().filter(film -> film.getTitle().contains(filmName)).toList();
    }
//    public List<Film> getFilmsByCategory(String category) {
//        return filmRepository.findAll().stream().filter(film -> {
//            film.getFilmCategories().stream().filter(filmCategory -> filmCategory.getCategory().equals(category)).findFirst().get().getCategory();
//        }).toList();
//    }

}
