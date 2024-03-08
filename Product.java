/**
 * Продукт
 */

public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public Product(String brand, String name, double price) {
        processBrand(brand);
        processName(name);
        processPrise(price);

    }

    public double getPrise() {
        return price;
    }

    public void setPrise(double price) {
        processPrise(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        processName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        processBrand(brand);
    }

    private void processPrise(double price) {
        if (price < 100) {
            this.price = 250;
        } else {
            this.price = price;
        }
    }

    private void processName(String name) {
        if (brand == null || brand.length() < 3) {
            this.name = "<name>";
        } else {
            this.name = name;
        }
    }

    private void processBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            this.brand = "<brand>";
        } else {

            this.brand = brand;
        }
    }

    public Product(String name, double price) {
        this("<brand>", name, price);

        // this.brand = "<brand>";

        // if (brand == null || brand.length() < 3) {
        // this.name = "<name>";
        // } else {
        // this.name = name;
        // }
        // if (price < 100) {
        // this.price = 250;
        // } else {
        // this.price = price;
        // }
    }

    public Product(String name) {
        this(name, 250);
        // this.brand = "<brand>";
        // this.price = 250;
        // if (brand == null || brand.length() < 3) {
        // this.name = "<name>";
        // } else {
        // this.name = name;
        // }

    }

    public Product() {
        this("<name>");
        // this.brand = "<brand>";
        // this.price = 250;
        // this.name = "<name>";
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", brand, name, price);
    }

}
