public class SimpleInterestCalculator {
    public static void main(String[] args) {
        
        double principalAmount = 50000.0; // P
        double rate = 35.0; // R (in percentage)
        double time = 25.0; // T (in years)

    
        double simpleInterest = (principalAmount * time * rate) / 100;

    
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
