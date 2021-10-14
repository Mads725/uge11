public class View {

    final static String MSG = "MOMS";
    final static String CURRENCY = " Kr";

    public static void view(double pris) {
        System.out.println("Du betaler " + pris + CURRENCY +" i " + MSG);
    }
}