package lk.acpt_maneth.demo;

public class VehicalNew {
    private String id;
    private String brand;
    private String model;
    private int no_of_gears;
    private double price;

    public VehicalNew(String id, String brand, String model, int no_of_gears, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.no_of_gears = no_of_gears;
        this.price = price;
    }

    @Override
    public String toString() {
        return "VehicalNew{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", no_of_gears=" + no_of_gears +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNo_of_gears() {
        return no_of_gears;
    }

    public void setNo_of_gears(int no_of_gears) {
        this.no_of_gears = no_of_gears;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
