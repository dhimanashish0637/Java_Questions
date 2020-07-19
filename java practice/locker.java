import java.util.*;
class locker
{
	public static void main(String x[])
	{
     int i,j=0;
     int arr[]=new int[100];
     for(i=0;i<50;i++)
     {
       arr[i]=0;
     }
     for(i=0;i<50;i++)
     {
     	if(arr[i]==0)
     	{
         arr[i]=1;
     	}
     	if(j!=0 && j!=1)
     	{
     	for(j=i+1;j<50;j=j+i)
     	{
     		if(arr[j]==0)
     		{
     			arr[j]=1;
     		}
     		else if(arr[j]==1)
     		{
     			arr[j]=0;
     		}
     	}
     	}
     	else 
     	{
     		for(j=i+1;j<50;j++)
     	{
     		if(arr[j]==0)
     		{
     			arr[j]=1;
     		}
     		else if(arr[j]==1)
     		{
     			arr[j]=0;
     		}
     	}
     	}
     }
     for(i=0;i<50;i++)
     {
       System.out.print(arr[i]);
     }
	}
}