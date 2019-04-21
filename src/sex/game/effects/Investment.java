package sex.game.effects;

import sex.game.Player;

public class Investment extends Effect {
    private final int price;
    private final int income;

    Investment(String name, int duration, int price, int income) {
        super(name, duration);
        this.price = price;
        this.income = income;
        if (price >= income) {
            throw new AssertionError();
        }
    }

    @Override
    public void effectStart(Player player) {
        player.equipment().pay(price);
    }

    @Override
    public void effectEnd(Player player) {
        player.equipment().earn(income);
    }
}
