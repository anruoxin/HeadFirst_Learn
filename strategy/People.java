package strategy;

public class People {

    private String name;

    private Integer age;

    private Fly fly;

    public People(Fly fly) {
        this.fly = fly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public void fly(){
        System.out.print(this.name + ": ");
        this.fly.fly();
    }
}
