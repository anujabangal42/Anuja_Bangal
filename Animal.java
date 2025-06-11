// Single Inheritance

// class Animal {
// void sound(){
// System.out.println("Animal Sound");
// }
// }
// class dog extends Animal{
// void bark(){
// System.out.println("The dog is Barking");
// }

// public static void main(String[]args){
// dog d=new dog();
// d.bark();
// d.sound();
// }
// }

// Multilevel Inheritance

// public class Animal {
// public void sound(){
// System.out.println("Animal Sound");
// }
// }
// class Dog extends Animal{
// void bark(){
// System.out.println("The dog is Barking");
// }
// }

// class Cat extends Dog{
// void meows()
// {
// System.out.println("cat meows");
// }
// public static void main(String[]args)
// {
// Cat c= new Cat();
// c.meows();
// c.bark();
// c.sound();

// }
// }

// Hierachical Inheritance in java
public class Animal {
    public void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is Barking");
    }
}

class Cat extends Animal { 
    void meows() {
        System.out.println("cat meows");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.meows();
        c.sound();

    }
}
