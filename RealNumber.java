public class RealNumber {
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other) {
    if (value == 0 || other.value == 0) {
      return value == other.getValue();
    }
    return Math.abs((other.value - value) / value * 100) < 0.001;
  }

  public RealNumber add(RealNumber other) {
    RealNumber ans = new RealNumber(value + other.value);
    return ans;
  }

  public RealNumber multiply(RealNumber other) {
    RealNumber ans = new RealNumber(value * other.value);
    return ans;
  }

  public RealNumber divide(RealNumber other) {
    RealNumber ans = new RealNumber(value / other.value);
    return ans;
  }

  public RealNumber subtract(RealNumber other) {
    RealNumber ans = new RealNumber(value - other.value);
    return ans;
  }

}
