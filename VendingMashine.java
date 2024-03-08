import java.util.List;

public class VendingMashine {

    private List<Product> products;

    public VendingMashine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWather getBottleOfWather(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWather) {
                BottleOfWather bottleOfWather = (BottleOfWather) product;
                if (bottleOfWather.getName().equals(name) && bottleOfWather.getVolume() == volume) {
                    return bottleOfWather;
                }
            }
        }
        return null;
    }

    public PacketOfChips getPacketOfChips(String name, int mass) {
        for (Product product : products) {
            if (product instanceof PacketOfChips) {
                PacketOfChips packetOfChips = (PacketOfChips) product;
                if (packetOfChips.getName().equals(name) && packetOfChips.getMass() == mass) {
                    return packetOfChips;
                }
            }
        }
        return null;
    }

    public StickOfChocolate getStickOfChocolate(String name, int mass, int energyValue) {
        for (Product product : products) {
            if (product instanceof StickOfChocolate) {
                StickOfChocolate stickOfChocolate = (StickOfChocolate) product;
                if (stickOfChocolate.getName().equals(name) && stickOfChocolate.getMass() == mass && stickOfChocolate.getEnergyValue() == energyValue) {
                    return stickOfChocolate;
                }
            }
        }
        return null;
    }

}
