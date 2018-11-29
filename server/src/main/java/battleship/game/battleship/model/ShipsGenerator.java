package battleship.game.battleship.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShipsGenerator {
    //ONLY TEMPORARY
    public static List<Ship> generateShipsForPlayer1() {
        List<Ship> ships = new ArrayList<>();
        List<BoardPoint> fourDecker = generateShip(0, 5, 4, false);
        List<BoardPoint> threeDeckerOne = generateShip(3, 3, 3, true);
        List<BoardPoint> threeDeckerTwo = generateShip(4, 5, 3, true);
        List<BoardPoint> twoDeckerOne = generateShip(3, 0, 2, false);
        List<BoardPoint> twoDeckerTwo = generateShip(9, 4, 2, false);
        List<BoardPoint> twoDeckerThree = generateShip(7, 8, 2, true);
        List<BoardPoint> singleDeckerOne = generateShip(8, 0, 1, true);
        List<BoardPoint> singleDeckerTwo = generateShip(1, 3, 1, true);
        List<BoardPoint> singleDeckerThree = generateShip(2, 8, 1, true);
        List<BoardPoint> singleDeckerFour = generateShip(4, 8, 1, true);

        ships.add(new Ship(fourDecker));
        ships.add(new Ship(threeDeckerOne));
        ships.add(new Ship(threeDeckerTwo));
        ships.add(new Ship(twoDeckerOne));
        ships.add(new Ship(twoDeckerTwo));
        ships.add(new Ship(twoDeckerThree));
        ships.add(new Ship(singleDeckerOne));
        ships.add(new Ship(singleDeckerTwo));
        ships.add(new Ship(singleDeckerThree));
        ships.add(new Ship(singleDeckerFour));

        return ships;
    }

    public static List<Ship> generateShipsForPlayer2() {
        List<Ship> ships = new ArrayList<>();
        List<BoardPoint> fourDecker = generateShip(2, 6, 4, true);
        List<BoardPoint> threeDeckerOne = generateShip(7, 3, 3, false);
        List<BoardPoint> threeDeckerTwo = generateShip(7, 9, 3, true);
        List<BoardPoint> twoDeckerOne = generateShip(3, 0, 2, true);
        List<BoardPoint> twoDeckerTwo = generateShip(9, 0, 2, false);
        List<BoardPoint> twoDeckerThree = generateShip(1, 8, 2, false);
        List<BoardPoint> singleDeckerOne = generateShip(0, 1, 1, true);
        List<BoardPoint> singleDeckerTwo = generateShip(3, 9, 1, true);
        List<BoardPoint> singleDeckerThree = generateShip(9, 7, 1, true);
        List<BoardPoint> singleDeckerFour = generateShip(4, 3, 1, true);

        ships.add(new Ship(fourDecker));
        ships.add(new Ship(threeDeckerOne));
        ships.add(new Ship(threeDeckerTwo));
        ships.add(new Ship(twoDeckerOne));
        ships.add(new Ship(twoDeckerTwo));
        ships.add(new Ship(twoDeckerThree));
        ships.add(new Ship(singleDeckerOne));
        ships.add(new Ship(singleDeckerTwo));
        ships.add(new Ship(singleDeckerThree));
        ships.add(new Ship(singleDeckerFour));

        return ships;
    }

    private static List<BoardPoint> generateShip(int row, int column, int size, boolean isVerticalShip) {
        return IntStream.range(0, size).mapToObj(i -> {
            if (isVerticalShip) {
                return new BoardPoint(row + i, column);
            } else {
                return new BoardPoint(row, column + i);
            }
        }).collect(Collectors.toList());
    }
}