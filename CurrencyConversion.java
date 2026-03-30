public class CurrencyConversion {
    public static double toUSD(String originCurrency ,double amount) {
        switch (originCurrency){
            case "USD":
                return amount;
            case "IDR":
                return amount / 17_000;
            case "EUR": 
                return amount / 1.2;
            case "JPY":
                return amount / 150;
            default:
                System.out.println("Mata uang asal tidak dikenal.");
                return 0;
        }
    }

    public static double USDto(String targetCurrency, double amount){
        switch(targetCurrency){
            case "USD":
                return amount;
            case "IDR":
                return amount * 17_000;
            case "EUR": 
                return amount * 1.2;
            case "JPY":
                return amount * 150;
            default:
                System.out.println("Mata uang target tidak dikenal.");
                return 0;
        }
    }

    public static double generalConversion(String originCurrency, String targetCurrency, double amount){
        return USDto(targetCurrency, toUSD(originCurrency, amount));
    }
}
