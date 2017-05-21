package polytechnice.tobeortohave;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Pierre on 20/05/2017.
 */

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        MyNotification notification = new MyNotification("Alerte","alerte_soldes",context);
        notification.setNotification();
    }
}
