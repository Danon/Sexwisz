package sex.control;

import sex.game.Board;
import sex.game.Equipment;
import sex.game.LevelCalculator;
import sex.game.Player;
import sex.game.items.Item;
import sex.game.items.consumables.basic.BagOfPotatoes;
import sex.game.items.consumables.basic.Bread;
import sex.game.items.consumables.basic.Water;
import sex.ui.console.CommandParser;
import sex.ui.console.render.EquipmentRenderer;
import sex.ui.console.render.MapRenderer;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static java.lang.Runtime.getRuntime;
import static java.util.Arrays.asList;

public class Game implements EndGameListener {
    private final Scanner scanner;
    private final Player player;
    private final Board board;
    private final MapRenderer mapRenderer;
    private final CommandParser parser;

    private boolean gamePlaying = true;

    public Game(Scanner scanner) {
        this.scanner = scanner;
        Equipment startingPlayerEquipment = startingPlayerEquipment();
        this.player = new Player(new LevelCalculator(), 10, 10, startingPlayerEquipment);
        this.board = new Board();
        this.mapRenderer = new MapRenderer(board, player);
        this.parser = new CommandParser(new CommandListener(new EquipmentRenderer(startingPlayerEquipment)), this);
    }

    public void start() {
        while (gamePlaying) {
            clearScreen();
            System.out.println(mapRenderer.render());
            String command = scanner.nextLine();
            parser.parse(command);
        }
    }

    @Override
    public void finishGame() {
        this.gamePlaying = false;
    }

    private void clearScreen() {
        try {
            getRuntime().exec("cls");
        } catch (IOException ignored) {
        }
    }

    private Equipment startingPlayerEquipment() {
        List<Item> startingItems = asList(
                new Water(),
                new Bread(),
                new BagOfPotatoes()
        );

        return new Equipment(startingItems, 15);
    }
}
