package decorator;

public class Main {
    public static void main(String[] args) {
        MatserHero matserHero = new MatserHero();
        System.out.println("花费：" + matserHero.cost() +" " + matserHero.describe());
        ClothDecorator clothDecorator = new ClothDecorator(matserHero);
        System.out.println("花费：" + clothDecorator.cost() +" " + clothDecorator.describe());
        ShoeDecorator shoeDecorator = new ShoeDecorator(clothDecorator);
        System.out.println("花费：" + shoeDecorator.cost() +" " + shoeDecorator.describe());
    }
}
