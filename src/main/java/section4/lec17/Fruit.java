package section4.lec17;

public class Fruit {
    private final long id;
    private final String name;
    private final int price;

    public Fruit(long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
