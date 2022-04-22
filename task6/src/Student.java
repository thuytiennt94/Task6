public class Student {
    private int Rollno;
    private String Name;
    public Student(){
        Rollno = 1;
        Name ="Anh";
    }
    public Student(int rollno, String name){
        this.Rollno = rollno;
        this.Name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "Rollno=" + Rollno + ", Name='" + Name + '\'' + '}';
    }
    public static void main(String[] args) {
        Student Std1 = new Student();
        System.out.println(Std1);


    }
}
