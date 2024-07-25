package sprint_4.theme_2.TexlaCar;

class Automobile extends Transport {
    public Automobile() {
        wheelsNumber = 4;
    }

    protected String direction;

    public void turnTo(String worldSide) {
        direction = worldSide;
    }
}
