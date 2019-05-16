package strategy;

public class NoneFly implements Fly{
    @Override
    public void fly() {
        System.out.println("没有钱，飞不动");
    }
}
