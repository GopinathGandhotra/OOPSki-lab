import java.util.Scanner;

public class lab2excercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, a = 0;
        for (int i=0;i<10;i++){
            System.out.println("Enter the number" + (i+1) + ":");
            a=in.nextInt();
            sum+=a;
        }
        System.out.println("the sum is "+ sum);
        
    }
    
}
