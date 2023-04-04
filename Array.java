import java.util.*;
class Array
{
public static void main(String args[])
{
int i;
int a[]=new int[6];
Scanner sc=new Scanner(System.in);
System.out.println("Enter any five numbers:");
for(i=0;i<=5;i++)
{
a[i]=sc.nextInt();
}

int large=a[0];
int small=a[0];

for(i=0;i<=5;i++)
{
if(a[i]>large)
{
large=a[i];
}
if(a[i]<small)
{
small=a[i];
}
}
System.out.println("The largest number in array is "+ large);
System.out.println("The smallest number in array is "+ small);
}
}