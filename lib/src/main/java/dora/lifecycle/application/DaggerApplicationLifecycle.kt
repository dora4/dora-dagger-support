package dora.lifecycle.application

import android.app.Application
import android.content.Context
import dora.dagger.DaggerBaseApplication

class DaggerApplicationLifecycle : ApplicationLifecycleCallbacks {

    override fun attachBaseContext(base: Context) {
    }

    override fun onCreate(application: Application) {
        if (application is DaggerBaseApplication) {
            application.onInjectDaggerComponent()
        }
    }

    override fun onTerminate(application: Application) {
    }
}