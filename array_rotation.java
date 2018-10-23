import java.io.*;
import java.util.*;
class array_rotation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements in an array:");
int n = sc.nextInt();
System.out.println("Enter elements of array:");
int[] a = new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter number of rotations:");
int d = sc.nextInt();
int temp=0;
for(int i=0;i<d;i++)
{
temp=a[0];
for(int j=1;j<n;j++)
{
a[j-1]=a[j];
}
a[n-1]=temp;
System.out.println(Arrays.toString(a));
}
}
}