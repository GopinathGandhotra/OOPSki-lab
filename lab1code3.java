public class lab1code3 {
    public static void main(String[] args) {
        int maxdenominator = 5000;
        double suml2r = 0, sumr2l = 0;
        
        // Calculate sum from left to right
        for (int denominator = 1; denominator <= maxdenominator; denominator++) {
            suml2r = suml2r + 1.0 / denominator; // Convert denominator to double to avoid integer division
        }
        System.out.println("suml2r=" + suml2r);
        
        // Calculate sum from right to left
        for (int denominator = maxdenominator; denominator >= 1; denominator--) { // Corrected loop condition
            sumr2l = sumr2l + 1.0 / denominator; // Convert denominator to double to avoid integer division
        }
        System.out.println("sumr2l=" + sumr2l);
    }
}

