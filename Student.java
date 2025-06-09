public class Student {
    String name;
    int age;
void display(){
    System.out.println(this.name);
    System.out.println(this.age);
}
public static void main(String[] args) {
    Student s1=new Student();
    s1.name="Anuja";
    s1.age=21;
    s1.display();
}
}
