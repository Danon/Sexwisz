package sex.ui.console.render;

import sex.game.Equipment;

public class ItemsRenderer
{
    private final Equipment equipment;

    public ItemsRenderer(Equipment equipment)
    {
        this.equipment = equipment;
    }

    public String renderGold()
    {
        int goldCount = equipment.gold();
        return "Złoto: " + goldCount;
    }

    public String renderItems()
    {
        /*
        List<Item> itemsList = equipment.items();                    // Wystarczy nazwa "items". to że to jest lista każdy widzi, bo List<Item>
        String water = "";
        if(itemsList<Water>)                                         // Ten 'if' miał sprawdzić pierwszy element listy? Wszystkie? Co to miało robić?
        {
            Water waterCount = new Water();                          // Nie twórz nowych itemów tutaj. Ta funkcja ma wyświetlić te które są w uquipment.items(), a nie jakieś nowe
            return water += waterCount;
        } */                                                         // Nigdy, ale to nigdy nie wrzucaj do głównego brancha 'master' kodu który się nie kompiluje!


        // Powinno to wyglądać mniej więcej tak:
        // Pytania:
        // 1. Ile chcemy wyświetlić itemów? Żadnego? Jeden? Wszystkie? Niektóre?
        // - jak żadnego, to kod zostaje pusty
        // - jak jeden, to return itemsList.get(0)
        // - jak wszystkie to pętla for, a w niej itemsList.get(i)
        // - jak niektóre to pętla for, w niej if (itemsList.get(i)) //

    }
}
