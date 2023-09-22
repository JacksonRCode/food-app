import java.util.Scanner;
import java.util.ArrayList;

public class Recipes {

    ArrayList<String> recipeList = new ArrayList<String>();
    int recipeCount = 0;

    public Recipes() {
        this.recipeList = new ArrayList<>();
    }

    public void addRecipe(String name) {
        recipeList.add(name);
        recipeCount++;
    }

    public void deleteRecipe(String name) {
        recipeList.remove(name);
        recipeCount--;
    }

    public String toString() {
        String string = "";
        for (int i=0; i < recipeCount-1; i++) {
            string += (String) recipeList.get(i) + ", ";
        }
        if (string!="") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            return "[]";
        }
        return string;
    }
    
    // public static void main(String[] args) {
    //     Scanner scanObj = new Scanner(System.in);
    //     System.out.println("Enter recipe name: ");

    //     String recipe = scanObj.nextLine();
    //     System.out.println(recipe);
    //     scanObj.close();

    // }

    
}