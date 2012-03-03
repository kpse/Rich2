public class GameMap {
    public static final String START_POINT = "S";
    private String mapString;

    public GameMap(String mapDescription) {
        mapString = mapDescription;
    }

    public String print() {
        return mapString;
    }

    public String print(Player gamePlayer) {
        if (gamePlayer == null) {
            return print();
        }
        return gamePlayer.print(this);
    }

}
