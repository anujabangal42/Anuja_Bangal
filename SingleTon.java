public class SingleTon{

    // Singleton class
    static class Singleton {
        public String str; // public variable

        // static variable to hold one object
        private static Singleton instance;

        // private constructor
        private Singleton() {
            str = "This is a Singleton!";
        }

        // method to get the single object
        public static Singleton getSingleInstance() {
            if (instance == null) {
                instance = new Singleton(); // create only once
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        // get the singleton object
        Singleton obj1 = Singleton.getSingleInstance();
        System.out.println(obj1.str);

        // change the string
        obj1.str = "Changed the value";

        // get again
        Singleton obj2 = Singleton.getSingleInstance();
        System.out.println(obj2.str); // shows changed value
    }
}
