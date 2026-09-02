package entities;

public class CurrencyConverter {
    public static double DolarPrice;
    public static double buying;
    public static double tax;



    public static void setBuying(double buying) {
        CurrencyConverter.buying = buying;
    }

    public static double Calculator(){
        return DolarPrice * buying;
}
    public static double Tax(){
     return Calculator() + Calculator() * 0.06;
    }
}
