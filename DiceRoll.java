public class DiceRoll {
    int roll() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        DiceRoll dice = new DiceRoll();
        for (int i = 0; i < 100; i++) {
            System.out.println(dice.roll());
        }
    }
}
