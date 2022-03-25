
import java.nio.file.Paths;
import java.util.ArrayList; 
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        Recipe tempRecipe = new Recipe();
        
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        System.out.println("Commands: ");
        System.out.println("list - list the recipes");
        System.out.println("stop - stop the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        
        //Read a file given by user, then add the lines read on temporary recipe,
        //when a empty line appears the recipe is added and a new recipe is initiated
        //the process is repeated until the last line of the file
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
                        
                if (line.isEmpty()) {
                    recipes.add(tempRecipe);
                    tempRecipe = new Recipe();                            
                } else if (!line.isEmpty()) {
                    tempRecipe.add(line);
                }
            }
            recipes.add(tempRecipe);
        } catch (Exception e) {
        }
        
        while (true) {
            System.out.println("Enter command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            
            if (input.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    System.out.println(recipe);
                }
                System.out.println("");
            }
            //
            if (input.equals("find name")) {
                System.out.println("Searched word:");
                String searched = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.contains(searched)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println("");
            
            }
            
            if (input.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                String time = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.getTime() <= Integer.valueOf(time)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println("");
            }
            
            if (input.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.containsIngredient(ingredient)) {
                        System.out.println(recipe);
                    }
                }
                System.out.println("");
            }
        }
    }
}

