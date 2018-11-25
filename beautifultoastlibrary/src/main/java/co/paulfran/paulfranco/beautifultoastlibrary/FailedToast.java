package co.paulfran.paulfranco.beautifultoastlibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FailedToast extends LinearLayout {

    public FailedToast(Context context, String message) {
        super(context);
        show(context, message);
    }

    private void show(Context context, String message) {

        View view = LayoutInflater.from(context).inflate(R.layout.success_toast, this, true);

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(message);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }
}
