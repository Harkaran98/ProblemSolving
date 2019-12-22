import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         long a[]=new long[n],max=Long.MIN_VALUE,count=0;
             for(int i=0;i<n;i++)
                {a[i]=sc.nextLong();
                if(max<a[i])
                    max=a[i];
                }
                for(int i=0;i<n;i++)
                {
                if(max==a[i])
                    count++;
                }
             
         System.out.println(count);     
            sc.close();
            

}
}
