package exercices.reflexion;

import exercices.annotations.JsonIgnore;
import exercices.annotations.JsonProperty;
import exercices.annotations.JsonStrategy;
import exercices.annotations.JsonVisibility;

@JsonStrategy(JsonVisibility.GETTER)
//@JsonStrategy(JsonVisibility.FIELDS)
//@JsonStrategy(JsonVisibility.GETTER_FIELDS)
public class Product {
	
	private int id;
	
    @JsonProperty("nom")
    private String name;
    
    private float unitPrice;
    
    private int count;

    public Product(int id, String name, float unitPrice, int count) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.count = count;
    }

    @JsonIgnore
    public int getId() {
        return id;
    }
    
    @JsonProperty("nom")
    public String getName() {
        return name;
    }
    
    @JsonProperty("prix")
    public float getPrice() {
        return unitPrice * count;
    }
}
