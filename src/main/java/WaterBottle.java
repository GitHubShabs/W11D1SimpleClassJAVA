public class WaterBottle {
    private int volume;


 public WaterBottle(int volume) {
     this.volume = volume;
 }

  public int drink(){
    int result = this.volume - 10;
     return result;
  }

    public int emptyDrink(){
        int result = this.volume = 0;
        return result;
    }

    public int fullDrink(){
        int currentValue = this.volume;
        int topUp = 100 - currentValue;
        int result = currentValue + topUp;
        return result;
    }







}
