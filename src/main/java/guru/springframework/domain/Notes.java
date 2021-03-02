package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
public class Notes {
	private String id;
	private Recipe recipe;
	private String recipeNotes;

}
