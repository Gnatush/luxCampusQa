package Product;

public class Product {
    public int id;
    public String name;
    public double price;
    public String type;

    public Product(int id, String name, double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId () {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product{"
                + "id='" + id + '\''
                + ", name=" + name
                + ", price=" + price
                + ", type=" + type
                + '}';
    }
}
