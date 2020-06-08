import java.util.ArrayList;
import java.util.List;

public class Product implements Saveable{
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.category + " | " + this.price;
    }

    @Override
    // to insert the values to an arraylist and return the arraylist
    public List<String> write() {
        List<String> values = new ArrayList<String>();

        values.add(0, this.name);
        values.add(1, this.category);
        values.add(2, String.valueOf(this.price));

        return values;
    }

    @Override
    // receive the arraylist and use them to recreate the state of the member variables of the object
    public void read(List<String> readValues) {
        if (readValues != null && readValues.size() > 0) {
            this.name = readValues.get(0);
            this.category = readValues.get(1);
            this.price = Double.parseDouble(readValues.get(2));
        }
    }


}
