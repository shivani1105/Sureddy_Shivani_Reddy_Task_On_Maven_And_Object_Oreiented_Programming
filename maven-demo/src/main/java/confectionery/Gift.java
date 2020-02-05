package confectionery;
import java.util.*;
public class Gift {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MilkChoco mc = new  MilkChoco("Kit Kat",100,12,5,2);
		 System.out.println(mc.chocoName() + ": " + mc.chocoCal()+" calories");
		 DarkChoco dc=new DarkChoco("Bournville",200,20,6,3);
		 System.out.println(dc.chocoName() + ": " + dc.chocoCal()+" calories");
		 BengaliSweets bs=new BengaliSweets("Rasugulla",200,10);
		 System.out.println(bs.sweetName()+": "+bs.sweetCal()+" calories");
		 RajasthaniSweets rs=new RajasthaniSweets("Kaju Kathli",300,5);
		 System.out.println(rs.sweetName()+": "+rs.sweetCal()+" calories");
		 int totalWeight=mc.weight()+dc.weight();
		 System.out.println("the total weight of chocolates is" +totalWeight+ " gm");
		 System.out.println("enter candy code in your gift");
		 String s=sc.next();
		 String candies[]= {"a","b","c","d","e"};
		 int c=0;
		 for(int i=0;i<5;i++) {
			 if(s.compareTo(candies[i])==0)
				 c++;
			 else
				 c=c+0;
		 }
		 if(c>0)
			 System.out.println("Happy New Year");
		 else
			 System.out.println("You have no candies");
	}
}
