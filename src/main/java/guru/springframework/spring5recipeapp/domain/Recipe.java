package guru.springframework.spring5recipeapp.domain;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Recipe {

	private String id;

	private String description;
	private Integer prepTime;
	private Integer cookTime;
	private Integer servings;
	private String source;
	private String url;
	
	private String directions;

	private Byte[] image;

	private Difficulty difficulty;

	private Notes notes;

	private Set<Ingredient> ingredients = new HashSet<>();

	private Set<Category> categories = new HashSet<>();

	public void setNotes(Notes notes) {
		if(notes != null) {
			this.notes = notes;
			notes.setRecipe(this);
		}
	}
	
	public Recipe addIngredient(Ingredient ingredient) {
		ingredient.setRecipe(this);
		this.getIngredients().add(ingredient);
		return this;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
		ingredients.forEach(ingredient -> ingredient.setRecipe(this));
	}

}
