package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients;

    public List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }
    }

    public List<String> addIngredients(Path path) {
        List<String> recipeList = readFile(path);
        List<String> recipeIngredientsList = new ArrayList<>();
        for (String st: recipeList) {
            String[] recipeSplit = st.split(" ");
            recipeIngredientsList.add(recipeSplit[2]);
        }
        return recipeIngredientsList;
    }


    public List<String> getIngredients() {
        return ingredients;
    }

    public static void main(String[] args) {
        Recipe recipe = new Recipe();
        recipe.addIngredients(Path.of("C:/H/ujratervez2021/SEalapok1/java-sv2-labs/training-solution/src/main/java/introexceptionreadfiletestjunit5/recipe.txt"));
    }
}
