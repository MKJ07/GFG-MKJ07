/*using a pair class we can solve the problem */
/*N = 6
A[] = {3, 2, 1, 56, 10000, 167} */
import java.util.*;
public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        maxmin t=new maxmin();
        pair p=t.getMinMax(a, n);
        System.out.println(p.f+" "+p.s);
        sc.close();
    }

    

    
}
class pair{
    long f,s;
    public pair(long f,long s){
        this.f=f;
        this.s=s;

    }
}
class maxmin {
    public pair getMinMax(long a[], long n){
        long min=a[0];
        long max =a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        return new pair(min,max);
        
    }
}
    

