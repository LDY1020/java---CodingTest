package matter.ex2;

public class Main {

    public static void main(String[] args) {
        Attackable[] attackables = {new Archer() , new Warrior() , new Wizard()};

        for (Attackable attackable : attackables) {
            attackable.attack();
            if(attackable instanceof Wizard){
                Wizard w = (Wizard) attackable;
                System.out.println("마법 강화!");
            }
        }
        System.out.println("총 캐릭터 수 : " + attackables.length);
    }
}
