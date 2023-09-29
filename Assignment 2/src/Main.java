import java.util.ArrayList;
import java.util.List;

class Game {
    private String startTime;
    private String endTime;
    private List<Round> rounds;

    public Game() {
        rounds = new ArrayList<>();
    }

    public void startGame() {
        System.out.println("Game started");
    }

    public void endGame() {
        System.out.println("Game ended");
    }

    public void addRound(Round round) {
        rounds.add(round);
    }

    public void removeRound(Round round) {
        if (rounds.contains(round)) {
            rounds.remove(round);
        } else {
            System.out.println("Error: Round not found in the game.");
        }
    }

    public void listRounds() {
        for (Round round : rounds) {
            System.out.println("Round: " + round.toString());
        }
    }
}

class Player {
    public int points;
    public List<Ship> ships;
    public List<Torpedo> torpedos;

    public Player() {
        points = 0;
        ships = new ArrayList<>();
        torpedos = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            ships.add(new Ship(3));
        }

        for (int i = 0; i < 45; i++) {
            torpedos.add(new Torpedo());
        }
    }

    public void selectPlayerType() {
        System.out.println("Player type selected");
    }

    public void placeShip(Ship ship, Grid grid) {
        System.out.println("Ship placed on the grid");
    }

    public void chooseGridSize(Grid grid) {
        System.out.println("Grid size chosen");
    }

    public void attack(Player opponent, Torpedo torpedo) {
        System.out.println("Attacking opponent with a torpedo");
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void removeShip(Ship ship) {
        if (ships.contains(ship)) {
            ships.remove(ship);
        } else {
            System.out.println("Error: Ship not found in the player's fleet.");
        }
    }

    public void addTorpedo(Torpedo torpedo) {
        torpedos.add(torpedo);
    }

    public void removeTorpedo(Torpedo torpedo) {
        if (torpedos.contains(torpedo)) {
            torpedos.remove(torpedo);
        } else {
            System.out.println("Error: Torpedo not found in the player's inventory.");
        }
    }

    public void listShips() {
        for (Ship ship : ships) {
            System.out.println("Ship: " + ship.toString());
        }
    }

    public void listTorpedos() {
        for (Torpedo torpedo : torpedos) {
            System.out.println("Torpedo: " + torpedo.toString());
        }
    }
}

class Torpedo {
    public int x;
    public int y;

    public void selectCoords(int x, int y) {
        System.out.println("Selected torpedo coordinates: (" + x + ", " + y + ")");
    }
}

class Ship {
    public int size;

    public Ship(int size) {
        this.size = size;
    }
}

class Grid {
    public int row;
    public int col;

    public Grid(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Round {
    public void nextRound() {
        System.out.println("Advancing to the next round");
    }
}

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player();
        Player player2 = new Player();
        Grid grid = new Grid(10, 10);
        Round round = new Round();

        game.addRound(round);

        player1.selectPlayerType();
        player1.placeShip(player1.ships.get(0), grid);
        player2.attack(player1, player2.torpedos.get(0));
        game.startGame();
        round.nextRound();
        game.endGame();

        System.out.println("List of Ships");
        player1.listShips();
        System.out.println("List of Torpedos");
        player1.listTorpedos();
        System.out.println("List of Rounds");
        game.listRounds();
    }
}
