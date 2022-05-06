import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EC_Test {
    private static Stream<Arguments> providePajak(){
        return Stream.of(
                Arguments.of(0, 3500000),
                Arguments.of(10, 14500000),
                Arguments.of(22, 39500000),
                Arguments.of(40f, 55500000),
                Arguments.of(-1, -140000)

        );
    }
    @ParameterizedTest
    @MethodSource("providePajak")
    void parameterizedTestHargaPajak(double expected, double salary){
        Assertions.assertEquals(expected, Pajak.getPajak(salary));
    }
}
