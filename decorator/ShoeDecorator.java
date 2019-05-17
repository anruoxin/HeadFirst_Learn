package decorator;

public class ShoeDecorator extends DecoratorHero{
    public ShoeDecorator(Hero hero) {
        super(hero);
    }
    @Override
    public Integer cost() {
        return hero.cost() + 20;
    }

    @Override
    public String describe() {
        return hero.describe() + " ->穿上了鞋子";
    }

}
