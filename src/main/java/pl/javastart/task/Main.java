package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink mojito = new Drink();
        mojito.name = "Mojito";
        mojito.price = 13.0;
        mojito.alcohol = true;

        mojito.ingredient1 = new Ingredient();
        mojito.ingredient1.name = "woda\n";
        mojito.ingredient1.capacity = 70;

        mojito.ingredient2 = new Ingredient();
        mojito.ingredient2.name = "sok cytrynowy\n";
        mojito.ingredient2.capacity = 70;

        mojito.ingredient3 = new Ingredient();
        mojito.ingredient3.name = "wódka";
        mojito.ingredient3.capacity = 70;

        String fullIngredient = (mojito.ingredient1.name + mojito.ingredient2.name + mojito.ingredient3.name);
        int fullcapacity = (mojito.ingredient1.capacity + mojito.ingredient2.capacity + mojito.ingredient3.capacity);

        System.out.printf("Drink: %s%n", mojito.name);
        System.out.printf("Cena: %.1fzł%n", mojito.price);
        System.out.printf("Czy zawiera alkohol? %b%n", mojito.alcohol);
        System.out.printf("Składniki:%n%s%n", fullIngredient);
        System.out.printf("Pojemność: %dml", fullcapacity);
    }
}
