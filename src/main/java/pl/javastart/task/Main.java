package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink mojito = new Drink();
        mojito.name = "Mojito";
        mojito.price = 13.0;
        mojito.alcohol = true;

        Drink mojito1 = new Drink();
        mojito1.ingredient = "woda\n";
        mojito1.capacity = 70;

        Drink mojito2 = new Drink();
        mojito2.ingredient = "sok cytrynowy\n";
        mojito2.capacity = 70;

        Drink mojito3 = new Drink();
        mojito3.ingredient = "wódka";
        mojito3.capacity = 70;


        String fullIngredient = (mojito1.ingredient + mojito2.ingredient + mojito3.ingredient);
        int fullcapacity = (mojito1.capacity + mojito2.capacity + mojito3.capacity);

        System.out.printf("Drink: %s%n", mojito.name);
        System.out.printf("Cena: %.1fzł%n", mojito.price);
        System.out.printf("Czy zawiera alkohol? %b%n", mojito.alcohol);
        System.out.printf("Składniki:%n%s%n", fullIngredient);
        System.out.printf("Pojemność: %dml", fullcapacity);
    }
}
