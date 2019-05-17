package sex.ui.console.render;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HpRendererTest
{
    @Test
    void shouldRenderHp()
    {
        //given
        HpRenderer hpRenderer = new HpRenderer();

        //when
        String result = hpRenderer.render(3, 10);

        //then
        assertEquals("|XXX-------|", result);
    }

    @Test
    void shouldRenderMaxHp()
    {
        //given
        HpRenderer hpRenderer = new HpRenderer();

        //when
        String result = hpRenderer.render(10, 10);

        //then
        assertEquals("|XXXXXXXXXX|", result);
    }

    @Test
    void shouldRenderZeroHp()
    {
        //given
        HpRenderer hpRenderer = new HpRenderer();

        //when
        String result = hpRenderer.render(0, 10);

        //then
        assertEquals("|----------|", result);
    }

    @Test
    void shouldNotAllowForNegativeCurrent()
    {
        //given
        HpRenderer hpRenderer = new HpRenderer();

        //when
        assertThrows(IllegalArgumentException.class, () -> hpRenderer.render(-3, 10));
    }

    @Test
    void shouldNotAllowForNegativeTotal()
    {
        //given
        HpRenderer hpRenderer = new HpRenderer();

        //when
        assertThrows(IllegalArgumentException.class, () -> hpRenderer.render(3, -10));
    }

    @Test
    void shouldNotAllowForTotalBiggerThanCurrent()
    {
        //given
        HpRenderer hpRenderer = new HpRenderer();

        //when
        assertThrows(IllegalArgumentException.class, () -> hpRenderer.render(15, 10));
    }
}
