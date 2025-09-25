package matter.ex2;

public class Warrior implements Attackable{

    @Override
    public void attack() {
        System.out.println("검으로 공격한다!");
    }
}
