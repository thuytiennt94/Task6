public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem It = new InvoiceItem("1", "5", 300, 5000);
        System.out.println(It.toString());
        System.out.println(It);
        //System.out.println("ID: " + It.id + " desc " + It.desc + " qty " + It.qty +" unitPrice " + It.unitPrice);
        It.setQty(400);
        It.setUnitPrice(3500);
        System.out.println("Qty: " + It.getQty() + ",Price: " + It.getUnitPrice());
    }
}
