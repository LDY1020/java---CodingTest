package matter.ex2;

public class Wizard implements Attackable{
    @Override
    public void attack() {
        System.out.println("마법으로 공격한다!");
    }
}
