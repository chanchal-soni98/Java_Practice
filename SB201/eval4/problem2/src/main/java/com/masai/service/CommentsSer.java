package com.masai.service;

import java.util.List;
import java.util.Optional;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masai.Repo.CommentRepository;
import com.masai.model.Comments;
import com.masai.model.Totorials;

@Service
public class CommentsSer {
	
	 @Autowired
	    private CommentRepository cr;

	    public ResponseEntity<Comments> createComment(Long tutorialId, Comments comment) {
	        if(comment.getContext() == null) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	        }
	        Totorials t = new Totorials();
	        comment.setTutorial(t);
	        
	        Comments c = cr.save(comment);
	        return ResponseEntity.status(HttpStatus.OK).body(c);
	    }

	    public ResponseEntity<Optional<Comments>> getCommentsByTutorialId(Long tutorialId) {
	    	
	    	
	        Optional<Comments> comments = cr.findById(tutorialId);
	        		
	        return ResponseEntity.status(HttpStatus.OK).body(comments);
	    }

	    public ResponseEntity<Comments> getCommentById(Long commentId) {
	    	
	    	
	        Comments comment = cr.findById(commentId).orElse(null);
	        if(comment == null) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	        }
	        return ResponseEntity.status(HttpStatus.OK).body(comment);
	    }

	    public ResponseEntity<Comments> updateComment(Long commentId, Comments comment) {
	        if(comment.getContext() == null) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	        }
	        Comments oldComment = cr.findById(commentId).orElse(null);
	        if(oldComment == null) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	        }
	        oldComment.setContext(comment.getContext());
	        Comments updatedComment = cr.save(oldComment);
	        return ResponseEntity.status(HttpStatus.OK).body(updatedComment);
	    }

	    public ResponseEntity<Void> deleteComment(Long commentId) {
	        Comments comment = cr.findById(commentId).orElse(null);
	        if(comment == null) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	        }
	        cr.delete(comment);
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	    }


}
