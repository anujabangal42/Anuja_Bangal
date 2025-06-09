public class Fibonacci {
public static void main(String[] args) {
    int no1=10;
    int no2=0; int no3=1;

    System.out.println("the fibonnnacci series of given number is:");

    for(int i=0;i<=no1;i++){
        System.out.println(no2);
        int next= no2 + no3;
        no2=no3;
        no3=next;
    }

}
}
