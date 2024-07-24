package com.sparta.cr.sakilamvcproject.services;

import com.sparta.cr.sakilamvcproject.entities.Actor;
import com.sparta.cr.sakilamvcproject.entities.Film;
import com.sparta.cr.sakilamvcproject.entities.FilmActor;
import com.sparta.cr.sakilamvcproject.repositories.ActorRepository;
import com.sparta.cr.sakilamvcproject.repositories.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final ActorRepository actorRepository;
    private final FilmRepository filmRepository;

    ActorService(ActorRepository actorRepository, FilmRepository filmRepository) {
        this.actorRepository = actorRepository;
        this.filmRepository = filmRepository;
    }

    public List<Actor> findAllActors() {
        return actorRepository.findAll();
    }
    public Actor findById(int id) {
        return actorRepository.findById(id).orElse(null);
    }
    public List<Actor> findByLastName(String name) {
        return actorRepository.findAll().stream().filter(actor -> actor.getLastName().toLowerCase().contains(name.toLowerCase())).toList();
    }
    public List<Actor> findByFirstName(String name) {
        return actorRepository.findAll().stream().filter(actor -> actor.getFirstName().contains(name)).toList();
    }
    public List<Actor> findActorsInFilm(Film film) {
        return film.getFilmActors().stream().map(FilmActor::getActor).toList();
    }
    public void save(Actor actor) {
        if(actorRepository.findById(actor.getId()).isEmpty()) {
            actorRepository.saveAndFlush(actor);
        }
    }

}
