package Week1;

public class PrimeNumbers {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println(i+" : "+isPrime(i));
        }
    }


     static boolean isPrime(int i) {
        boolean ret=true;
        if (i < 2) {
            ret = false;
        } else {
            int limit = i / 2;
            for (int j = 2; j <= limit; j++) {
                if (i % j == 0) {
                    ret = false;
                    break;
                }
            }
        }
         return ret;
    }
}
