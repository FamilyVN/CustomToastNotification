package com.tuananh.library.custom.toast.notification;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Toast;

import com.tuananh.library.custom.toast.notification.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setListener(this);
    }

    public void onShowToast() {
        CustomToastNotification customToastNotification = new CustomToastNotification(this);
        customToastNotification.setMessage("BBBB");
        Toast toast = Toast.makeText(this, "a", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP | Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(customToastNotification);
        toast.show();
    }
}
