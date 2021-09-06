import java.util.*;

class maxAndmin
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int large,small,i;
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
large=small=a[0];
for(i=1;i<n;++i)
{
    if(a[i]>large)
        large=a[i];

    if(a[i]<small)
        small=a[i];
}

System.out.print(“\nThe smallest element is ” + small );
System.out.print(“\nThe largest element is ” + large );
}
}
