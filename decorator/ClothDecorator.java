package decorator;

public class ClothDecorator extends DecoratorHero{
    public ClothDecorator(Hero hero) {
        super(hero);
    }

    @Override
    public Integer cost() {
        return hero.cost() + 20;
    }

    @Override
    public String describe() {
        return hero.describe() + " ->穿上了衣服";
    }
}
