package BigInteger;

/**
 * Created by neelabhsingh on 10/10/16.
 */
import java.math.*;
import java.util.Scanner;

public class BigIntegerDemo {
    public static void main(String args[]){
        BigInteger zero = BigInteger.ZERO;
        BigInteger one = BigInteger.ONE;
        Scanner scan = new Scanner(System.in);
        String value = scan.next();
        BigInteger bigValue = new BigInteger(value);
        System.out.print(addBigInteger(one, bigValue));
    }
    public static BigInteger addBigInteger(BigInteger num1, BigInteger num2){
        return num1.add(num2);
    }
}
