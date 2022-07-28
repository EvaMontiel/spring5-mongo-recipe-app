package guru.springframework.spring5recipeapp.commands;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
	
	private String id;
	private String recipeId;
	private String description;
	private BigDecimal amount;
	private UnitOfMeasureCommand uom;
}
