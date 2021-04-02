public class Figure {
    public int attackPoints;
    public int defencePoints;
    public int magicPower;
    public int speed;
    int team;

    public Figure(int attackPoints, int defencePoints, int magicPower, int speed) {
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
        this.magicPower = magicPower;
        this.speed = speed;
    }

    public Figure(int team) {
        this.team = team;
    }
}
