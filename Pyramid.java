import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
    int i,j,n;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter The Number");
    n=scan.nextInt();
    
    for( i=1;i<=n;i++){
        for(j=1;j<=i;j++)
        {
         System.out.print("*");
        }
        System.out.println();
    }
  }
}


    