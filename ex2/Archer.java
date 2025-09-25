package matter.ex2;

public class Archer implements Attackable{
    @Override
    public void attack() {
        System.out.println("활로 공격한다!");
    }
}
