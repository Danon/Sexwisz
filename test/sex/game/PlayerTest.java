package sex.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest
{
    @Test
    void shouldReturnPosition()
    {
        // given
        Player player = new Player(null, 13, 17, null);

        // when
        int x = player.getX();
        int y = player.getY();

        // then
        assertEquals(13, x);
        assertEquals(17, y);
    }

    @Test
    void shouldReturnLevel()
    {
        // given
        Player player = new Player(new LevelCalculator(), 0, 0, null);

        // when
        int level = player.level();

        // then
        assertEquals(1, level);
    }

    @Test
    void shouldReturnLevel_Higher()
    {
        // given
        Player player = new Player(new LevelCalculator(), 0, 0, null);
        player.gainExperience(37);

        // when
        int level = player.level();

        // then
        assertEquals(3, level);
    }

    @Test
    void shouldMoveTo()
    {
        // given
        Player player = new Player(null, 0, 0, null);

        // when
        player.moveTo(5, 10);

        // then
        assertEquals(5, player.getX());
        assertEquals(10, player.getY());
    }
}
