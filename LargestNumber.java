public class LargestNumber {
    public static void main(String[] args) {
	    
        if (args.length == 0) {
            System.out.println("Please provide numbers as command line arguments.");
            return;
        }
        double largest = Double.parseDouble(args[0]);
        for (int i = 1; i < args.length; i++) {
            double currentNumber = Double.parseDouble(args[i]);
            if (currentNumber > largest) {
                largest = currentNumber;
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}

