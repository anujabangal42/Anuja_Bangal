public class Sum {
    public static void main(String[] args) {
        int i;
        int a=0;
        for(i=1;i<100;i++)
        {
            a=a+i;
        
            if(a==6)
            { 
                continue;
               
            }
            System.out.println("the sum of 1 to 100:"+a);
        }
        
    }
}
