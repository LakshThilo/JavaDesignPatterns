package lak.designPatterns.behavioral.templateMethodPattern.differentCharatersInGame.improved;

public class Main {

    public static void main(String[] args) {
        Pirate pirate = new Pirate();
        pirate.defendAgainstAttack();

        Troll troll = new Troll();
        troll.defendAgainstAttack();
    }

}
