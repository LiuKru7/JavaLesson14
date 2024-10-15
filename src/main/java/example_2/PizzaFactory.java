package example_2;

public class PizzaFactory {

    public Pizza bakePizza() {
        Pizza pizza = new Pizza();
        addName(pizza);
        addSauce(pizza);
        String[] ingredients = getIngredients();
        addIngredients(pizza, ingredients);
        bake(pizza);
        return pizza;
    }

    private  void bake(Pizza pizza) {
        System.out.println("Finally baking my pizza!");
        pizza.setBaked(true);
    }

    private  void addIngredients(Pizza pizza, String[] ingredients) {
        System.out.println("Adding ingredients for my pizza");
        pizza.setIngredients(ingredients);
    }

    private  String[] getIngredients() {
        System.out.println("Create ingrediens for my pizza.");
        String cheese = "Cheddar";
        String topping = "Salami";
        return new String[]{cheese, topping};
    }

    private void addSauce(Pizza diavola) {
        System.out.println("Creating ingredients for my pizza!");
        diavola.setSauceType("Marinara and majonezas");
    }

    private void addName(Pizza diavola) {
        System.out.println("Addding name to my pizza!");
        diavola.setName("Diavola");
    }

}
