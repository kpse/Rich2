public class Player {
    private String name;
    private int position;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int position) {

        this.name = name;
        this.position = position;
    }

    public String print(GameMap map){
        String mapStatus = map.print();
        String substring = mapStatus.substring(0, getPosition());
        substring += print();
        substring += mapStatus.substring(getPosition() + 1, mapStatus.length());
        return substring;
    }

    public String print() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move(int step) {
        position += step;

    }

    public String printStatus() {
        return null;
    }
}
