public class PacketOfChips extends Product {
    private int mass; 

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public PacketOfChips(String brand, String name, double price, int mass) {
        super(brand, name, price);
        this.mass = mass;
    }

    @Override
    public String displayInfo() {
        return String.format(
                "Упаковка с чипсами\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tМасса: %d]",
                brand, name, price, mass);
    }

}
