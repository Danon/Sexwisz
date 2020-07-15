package sex.ui.console.render.map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StageTest
{
    @Test
    void shouldPutCharacters()
    {
        // given
        Stage stage = new Stage(3, 3);

        // when
        stage.put(0, 0, '1');
        stage.put(2, 0, '2');
        stage.put(0, 2, '3');
        stage.put(2, 2, '4');
        stage.put(1, 1, '5');

        // then
        assertEquals("1 2\n 5 \n3 4\n", stage.render());
    }

    @Test
    void shouldRenderEmpty()
    {
        // given
        Stage stage = new Stage(4, 3);

        // when
        String result = stage.render();

        // then
        assertEquals("    \n    \n    \n", result);
    }

    @Test
    void shouldClear()
    {
        // given
        Stage stage = new Stage(3, 3);

        stage.put(0, 0, '#');
        stage.put(2, 2, '#');

        // when
        stage.clear();

        // then
        assertEquals("   \n   \n   \n", stage.render());
    }
}
