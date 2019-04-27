package sex.ui.console.render;

import org.junit.jupiter.api.Test;
import sex.game.Equipment;
import sex.game.items.Item;
import sex.game.items.Weapon;
import sex.game.items.consumables.food.Bread;
import sex.game.items.consumables.food.Water;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemsRendererTest
{
    @Test
    void shouldRenderWater()
    {
        // given
        List<Item> items = List.of(new Water());
        Equipment equipment = new Equipment(0, items);

        ItemsRenderer renderer = new ItemsRenderer(equipment);

        // when
        String result = renderer.renderItems();

        // then
        assertEquals(" - Woda (+5 hp)\n", result);
    }

    @Test
    void shouldRenderBread()
    {
        // given
        List<Item> items = List.of(new Bread());
        Equipment equipment = new Equipment(0, items);

        ItemsRenderer renderer = new ItemsRenderer(equipment);

        // when
        String result = renderer.renderItems();

        // then
        assertEquals(" - Chleb (+45 hp)\n", result);
    }

    @Test
    void shouldRenderPhysicalWeapon()
    {
        // given
        List<Item> items = List.of(new Weapon("Miecz", 4, 5, 0, 0));
        Equipment equipment = new Equipment(0, items);

        ItemsRenderer renderer = new ItemsRenderer(equipment);

        // when
        String result = renderer.renderItems();

        // then
        assertEquals(" - Broń: Miecz (4-5 fizycznych)\n", result);
    }

    @Test
    void shouldRenderMagicalWeapon()
    {
        // given
        List<Item> items = List.of(new Weapon("Różdżka", 0, 0, 4, 5));
        Equipment equipment = new Equipment(0, items);

        ItemsRenderer renderer = new ItemsRenderer(equipment);

        // when
        String result = renderer.renderItems();

        // then
        assertEquals(" - Broń: Różdżka (4-5 magicznych)\n", result);
    }

    @Test
    void shouldRenderPhysicalAndMagicalWeapon()
    {
        // given
        List<Item> items = List.of(new Weapon("Zatruty sztylet", 2, 4, 0, 2));
        Equipment equipment = new Equipment(0, items);

        ItemsRenderer renderer = new ItemsRenderer(equipment);

        // when
        String result = renderer.renderItems();

        // then
        assertEquals(" - Broń: Zatruty sztylet (2-4 fizycznych, 0-2 magicznych)\n", result);
    }

    @Test
    void shouldRenderMultiple()
    {
        // given
        List<Item> items = List.of(
                new Water(),
                new Bread(),
                new Weapon("Miecz", 4, 5, 0, 0),
                new Water(),
                new Weapon("Topór", 2, 8, 0, 0)
        );
        Equipment equipment = new Equipment(0, items);

        ItemsRenderer renderer = new ItemsRenderer(equipment);

        // when
        String result = renderer.renderItems();

        // then
        String expected = " - Woda (+5 hp)\n" +
                " - Chleb (+45 hp)\n" +
                " - Broń: Miecz (4-5 physical)\n" +
                " - Woda (+5 hp)\n" +
                " - Broń: Topór (2-8 physical)\n";
        assertEquals(expected, result);
    }

    @Test
    void shouldRenderGold()
    {
        // given
        Equipment equipment = new Equipment(15, emptyList());

        ItemsRenderer renderer = new ItemsRenderer(equipment);

        // when
        String result = renderer.renderGold();

        // then
        assertEquals("Złoto: 15", result);
    }
}
