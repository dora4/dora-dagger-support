package dora.lifecycle.config

import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment
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
        /**
         * 根据官方源码的说法，按理说应该在这里注入依赖，但是实际测试的结果是注入失败。Dagger依赖注入到Fragment目前
         * 请手动添加注入代码到[Fragment.onCreate]的最前面，super调用之前。
         *
         * @see FragmentManager.FragmentLifecycleCallbacks.onFragmentPreCreated
         */
//        lifecycles?.add(DaggerFragmentLifecycle())
    }
}