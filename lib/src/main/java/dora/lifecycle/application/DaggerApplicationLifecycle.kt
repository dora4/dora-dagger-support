package dora.lifecycle.application

import android.app.Application
import android.content.Context
import dora.dagger.onInjectDaggerComponent

class DaggerApplicationLifecycle : ApplicationLifecycleCallbacks {

    override fun attachBaseContext(base: Context) {
    }

    override fun onCreate(application: Application) {
        application.onInjectDaggerComponent()
    }

    override fun onTerminate(application: Application) {
    }
}