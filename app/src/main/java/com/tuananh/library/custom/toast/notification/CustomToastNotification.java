package com.tuananh.library.custom.toast.notification;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.tuananh.library.custom.toast.notification.databinding.CustomToastNotificationBinding;

/**
 * Created by FRAMGIA\vu.tuan.anh on 06/07/2017.
 */
public class CustomToastNotification extends LinearLayout {
    private Context mContext;
    private CustomToastNotificationBinding mBinding;
    private String mMessage;
    private String mTitle;

    public CustomToastNotification(Context context) {
        super(context);
        init(context);
    }

    public CustomToastNotification(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomToastNotification(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomToastNotification(Context context, AttributeSet attrs, int defStyleAttr,
                                   int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        mContext = context;
        mBinding = DataBindingUtil
            .inflate(LayoutInflater.from(mContext), R.layout.custom_toast_notification, this, true);
        mBinding.setViewModel(this);
    }

    public String getTitle() {
        if (TextUtils.isEmpty(mTitle)) {
            return getResources().getString(R.string.app_name);
        }
        return mTitle;
    }

    public CustomToastNotification setTitle(String title) {
        mTitle = title;
        return this;
    }

    public String getMessage() {
        return mMessage;
    }

    public CustomToastNotification setMessage(String message) {
        mMessage = message;
        return this;
    }

    public CustomToastNotification setBackground(int id) {
        mBinding.notificationBackground.setBackground(ContextCompat.getDrawable(mContext, id));
        return this;
    }

    public void setBackgroundResource(int resId) {
        mBinding.notificationBackground.setBackgroundResource(resId);
    }
}
