package confectionery;

public class Sweet {
	private String name;
    private int calorie;
    public Sweet(String sweetName,int sweetCal) {
  	  name=sweetName;
  	  calorie=sweetCal;
    }
    public int weight(int amount) {
  	  return amount*calorie;
    }
    public String sweetName() {
  	  return name;
  	  }
    public int sweetCal() {
  	  return calorie;
    }
}
