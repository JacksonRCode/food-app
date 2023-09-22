public class Main {

    public static void main(String[] args) {
        Recipes list = new Recipes();
        list.addRecipe("Boiled Hot Dogs");
        System.out.println(list.toString());
        list.addRecipe("Steak");
        System.out.println(list.toString());
        list.addRecipe("BBq");
        System.out.println(list.toString());
        list.addRecipe("GC");

        System.out.println(list.toString());
    }
}