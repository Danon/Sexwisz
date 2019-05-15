package sex.control;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sex.game.Equipment;
import sex.game.items.Weapon;
import sex.game.items.consumables.food.Bread;
import sex.ui.console.render.ItemsRenderer;

import java.util.List;

class CommandListenerTest
{
    @Test
    void shouldShowHelp()
    {
        // given
        CommandListener listener = new CommandListener(new ItemsRenderer(new Equipment(15, List.of(
                new Bread(),
                new Weapon("Miecz", 4, 5, 0, 0))
        )));

        // when
        String equipment = listener.showEquipment();

        // then
        String expected = "Złoto: 15\n" +
                "Twoje przedmioty:\n" +
                " - Chleb\n" +
                " - Chleb\n" +
                " - Chleb\n" +
                " - Chleb\n";
        Assertions.assertEquals(expected, equipment);
    }
}
