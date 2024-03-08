import java.util.ArrayList;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Product product1 = new Product("brand #1", "name #1", 200);

        // product1.brand = "Brand #1";
        // product1.name = "name #1";
        // product1.price = 200;
        product1.setPrise(233);

        BottleOfWather bottleOfWather = new BottleOfWather("<Brand 2>", "name 2", 200, 1.5);
        System.out.println(bottleOfWather.displayInfo());

        Product bottleOfWather2 = new BottleOfWather("<Brand 100>", "name 2", 200, 1.5);
        System.out.println(bottleOfWather2.displayInfo());

        BottleOfMilk bottleOfMilk = new BottleOfMilk("<Brand 3>", "name 4", 400, 1.9, 50);
        System.out.println(bottleOfMilk.displayInfo());

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk);
        list.add(bottleOfWather);
    }
}