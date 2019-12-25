import java.util.Scanner;
public class A {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         int a[]=new int[n],b[]=new int[m],max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
         
         for(int i=0;i<n;i++)
             {a[i]=sc.nextInt();
             if(a[i]>max)    max=a[i];
             }
         for(int i=0;i<m;i++)
             {b[i]=sc.nextInt();
             if(b[i]<min)    min=b[i];
             }    
         int ele=max,y=0,c=0;
         while(ele<=min)
         {
             y=1;
             for(int i=0;i<n;i++)
             {
                 if(ele%a[i]!=0) {
                     y=0;
                     break;
                 }
             }
                 if(y==1) {
                     
                     for(int i=0;i<m;i++) {
                         
                         if((b[i]%ele)!=0) {
                             y=0;
                             break;
                         }                        
                         
                     }
                     if(y==1) 
                     c++;
                 }
             ele++;
            
         }
         
     System.out.print(c);             
       
}
}
