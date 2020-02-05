package confectionery;

public class Chocolate {
      private String name;
      private int calorie;
      public Chocolate(String chocoName,int chocoCal) {
    	  name=chocoName;
    	  calorie=chocoCal;
      }
      public int weight(int height,int width,int amt) {
    	  return amt*height*width*(calorie/100);
      }
      public String chocoName() {
    	  return name;
    	  }
      public int chocoCal() {
    	  return calorie;
      }
}