public class Factorial {
    public static void main(String[] args) {
        int number=10;
        int Factorial=1;

        for(int i=Factorial;i<number;i++){
            Factorial=Factorial*i;
            System.out.println("The factorial of the given number is:"+Factorial);
        }
    }
}
