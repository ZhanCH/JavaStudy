public class House {
    private String color = "unKnow";
    private int price = 999;

    public House(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public House(String color) {
        this(color, 100);
    }

    public House() {
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }
}

