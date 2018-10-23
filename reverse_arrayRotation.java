import java.io.*;
import java.util.*;
class reverse_arrayRotation
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
int t = d%n;
reverse(a,0,t-1);
reverse(a,t,n-1);
reverse(a,0,n-1);
System.out.println(Arrays.toString(a));
}
static void reverse(int a[],int start,int end)
{
int i=0,j=0,tmp=0;
System.out.println("reverse");
for(i=start,j=end;i<j;i++,j--)
{
tmp=a[i];
a[i]=a[j];
a[j]=tmp;
}
}
}