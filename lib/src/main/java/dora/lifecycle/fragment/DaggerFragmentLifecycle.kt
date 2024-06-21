package dora.lifecycle.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import dora.dagger.DaggerBaseFragment

class DaggerFragmentLifecycle : FragmentManager.FragmentLifecycleCallbacks() {

    /**
     * 根据官方源码的说法，按理说应该在这里注入依赖，但是实际测试的结果是注入失败。所以此代码只做参考，
     * 在[DaggerBaseFragment]中调用了注入代码。
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