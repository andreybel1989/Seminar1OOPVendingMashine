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
        // System.out.println(bottleOfWather.displayInfo());

        Product bottleOfWather2 = new BottleOfWather("<Brand 100>", "name 2", 200, 1.5);
        // System.out.println(bottleOfWather2.displayInfo());

        BottleOfMilk bottleOfMilk = new BottleOfMilk("<Brand 3>", "name 4", 400, 1.9, 50);
        // System.out.println(bottleOfMilk.displayInfo());

        Product bottleOfWother1 = new BottleOfWather("<Brand 3>", "name 3", 100, 2.36);
        // System.out.println(bottleOfWother1.displayInfo());
        Product packetOfChips = new PacketOfChips("<Brand 3>", "name 3", 100, 75);
        // System.out.println(packetOfChips.displayInfo());
        Product stickOfChocolate = new StickOfChocolate("<Brand 4>", "name 4", 100, 75, 2600);
        // System.out.println(stickOfChocolate.displayInfo());


        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk);
        list.add(bottleOfWather);
        list.add(packetOfChips);
        list.add(bottleOfWother1);
        list.add(bottleOfWather2);
        list.add(stickOfChocolate);

        VendingMashine vendingMashine = new VendingMashine(list);
        BottleOfWather bottleOfWatherRes = vendingMashine.getBottleOfWather("name 2", 1.5);
        if (bottleOfWatherRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWatherRes.displayInfo());
        } else {
            System.out.println("Такой бутылки с водой в автомате нет");
        }

        PacketOfChips packetOfChipsRes = vendingMashine.getPacketOfChips("name 3", 5);
        if (packetOfChipsRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(packetOfChipsRes.displayInfo());
        } else {
            System.out.println("Такой упаковки чипсов в автомате нет");
        }

        StickOfChocolate  stickOfChocolateRes = vendingMashine.getStickOfChocolate("name 4", 75, 2600);
        if (stickOfChocolateRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(stickOfChocolateRes.displayInfo());
        } else {
            System.out.println("Такой упаковки шоколада в автомате нет");
        }
    }
}
