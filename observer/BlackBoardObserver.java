package observer;

public class BlackBoardObserver implements MyObserver{
    private MySubject subject;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.subject.registerObserver(this);
        this.register();
    }

    public BlackBoardObserver(MySubject subject) {
        this.subject = subject;
    }

    public void cancelRegister(){
        this.subject.removeObserver(this);
        this.unRegister();
    }

    @Override
    public void update(String title) {
        System.out.println(name +"! 文章标题变成了： " + title);
    }
    private void register(){
        System.out.println(name +"注册了通知功能");
    }
    private void unRegister(){
        System.out.println(name +"取消了通知功能");
    }

}
