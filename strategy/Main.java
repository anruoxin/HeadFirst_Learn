package strategy;

public class Main {
    public static void main(String[] args) {
        People richPeople = new People(new PlaneFly());
        richPeople.setName("richPeople");
        richPeople.fly();
        People poorPeople = new People(new NoneFly());
        poorPeople.setName("poorPeople");
        poorPeople.fly();
    }
}
