package com.masai.controller;

import java.util.List;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Comments;
import com.masai.service.CommentsSer;


@RestController
@RequestMapping("/api")
public class MyController {
	
	   @Autowired
	    private CommentsSer cs;

	    @PostMapping("/tutorials/{tutorialId}/comments")
	    public ResponseEntity<Comments> createComment(@PathVariable Long tutorialId, @RequestBody Comments comment) {
	        return cs.createComment(tutorialId, comment);
	    }

	    @GetMapping("/tutorials/{tutorialId}/comments")
	    public ResponseEntity<List<Comments>> getCommentsByTutorialId(@PathVariable Long tutorialId) {
	        return cs.getCommentsByTutorialId(tutorialId);
	    }

	    @GetMapping("/comments/{id}")
	    public ResponseEntity<Comments> getCommentById(@PathVariable Long id) {
	        return cs.getCommentById(id);
	    }

	    @PutMapping("/comments/{id}")
	    public ResponseEntity<Comments> updateComment(@PathVariable Long id, @RequestBody Comments comment) {
	        return cs.updateComment(id, comment);
	    }

	    @DeleteMapping("/comments/{id}")
	    public ResponseEntity<Void> deleteComment(@PathVariable Long id) {
	        return cs.deleteComment(id);
	    }

	    @DeleteMapping("/tutorials/{id}/comments")
	    public ResponseEntity<Void> deleteAllCommentsByTutorialId(@PathVariable Long id) {
	        
	        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	    }
}
