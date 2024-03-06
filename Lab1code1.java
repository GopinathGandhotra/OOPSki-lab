public class Lab1code1 {
    public static void main(String[] args) {
        int a = 1, b = 1, c;
        float avg = 0;
        for (int n = 0; n < 20; n++) {
            System.out.println(a);
            avg = avg + a;
            c = a + b;
            a = b;
            b = c;
        }
        float t = avg / 20;
        System.out.println("The average is: " + t);
    }
    
}

    
