package com.tistory.deque.kotlinmvvmsample

import android.app.Application
import com.tistory.deque.kotlinmvvmsample.di.myDiModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(applicationContext, myDiModule)
    }
}