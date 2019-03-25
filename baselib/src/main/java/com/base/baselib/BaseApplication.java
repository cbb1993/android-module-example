package com.base.baselib;

import android.app.Application;
import com.alibaba.android.arouter.launcher.ARouter;
import com.base.baselib.utils.SystemHelper;

public class BaseApplication extends Application {
    public static Application application;
    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        initARouter();
    }

    private void initARouter() {
        if (SystemHelper.isDebug(this)) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
