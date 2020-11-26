public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other Number
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    if (equals(other)) {
      return 0;
    } else if (getValue() < other.getValue()) {
      return -1;
    } else {
      return 1;
    }
  }

  public boolean equals(Number other){
    if (value == 0 || other.getValue() == 0) {
      return value == 0 && other.getValue() == 0;
    }
    return Math.abs((other.getValue() - value) / value) < 0.00001;
  }
}
