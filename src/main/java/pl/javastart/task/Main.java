package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink mojito = new Drink();
        mojito.name = "Mojito";
        mojito.price = 13.0;
        mojito.alcohol = true;

        Ingredient ingredient1 = new Ingredient();
        ingredient1.name = "woda\n";
        ingredient1.capacity = 70;

        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "sok cytrynowy\n";
        ingredient2.capacity = 70;

        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "wódka";
        ingredient3.capacity = 70;

        String fullIngredient = (ingredient1.name + ingredient2.name + ingredient3.name);
        int fullcapacity = (ingredient1.capacity + ingredient2.capacity + ingredient3.capacity);

        System.out.printf("Drink: %s%n", mojito.name);
        System.out.printf("Cena: %.1fzł%n", mojito.price);
        System.out.printf("Czy zawiera alkohol? %b%n", mojito.alcohol);
        System.out.printf("Składniki:%n%s%n", fullIngredient);
        System.out.printf("Pojemność: %dml", fullcapacity);
    }
}
