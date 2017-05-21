package polytechnice.tobeortohave;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.NotificationCompat;
import android.util.Log;

/**
 * Created by Pierre on 19/05/2017.
 */

public class MyNotification {

    private String title;
    private String message;
    private Context context;

    public MyNotification(String title, String message, Context context) {
        this.message = message;
        this.title = title;
        this.context = context;
    }


    public void setNotification(){
        NotificationCompat.Builder builder = new android.support.v7.app.NotificationCompat.Builder(context);
        builder.setContentTitle(title)
               .setContentText("Alerte soldes à venir, dépechez vous !")
               .setTicker("AlerteTicker")
               .setSmallIcon(R.drawable.bonnet);
        Intent test = new Intent(context, MainActivity.class);
        TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(context);
        taskStackBuilder.addParentStack(MainActivity.class);
        taskStackBuilder.addNextIntent(test);
        PendingIntent pendingIntent = taskStackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(33, builder.build());
    }
}
