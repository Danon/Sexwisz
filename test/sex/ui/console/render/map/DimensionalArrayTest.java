package sex.ui.console.render.map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DimensionalArrayTest {
    @Test
    void shouldInitializeArray() {
        // given

        // when
        char[][] result = DimensionalArray.twoDimensionalArray(3, 3);

        // then
        assertEquals(3, result.length);

        assertEquals(3, result[0].length);
        assertEquals(3, result[1].length);
        assertEquals(3, result[2].length);
    }

    @Test
    void shouldInitializeEmptyArray() {
        // given

        // when
        char[][] result = DimensionalArray.twoDimensionalArray(0, 3);

        // then
        assertEquals(0, result.length);
    }

}
