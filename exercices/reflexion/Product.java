package exercices.reflexion;

public class Product {
	private int id;
    private String name;
    private float unitPrice;
    private int count;

    public Product(int id, String name, float unitPrice, int count) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return unitPrice * count;
    }
}
