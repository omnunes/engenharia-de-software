public class operadoreslogicos {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println("a = " + a + "\nb = " + b);
        System.out.println("1. a > b: " + (a > b)); // false
        System.out.println("2. a < b: " + (a < b)); // true
        System.out.println("3. a == b: " + (a == b)); // false
        System.out.println("4. a != b: " + (a != b)); // true
        System.out.println("5. a <= b: " + (a <= b)); // true
        System.out.println("6. a == b || a < b: " + (a == b || a < b)); // true
        System.out.println("7. a > b || b < a: " + (a > b || b < a)); // true
        System.out.println("8. a != b && a < b: " + (a != b && a < b)); // true
        System.out.println("9. a == b && b > a: " + (a == b && b > a)); // false
        System.out.println("10. negacao de !(a == b && b > a): " + !(a == b && b > a));

    }
}
