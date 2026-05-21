public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int val = 0/10;
            throw new ArithmeticException();
            //System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
    }
}
