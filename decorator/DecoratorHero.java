package decorator;

public abstract class DecoratorHero implements Hero{
    protected Hero hero;

    public DecoratorHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    public Integer cost() {
        return hero.cost();
    }

    @Override
    public String describe() {
        return hero.describe();
    }
}
