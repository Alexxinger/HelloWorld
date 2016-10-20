/**
 * Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */
public class HW10 {
    public static void main(String[] args) {
        double a, b, c, d, f;
        a = 1;
        b = 11;
        f = 10;
        c = Math.abs(a-f);
        d = Math.abs(b-f);
        if(c<d) {
            System.out.println("А ближе");
        } else if(c>d) {
            System.out.println("B ближе");
        } else {
            System.out.println("Расстояние одинаковое");
        }
    }
}
