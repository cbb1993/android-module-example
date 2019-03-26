package com.base.module_master

import android.app.Application
import com.base.lib.mvvm.BaseViewModel

open class MainViewModel(app:Application):BaseViewModel<MainRsp>(app){

    fun getUser() {
        mRepository?.getUser()
    }

    fun getUserById(id:Long) {
        mRepository?.getUserById(id)
    }
}