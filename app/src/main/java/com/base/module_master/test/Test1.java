package com.base.module_master.test;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.base.baselib.base.BaseActivity;
import com.base.baselib.constant.RouterConstant;
import com.base.module_master.R;

@Route(path = RouterConstant.ROUTER_TEST_1)
public class Test1 extends BaseActivity {
    @Override
    public int getLayoutId() {
        return R.layout.activity_test_1;
    }
}
