public class Product {
    private String name;
    private float price;
    private int Qty;
    private int id;
    public Product(){
        name = "But";
        price = 3500;
        Qty = 3;
        id = 1;
    }
    public Product(String N, float P){
        name = N;
        price = P;
        Qty = 3;
        id = 2;
    }
    public Product(String N, float P, int Q, int ID){
        name = N;
        price = P;
        Qty = Q;
        id = ID;
    }
    public String getName(){
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return Qty;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Product Pd = new Product();
        System.out.println("Name is " + Pd.getName());

        Pd.setPrice(3000);
        System.out.println("Price: " + Pd.getPrice());
        System.out.println("Qty " + Pd.getQty());
        System.out.println("ID: " + Pd.getId());
        /*
        Product Pd2 = new Product("Sach",20);
        System.out.println("Name is " + Pd2.getName());
        System.out.println("Price: " + Pd2.setPrice());
        System.out.println("Qty " + Pd2.getQty());
        System.out.println("ID: " + Pd2.getId());*/
    }
}
