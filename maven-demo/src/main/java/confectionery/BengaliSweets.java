package confectionery;

public class BengaliSweets extends Sweet {

	private int amt;
	public BengaliSweets(String sweetName, int sweetCal,int amount) {
		super(sweetName, sweetCal);
		// TODO Auto-generated constructor stub
		amt=amount;
	}
	public int weight() {
		int x=super.weight(amt);
		return x;
	}

}
