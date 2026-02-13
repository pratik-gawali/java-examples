package polymorphism.methodOverriding;

public class SMSNotification extends Notifications{

    @Override
    public String send(String msg) {
        return msg;
    }

}

