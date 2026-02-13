package polymorphismTest.methodOverridingTest;
import org.junit.jupiter.api.Test;
import polymorphism.methodOverriding.EmailNotification;
import polymorphism.methodOverriding.Notifications;
import polymorphism.methodOverriding.PushNotification;
import polymorphism.methodOverriding.SMSNotification;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NotificationsTest {

    //Test Email Notification
    @Test
    public void email_shouldReturnMsg(){

        Notifications n = new EmailNotification();
        assertEquals("Hello",n.send("Hello"));

    }

    //Test SMS Notification
    @Test
    public void sms_shouldReturnMsg(){

        Notifications n = new SMSNotification();
        assertEquals("Hello",n.send("Hello"));

    }

    //Test Push Notification
    @Test
    public void push_shouldReturnMsg(){

        Notifications n = new PushNotification();
        assertEquals("Hello",n.send("Hello"));

    }
}
