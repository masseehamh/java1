package exceptionalhandling;

public class product {
    int id;

    public product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        Name = name;
    }

    int price;
    String Name;

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }


}
