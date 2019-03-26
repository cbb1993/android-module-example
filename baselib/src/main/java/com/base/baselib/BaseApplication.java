package com.base.baselib;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import com.alibaba.android.arouter.launcher.ARouter;
import com.base.baselib.utils.SystemHelper;
import com.base.data.dao.DaoMaster;
import com.base.data.dao.DaoSession;

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
        initGreenDao();
    }


    private static final String DB_NAME = "app.db";
    private static DaoSession mDaoSession;
    private void initGreenDao() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, DB_NAME);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        mDaoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoSession() {
        return mDaoSession;
    }
}
