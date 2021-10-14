public class CalculateVat {

    final static int PRCVAT = 25;
    static double betaltMoms;

    public static double calVat(double pris) {
        return betaltMoms = pris / 100 * PRCVAT;
    }
}