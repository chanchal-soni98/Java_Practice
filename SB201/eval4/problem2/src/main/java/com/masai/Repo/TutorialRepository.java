package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Totorials;

public interface TutorialRepository extends JpaRepository<Totorials, Long> {
}
