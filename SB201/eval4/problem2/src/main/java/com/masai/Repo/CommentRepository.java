package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Comments;

public interface CommentRepository extends JpaRepository<Comments, Long> {

}
