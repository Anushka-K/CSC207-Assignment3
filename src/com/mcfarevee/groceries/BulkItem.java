package com.mcfarevee.groceries;

<<<<<<< HEAD
import java.lang.String;

public class BulkItem implements Item{
=======
public class BulkItem implements Item {
>>>>>>> 1b29004d88478a30367943283bb03dd050b4182d
  private BulkFood food;
  private Unit unit;
  private int amount;



  public BulkItem(BulkFood food, Unit unit, int quantity) {
    this.food = food;
    this.unit = unit;
    this.amount = quantity;
  }


  /*
   * public String toString() { String answer= String.valueOf(this.amount);
   * 
   * return answer;
   * 
   * } public String getWeight() { String weight= String.valueOf(this.amount) +unit; return weight;
   * }
   */

  public String toString() {
    String answer =
        String.valueOf(this.amount) + this.unit.toString() + " of " + this.food.toString();
    return answer;
  }

  public int getPrice() {
    int price = (this.amount) * (this.food.getPricePerUnit());
    return price;
  }

  public Weight getWeight() {
    return new Weight(this.unit, this.amount);
  }


  public boolean equals(Object other) {
    if (other instanceof BulkItem) {
      BulkItem otherbi = (BulkItem) other;
      if ((this.food == otherbi.food) && (this.unit == otherbi.unit) 
          && (this.amount == otherbi.amount)) {
        return true;
      } else
        return false;
    } else
      return false;
  }


  public static void main(String[] args) {

    BulkFood bf = new BulkFood("khana", Unit.OUNCE, 50, 4);
    BulkItem item = new BulkItem(bf, Unit.OUNCE, 6);
    BulkItem item2 = new BulkItem(bf, Unit.OUNCE, 3);
    System.out.print(item2.getWeight());
  }
}
