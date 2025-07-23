package stage02.datatype.et02;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberEtude {
    public static void main(String[] args) {
        // 일반적인 실수 연산의 부정확성
        System.out.println(2 - 1.1); // 결과: 0.8999999999999999

        // BigDecimal을 사용한 정확한 소수 계산
        BigDecimal bd1 = new BigDecimal("2");
        BigDecimal bd2 = new BigDecimal("1.1");
        System.out.println(bd1.subtract(bd2)); // 결과: 0.9

        // BigInteger를 사용한 정수 계산
        BigInteger bi1 = new BigInteger("100000000000000000000");
        BigInteger bi2 = new BigInteger("99999999999999999999");
        System.out.println(bi1.subtract(bi2)); // 결과: 1
        
		System.out.println("au revoir!");
    }
}
