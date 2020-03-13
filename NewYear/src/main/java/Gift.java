import java.util.Scanner;

public class Gift {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int tw=0;
		int count=0;
		System.out.println("Enter min range of candy");
		int c_l=sc.nextInt();
		System.out.println("Enter max range of candy");
		int c_h=sc.nextInt();
		System.out.println("Enter how many choclates you want to enter");
		int c_n=sc.nextInt();
		Choclate c[]= new Choclate[c_n];
		for (int i=0;i<c_n;i++)
		{
			System.out.println("Enter the weight of "+(i+1)+"choclate");
			int w=sc.nextInt();
			c[i]=new Choclate(w);
			count=c[i].no_candy(c_l,c_h,count);
			tw=c[i].weight(tw);
		}
		System.out.println("Enter how many sweets you want to enter");
		int s_w=sc.nextInt();
		Sweet s[]= new Sweet[s_w];
		for (int i=0;i<s_w;i++)
		{
			System.out.println("Enter the weight of "+(i+1)+"sweet");
			int w=sc.nextInt();
			s[i]=new Sweet(w);
			count=s[i].no_candy(c_l,c_h,count);
			tw=s[i].weight(tw);
		}
		System.out.println("Total weigth of the box="+tw);
		System.out.println("count of candies ="+count);
		
		sc.close();
	}

}