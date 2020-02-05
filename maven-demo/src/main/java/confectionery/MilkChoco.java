package confectionery;

public class MilkChoco extends Chocolate {
     private int height,width,amount;
	public MilkChoco(String chocoName, int chocoCal,int chocoHeight,int chocoWidth,int amt) {
		super(chocoName, chocoCal);
		// TODO Auto-generated constructor stub
		height=chocoHeight;
		width=chocoWidth;
		amount=amt;
	}
	public int weight() {
		int x=super.weight(height, width,amount);
		return x;
	}

}
