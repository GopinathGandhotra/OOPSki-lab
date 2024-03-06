public class lab1code2 {
    public static void main(String[] args) {
        int b= 0;
        for (int i=0;i<args[0].length();i++) {
            char a= args[0].charAt(i);
            int rak= Character.getNumericValue(a);
            rak=rak+b;
            b=rak;
            System.out.println(b);
        }
        System.out.println(b);
    }
}
