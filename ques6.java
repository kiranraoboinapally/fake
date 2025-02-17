//input a[]={8,2,1,3,5,6,9,0,4,7,10}
//output as largest odd number is 9
 
class ques6
{
public static void main(String args[])
	{
	int a[]={8,2,1,3,5,6,9,0,4,7,10,11};
	int temp=0;
	for(int x=0;x<a.length;x++)
		{
		for(int y=x+1;y<a.length;y++)
			{
			if(a[x]>a[y])
				{
				temp=a[x];
				a[x]=a[y];
				a[y]=temp;
				}
			}
		}
	int size;
	if(a.length%2==0)
	size=a.length/2;
	else
	size=a.length/2+1;
	int b[]=new int[size];
	int j=0;
	for(int x=0;x<a.length;x++)
		{
		if(a[x]%2!=0)
			{
			b[j++]=a[x];
			}
		}
	System.out.println(b[j-1]+" is the LArgest odd number in given array");
	}
}