import java.util.Scanner;

public class Recipes {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter recipe name: ");

        String recipe = scanObj.nextLine();
        System.out.println(recipe);
        scanObj.close();

    }
}