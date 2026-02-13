package polymorphism.methodOverriding;

public class EmailNotification extends Notifications{

    @Override
    public String send(String msg) {
        return msg;
    }
}
