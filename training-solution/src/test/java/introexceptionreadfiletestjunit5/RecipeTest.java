package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecipeTest {
    private Recipe recipe;

    @BeforeEach
    void init() {
        recipe = new Recipe();
    }

    @Test
    void testRecipePrint() {
        List<String> recipeIngredientsList = recipe.addIngredients(Paths.get("src/test/resources/recipe.txt"));
        List<String> resultList = Arrays.asList("liszt", "margarin", "kristálycukor", "tojás", "citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj");
        assertEquals(resultList, recipeIngredientsList);
    }

    @Test
    void testRecipeFalse() {
        IllegalStateException exception = assertThrows(IllegalStateException.class, () ->
                recipe.addIngredients(Paths.get("src/test/resources/recipe.txt-")));
        assertEquals("Cannot read file!", exception.getMessage());
    }
}
