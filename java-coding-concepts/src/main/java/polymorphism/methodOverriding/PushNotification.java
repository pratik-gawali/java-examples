package polymorphism.methodOverriding;

public class PushNotification extends Notifications{

        @Override
        public String send(String msg) {
            return msg;
        }
}
