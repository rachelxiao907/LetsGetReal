public class RealTester {
  public static void main(String[] args) {
    RealNumber a = new RealNumber(5);
    RealNumber b = new RealNumber(5.0000000001);
    System.out.println(a.equals(b));
    RealNumber c = new RealNumber(0);
    RealNumber d = new RealNumber(0.0000000000000000001);
    System.out.println(c.equals(d));
    RealNumber e = new RealNumber(3.14159);
    System.out.println(a.add(e));
    System.out.println(d.equals(a.add(e)));  //test to see if it make new RealNumber
    System.out.println(a.multiply(e));
    System.out.println(a.subtract(e));
    System.out.println(a.divide(e));

    RationalNumber r = new RationalNumber(1, 4);
    System.out.println(r.getValue());
    System.out.println(r);
    System.out.println(r.reciprocal());
    RationalNumber r2 = new RationalNumber(256, 96);
    System.out.println(r2.getValue());
    System.out.println(r2);
    System.out.println(a.multiply(r2));
  }
}
