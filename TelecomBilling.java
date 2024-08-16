
public class TelecomBilling {
   
    public static void main(String[] args) {
        double airtimeLoaded = 10000; // UGX
        double chargePercentage = 0.10; // 10%
        double callChargePerSecond = 200; // UGX
        int callDurationInSeconds = 5 * 60; // 5 minutes in seconds
        
        // Calculate the charge for loading airtime
        double charge = airtimeLoaded * chargePercentage; 
        double availableBalance = airtimeLoaded - charge; // Remaining balance after loading
        
        // Calculate total call cost
        double callCost = callChargePerSecond * callDurationInSeconds; 

        // Calculate final balance
        double finalBalance = availableBalance - callCost;

        System.out.println("Initial Airtime Loaded: UGX " + airtimeLoaded);
        System.out.println("Loading Charge Deducted: UGX " + charge);
        System.out.println("Available Balance after Loading: UGX " + availableBalance);
        System.out.println("Total Call Cost: UGX " + callCost);
        System.out.println("Final Balance after Call: UGX " + finalBalance);
    }
}