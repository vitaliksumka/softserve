public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((Fraction) o) == 0;
    }

    @Override
    public int compareTo(Fraction f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }

    // Your work here!

    //Add two fractions
    public Fraction add(Fraction f2){
        long top2;
        long bottom2;
        if (this.bottom == f2.bottom) {
            top2 = this.top + f2.top;
            bottom2 = this.bottom;
        } else {
            top2 = this.top * f2.bottom + this.bottom * f2.top;
            bottom2 = this.bottom * f2.bottom;
        }
        int i = 2;
        while (i < bottom2) {
            if (bottom2 % i == 0 && top2 % i == 0) {
                bottom2 = bottom2 / i;
                top2 = top2 / i;
            }
            i++;
        }

        Fraction result = new Fraction(top2, bottom2);
        return result;
    }
}