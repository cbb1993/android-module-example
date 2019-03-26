package com.base.module_master

import com.base.baselib.BaseApplication
import com.base.baselib.mvvm.BaseRepository

class MainRsp : BaseRepository(){

   fun getUser(){
       val user =BaseApplication.getDaoSession().userDao.load(1)
       sendData("test",user)
   }


    fun getUserById(id:Long){
        val user =BaseApplication.getDaoSession().userDao.load(id)
        sendData("test",user)
    }


}