package club.aborigen.firebase;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.i("UWC", "New token received: " + token);
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        try {
            // Steps to test
            // 1. Enable Cloud Messaging API
            // 2. Copy "Server key" from console and "Token" from logs
            // 3. Send message to token: https://testfcm.com/
            Log.i("UWC", "Message received: " + message.getNotification().getBody() + ", data: " + message.getData());
        } catch (Exception e) {
            Log.e("UWC", "Error when receiving message: " + e);
        }
    }
}
