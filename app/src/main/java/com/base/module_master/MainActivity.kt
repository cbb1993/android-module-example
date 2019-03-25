package com.base.module_master

import com.base.baselib.base.BaseActivity
import com.base.baselib.constant.RouterConstant
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun getLayoutId(): Int {
      return R.layout.activity_main
    }


    override fun initViews() {
        super.initViews()

        tv_hello.setOnClickListener {
            navigation(RouterConstant.ROUTER_TEST_1)
        }
    }

}
