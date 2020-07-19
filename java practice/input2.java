import java.util.*;
class input2
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
void disp(int a[][])
{
for(int m[]:a)
for(int n:a)
System.out.print(n);
}
public static void main(String x[])
{
int a[][],r,c;
input2 ob=new input2();
Scanner Sc=new Scanner(System.in);
r=Sc.nextInt();
c=Sc.nextInt();
a=new int[r][c];
ob.input(a);
ob.disp(a);
}
}