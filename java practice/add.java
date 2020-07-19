import java.util.*;
class add
{
void input(int a[][])
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
{
Scanner s=new Scanner(System.in);
a[i][j]=s.nextInt();
}
}
}
void add(int q[][],int w[][])
{
int u[][]=new int[q.length][q[0].length];
for(int i=0;i<q.length;i++)
{
for(int j=0;j<w[0].length;j++)
{
u[i][j]=q[i][j]+w[i][j];
}
}
display(u);
}
void sub(int q[][],int w[][])
{
int u[][]=new int[q.length][q[0].length];
for(int i=0;i<q.length;i++)
{
for(int j=0;j<w[0].length;j++)
{
u[i][j]=q[i][j]-w[i][j];
}
}
display(u);
} 
void mul(int q[][],int w[][])
{
int u[][]=new int[q.length][q[0].length];
for(int i=0;i<q.length;i++)
{
for(int j=0;j<q[0].length;j++)
{
for(int k=0;k<w[0].length;k++)
{
u[i][j]=q[i][k]*w[k][j];
}
}
}
display(u);
}
void display(int d[][])
{
for(int m[]:d)
{
for(int ez:m)
{
	System.out.print(ez);
}
System.out.println();
}
}
public static void main(String x[])
{
int a[][],r,c,e,f,b[][],num;
add ob=new add();
Scanner Sc=new Scanner(System.in);
System.out.println("Enter Your choice:-");
System.out.println("Press 1 for addition:");
System.out.println("Press 2 for subtraction:");
System.out.println("Press 3 for mutiplication:");
num=Sc.nextInt();
r=Sc.nextInt();
c=Sc.nextInt();
a=new int[r][c];
b=new int[r][c];
ob.input(a);
ob.input(b);
if(num==1)
{
ob.add(a,b);
}
else if(num==2)
{
ob.sub(a,b);
}
else if(num==3)
{
e=Sc.nextInt();
f=Sc.nextInt();
a=new int[e][f];
b=new int[e][f];
ob.mul(a,b);
}
else
{
	System.out.print("Invalid Choice");
}
}
}