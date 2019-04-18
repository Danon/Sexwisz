package sex.game.items;

public class Weapon extends Item {
    private final int physicalMin, physicalMax;
    private final int magicalMin, magicalMax;

    public Weapon(String name, int physicalMin, int physicalMax, int magicalMin, int magicalMax) {
        super(name);
        this.physicalMin = physicalMin;
        this.physicalMax = physicalMax;
        this.magicalMin = magicalMin;
        this.magicalMax = magicalMax;
    }

    public int attackPhysical() {
        return attack(physicalMin, physicalMax);
    }

    public int attackMagical() {
        return attack(magicalMin, magicalMax);
    }

    private int attack(int min, int max) {
        return min + 2;
    }
}
