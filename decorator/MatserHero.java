package decorator;

public class MatserHero implements Hero{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer cost() {
        return 100;
    }

    @Override
    public String describe() {
        return "选择了法师";
    }
}
