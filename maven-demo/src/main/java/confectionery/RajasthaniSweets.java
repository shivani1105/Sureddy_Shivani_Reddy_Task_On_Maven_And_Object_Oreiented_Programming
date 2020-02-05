package confectionery;

public class RajasthaniSweets extends Sweet {

	private int amt;
	public RajasthaniSweets(String sweetName, int sweetCal,int amount) {
		super(sweetName, sweetCal);
		// TODO Auto-generated constructor stub
		amt=amount;
	}
	public int weight() {
		int x=super.weight(amt);
		return x;
	}

}
