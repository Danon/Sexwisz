package sex.game.items.consumables.food;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest
{
    @Test
    void shouldGetHealingByBread()
    {
        // given
        Food food = new Bread();
        // when
        int healing = food.healing();
        // then
        assertEquals(35, healing);
    }

    @Test
    void shouldGetHealingByWater()
    {
        // given
        Food food = new Water();
        // when
        int healing = food.healing();
        // then
        assertEquals(5, healing);
    }
}