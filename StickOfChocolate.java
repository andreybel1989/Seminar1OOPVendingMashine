public class StickOfChocolate extends Product {
    private int mass;
    private int energyValue;

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getEnergyValue() {
        return energyValue;
    }

    public void setenErgyValue(int energyValue) {
        this.energyValue = energyValue;
    }

    public StickOfChocolate(String brand, String name, double price, int mass, int energyValue) {
        super(brand, name, price);
        this.mass = mass;
        this.energyValue = energyValue;
    }

    @Override
    public String displayInfo() {
        return String.format(
                "Упаковка шоколада\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tМасса: %d\n\tЭнергетическая ценность: %d]",
                 brand, name, price, mass, energyValue);
            }
            
                

}
