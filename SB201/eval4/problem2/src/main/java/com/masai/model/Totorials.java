package com.masai.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Totorials {
	@NotNull(message="id value should not be null")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Min(50)
	@NotNull(message="title value should not be null")
	private String Title;
	@Min(200)
	@NotNull(message="desc value should not be null")
	private String descrition;
	@NotNull(message="published value should not be null")
	private boolean published;
	
	@OneToMany(mappedBy = "tutorial", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	   private List<Comments> comments;
	

}
