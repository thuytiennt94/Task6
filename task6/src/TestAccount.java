public class TestAccount {
    public static void main(String[] args) {
        Account ac1 = new Account("1", "Tien",20000);
        System.out.println(ac1.toString());
        //
        Account ac2 = new Account("1", "Nga", 25000);
        System.out.println(ac2);
        ac2.credit(5000);
        System.out.println(ac2);
        ac2.debit(14000);
        System.out.println(ac2);
        System.out.println("TranferTo: " +ac2.transferTo(ac1,200));
        System.out.println(ac2);
        System.out.println(ac1);
    }
}
