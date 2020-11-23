public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else if (deno < 0) {
      numerator = nume * -1;
      denominator = deno * -1;
      reduce();
    } else {
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  public double getValue() {
    return (double) numerator / denominator;
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    RationalNumber ans = new RationalNumber(denominator, numerator);
    return ans;
  }

  public boolean equals(RationalNumber other) {
    return numerator == other.getNumerator() && denominator == other.getDenominator();
  }

  public String toString() {
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b) {
    if (a == 0) return b;
    if (a < b) {
      int c = a;
      a = b;
      b = c;
    }
    int r = a % b;
    while (r != 0) {
      a = b;
      b = r;
      r = a % b;
    }
    return b;
  }

  private void reduce() {
    int g = gcd(Math.abs(numerator), denominator);
    numerator = numerator / g;
    denominator = denominator / g;
  }

  public RationalNumber multiply(RationalNumber other) {
    RationalNumber ans = new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
    return ans;
  }

  public RationalNumber divide(RationalNumber other) {
    return multiply(other.reciprocal());
  }

  public RationalNumber add(RationalNumber other) {
    int common = denominator * other.getDenominator();
    int nume = numerator * other.getDenominator() + other.getNumerator() * denominator;
    RationalNumber ans = new RationalNumber(nume, common);
    return ans;
  }

  public RationalNumber subtract(RationalNumber other) {
    int common = denominator * other.getDenominator();
    int nume = numerator * other.getDenominator() - other.getNumerator() * denominator;
    RationalNumber ans = new RationalNumber(nume, common);
    return ans;
  }

}
