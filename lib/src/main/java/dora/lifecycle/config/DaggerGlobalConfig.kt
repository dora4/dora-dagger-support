package dora.lifecycle.config

import android.app.Application
import android.content.Context
import androidx.fragment.app.FragmentManager
import dora.lifecycle.activity.DaggerActivityLifecycle
import dora.lifecycle.application.ApplicationLifecycleCallbacks
import dora.lifecycle.application.DaggerApplicationLifecycle
import dora.lifecycle.fragment.DaggerFragmentLifecycle

class DaggerGlobalConfig : GlobalConfig {

    override fun injectApplicationLifecycle(
        context: Context?,
        lifecycles: MutableList<ApplicationLifecycleCallbacks>?
    ) {
        lifecycles?.add(DaggerApplicationLifecycle())
    }

    override fun injectActivityLifecycle(
        context: Context?,
        lifecycles: MutableList<Application.ActivityLifecycleCallbacks>?
    ) {
        lifecycles?.add(DaggerActivityLifecycle())
    }

    override fun injectFragmentLifecycle(
        context: Context?,
        lifecycles: MutableList<FragmentManager.FragmentLifecycleCallbacks>?
    ) {
        lifecycles?.add(DaggerFragmentLifecycle())
    }
}