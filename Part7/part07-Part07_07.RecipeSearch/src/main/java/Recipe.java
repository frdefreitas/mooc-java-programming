
/**
 *
 * @author frdefreitas
 */
import java.util.ArrayList;

public class Recipe {
    private ArrayList<String> recipes;
    private ArrayList<String> ingredients;
    
    public Recipe() {
        this.recipes = new ArrayList<>();
        this.ingredients = new ArrayList<>();
    }
    
    public void add(String line) {
        this.recipes.add(line);
        if (this.recipes.size() > 2) {
            this.ingredients.add(line);
        }
    }
    
    public String getName() {
        return this.recipes.get(0);
    }
    
    public int getTime() {
        return Integer.valueOf(this.recipes.get(1));
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    @Override
    public String toString() {
        return this.getName() + ", cooking time: " + this.getTime();
    }
    
    public boolean contains(String searched) {
        return this.getName().toLowerCase().contains(searched.toLowerCase());
        
    }
    
    public boolean containsIngredient(String searched) {
        boolean status = false;
        for (String ingredient: ingredients) {
            if (ingredient.equals(searched)) {
                status = true;
            }
        }
        return status;
    }
}
