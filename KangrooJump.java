import java.util.Scanner;
public class A {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int a[]=new int[4];
         for(int i=0;i<4;i++)
             a[i]=sc.nextInt();
         
         if(a[0]<a[2] && a[1]<=a[3])
         {
             System.out.print("NO");
             return;
         }
         
        while(true)
        {
            a[0]+=a[1];
            a[2]+=a[3];
            if(a[0]==a[2])
                {System.out.print("YES");
                return;}
            if(a[0]>a[2])
                {
                System.out.print("NO");
                return;
                }
            }
   
}
}
