package main;
public class DTBV extends DTB {
    public DTBV() {
        super("Văn", 300);
    }

    @Override
    public String toString() {
        return "DTBV{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

