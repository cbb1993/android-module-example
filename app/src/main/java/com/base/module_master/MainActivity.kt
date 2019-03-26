package com.base.module_master

import android.arch.lifecycle.Observer
import com.base.baselib.mvvm.BaseLifecycleActivity
import com.base.baselib.mvvm.LiveBus
import com.base.data.entry.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseLifecycleActivity<MainViewModel>() {
    override fun getLayoutId(): Int {
      return R.layout.activity_main
    }

    var i :Long = 1
    override fun initViews() {
        super.initViews()


        LiveBus.getDefault().subscribe("test", User::class.java).observe(this,
            Observer<User> { user ->
                tv_hello.text = user?.name
            })

        tv_hello.setOnClickListener {
            mViewModel.getUserById(i++)
//            navigation(RouterConstant.ROUTER_TEST_1,tv_hello)
        }
    }




}
