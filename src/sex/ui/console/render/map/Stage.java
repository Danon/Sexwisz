package sex.ui.console.render.map;

import static sex.ui.console.render.map.DimensionalArray.twoDimensionalArray;

class Stage
{
    private final int width, height;
    private final char[][] map;

    Stage(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.map = twoDimensionalArray(width, height);
    }

    void clear()
    {
        // TODO Kaczor
        // Napisz funkcje która ustawia wszystkie znaki w tablicy `map` na spacje
    }

    void put(int x, int y, char character)
    {
        // TODO Kaczor
        // Napisz funkcje która ustawia znak na pozycji `x/y` na znak `character`
    }

    String render()
    {
        // TODO Kaczor
        // Napisz funkcję która zwraca stringa, który ma wszystkie pola z mapy `map`.
        // Po każdym wieszu ma być znak nowej linii
        return "";
    }
}
