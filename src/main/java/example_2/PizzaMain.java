package example_2;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza bakedPizza = new PizzaFactory().bakePizza();
        System.out.println(bakedPizza);
    }
}
