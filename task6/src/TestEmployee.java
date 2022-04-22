public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Nguyễm" , "Ngân", 5000);
        System.out.println("ID: " + e1.id + ", FirstName " + e1.firstName + ", LastName " + e1.lastName + " and salary " + e1.salary);
        e1.setSalary(3000);
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("AnnulSalary: " + e1.getAnnulSalary());
        System.out.println("RaiseSalary: " + e1.raiseSalary(9));
    }
}
