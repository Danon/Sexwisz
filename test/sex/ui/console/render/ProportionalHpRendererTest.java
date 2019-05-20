package sex.ui.console.render;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProportionalHpRendererTest
{
    @Test
    void shouldNotAllowNegativeWidth()
    {
        // when
        assertThrows(IllegalArgumentException.class, () -> new ProportionalHpRenderer(-1));
    }

    @Test
    void shouldNotAllow0Width()
    {
        // when
        assertThrows(IllegalArgumentException.class, () -> new ProportionalHpRenderer(0));
    }

    @Test
    void shouldNotAllowTooSmallWidth()
    {
        // when
        assertThrows(IllegalArgumentException.class, () -> new ProportionalHpRenderer(1));
    }

    @Test
    void shouldRenderSmallWidth()
    {
        // given
        ProportionalHpRenderer proportionalHpRenderer = new ProportionalHpRenderer(2);

        // when
        String result = proportionalHpRenderer.render(6, 11);

        // then
        assertEquals("|X-|", result);
    }

    @Test
    void shouldRenderHp()
    {
        //given
        ProportionalHpRenderer hpRenderer = new ProportionalHpRenderer(16);

        //when
        String result = hpRenderer.render(3, 10);

        //then
        assertEquals("|XXXXX-----------|", result);
    }

    @Test
    void shouldRenderHpLarge()
    {
        //given
        ProportionalHpRenderer hpRenderer = new ProportionalHpRenderer(16);

        //when
        String result = hpRenderer.render(30, 100);

        //then
        assertEquals("|XXXXX-----------|", result);
    }

    @Test
    void shouldRenderMaxHp()
    {
        //given
        ProportionalHpRenderer hpRenderer = new ProportionalHpRenderer(16);

        //when
        String result = hpRenderer.render(10, 10);

        //then
        assertEquals("|XXXXXXXXXXXXXXXX|", result);
    }

    @Test
    void shouldRenderZeroHp()
    {
        //given
        ProportionalHpRenderer hpRenderer = new ProportionalHpRenderer(16);

        //when
        String result = hpRenderer.render(0, 10);

        //then
        assertEquals("|----------------|", result);
    }

    @Test
    void shouldNotAllowForNegativeCurrent()
    {
        //given
        ProportionalHpRenderer hpRenderer = new ProportionalHpRenderer(16);

        //when
        assertThrows(IllegalArgumentException.class, () -> hpRenderer.render(-3, 10));
    }

    @Test
    void shouldNotAllowForNegativeTotal()
    {
        //given
        ProportionalHpRenderer hpRenderer = new ProportionalHpRenderer(16);

        //when
        assertThrows(IllegalArgumentException.class, () -> hpRenderer.render(3, -10));
    }

    @Test
    void shouldNotAllowForTotalBiggerThanCurrent()
    {
        //given
        ProportionalHpRenderer hpRenderer = new ProportionalHpRenderer(16);

        //when
        assertThrows(IllegalArgumentException.class, () -> hpRenderer.render(15, 10));
    }
}
