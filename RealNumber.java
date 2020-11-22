public class RealNumber{
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

  public boolean equals(RealNumber other){
    if (value == 0 || other.value == 0) {
      return value == other.value;
    }
    return Math.abs((other.value - value) / value * 100) < 0.001;
  }

}
