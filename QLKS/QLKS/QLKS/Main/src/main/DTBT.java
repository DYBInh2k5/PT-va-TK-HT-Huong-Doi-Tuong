package main;
public class DTBT extends DTB {

    public DTBT() {
        super("Toán", 500);
    }

    @Override
    public String toString() {
        return "DTBT{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
    
}
