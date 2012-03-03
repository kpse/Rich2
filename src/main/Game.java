public class Game {
    private GameMap gameMap;
    private Player gamePlayer;

    public Game(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public String print() {
        return gameMap.print(gamePlayer);
    }

    public void add(Player player) {
        gamePlayer = player;
    }

    public String promptCommands() {
        return "roll\nhelp\nquit\n";
    }

    public String execCommand(String commands) {
        gamePlayer.move(1);
        return "property position: 1";
    }

    public String promptBuyOrNot() {
        return "200 yuan, buy?[Y/N]";
    }

    public String printStatus() {
        return null;
    }
}
