package com.sparta.cr.sakilamvcproject.repositories;

import com.sparta.cr.sakilamvcproject.entities.FilmText;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmTextRepository extends JpaRepository<FilmText, Short> {
}