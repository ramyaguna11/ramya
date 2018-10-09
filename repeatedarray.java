import java.io.*;
import java.util.*;
class unique
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int N = s.nextInt();
ArrayList l = new ArrayList();
ArrayList out1 = new ArrayList();
for(int i=0;i<N;i++)
{
l.add(s.nextInt());
}
while(l.isEmpty()!=true)
{ 
int t = (int)l.get(0);
int oc = Collections.frequency(l, t);
if(oc>1)
{
out1.add(t);
}
l.removeAll(Collections.singleton(t));
}
Collections.sort(out1);
if(out1.isEmpty()==true)
out1.add("unique");
Iterator it = out1.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}