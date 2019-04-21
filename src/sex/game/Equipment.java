package sex.game;

import sex.game.items.Item;

import java.util.List;

public class Equipment {
    private final List<Item> items;
    private int gold;

    public Equipment(List<Item> items, int gold) {
        this.items = items;
        this.gold = gold;
    }

    public List<Item> getItems() {
        return items;
    }

    public void drop(Item item) {
        items.remove(item);
    }

    public int gold() {
        return gold;
    }

    public void pay(int price) {
        this.gold -= price;
    }

    public void earn(int income) {
        this.gold += income;
    }
}
