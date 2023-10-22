package dora.lifecycle.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import dora.dagger.DaggerBaseFragment

class DaggerFragmentLifecycle : FragmentManager.FragmentLifecycleCallbacks() {

    /**
     * 根据官方源码的说法，按理说应该在这里注入依赖，但是实际测试的结果是注入失败。Dagger依赖注入到Fragment目前
     * 请手动添加注入代码到[Fragment.onCreate]的最前面，super调用之前。
     *
     * @see FragmentManager.FragmentLifecycleCallbacks.onFragmentPreCreated
     */
    override fun onFragmentPreCreated(
        fm: FragmentManager,
        f: Fragment,
        savedInstanceState: Bundle?
    ) {
        if (f is DaggerBaseFragment<*>) {
            f.onInjectDaggerComponent()
        }
    }
}