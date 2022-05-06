import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BVA_Test {
    private static Stream<Arguments> BVA1Pajak(){
        return Stream.of(
                Arguments.of(true, 3999999),
                Arguments.of(false, 4000000),
                Arguments.of(false, 4000001)
        );
    }
    @ParameterizedTest
    @MethodSource("BVA1Pajak")
    public void BVA1TestPajak(boolean expected, double salary){
        Assertions.assertEquals(expected, Pajak.getPajak(salary) == 0);
    }
    private static Stream<Arguments> BVA2Pajak(){
        return Stream.of(
                Arguments.of(true, 14999999),
                Arguments.of(true, 15000000),
                Arguments.of(false, 15000001)
        );
    }
    @ParameterizedTest
    @MethodSource("BVA2Pajak")
    public void BVA2TestPajak(boolean expected, double salary){
        Assertions.assertEquals(expected, Pajak.getPajak(salary) == 10);
    }
    private static Stream<Arguments> BVA3Pajak(){
        return Stream.of(
                Arguments.of(true, 39999999),
                Arguments.of(true, 40000000),
                Arguments.of(false, 40000001)
        );
    }
    @ParameterizedTest
    @MethodSource("BVA3Pajak")
    void BVA3TestPajak(boolean expected, double salary){
        Assertions.assertEquals(expected, Pajak.getPajak(salary) == 22);
    }
}
