package com.sy.crashlogdemo.crashdemo;

import android.annotation.SuppressLint;

/**
 * 创建时间： 2017/9/26 0026.
 * 编写人：Tina
 * 邮箱：1208156801@qq.com
 * 功能描述：
 */
@SuppressLint("SimpleDateFormat")
public class CrashHandler implements Thread.UncaughtExceptionHandler{
    private static String TAG  = CrashHandler.class.getSimpleName();
    //系统默认的UncaughtException

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {

    }
}
