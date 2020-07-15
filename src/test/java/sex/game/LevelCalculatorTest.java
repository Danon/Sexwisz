package sex.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LevelCalculatorTest
{
    @Test
    void shouldBe1stLevelWith_0_Exp()
    {
        // given
        LevelCalculator calculator = new LevelCalculator();

        // when
        int level = calculator.calculateLevel(0);

        // then
        assertEquals(1, level);
    }

    @Test
    void calculateLevel_1()
    {
        // given
        LevelCalculator calculator = new LevelCalculator();

        // when
        int level = calculator.calculateLevel(1);

        // then
        assertEquals(1, level);
    }

    @Test
    void calculateLevel_2()
    {
        // given
        LevelCalculator calculator = new LevelCalculator();

        // when
        int level = calculator.calculateLevel(10);

        // then
        assertEquals(2, level);
    }

    @Test
    void calculateLevel_3()
    {
        // given
        LevelCalculator calculator = new LevelCalculator();

        // when
        int level = calculator.calculateLevel(37);

        // then
        assertEquals(3, level);
    }

    @Test
    void shouldNotCalculateLevel_forNegativeExperience()
    {
        // given
        LevelCalculator calculator = new LevelCalculator();

        // when
        assertThrows(IllegalArgumentException.class, () ->
        {
            calculator.calculateLevel(-10);
        });
    }
}
