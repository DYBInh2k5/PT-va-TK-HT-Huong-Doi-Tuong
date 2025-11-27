package main;
public class DTBC extends DTB {
    public DTBC() {
        super("Anh", 100);
    }

    @Override
    public String toString() {
        return "DTBC{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
