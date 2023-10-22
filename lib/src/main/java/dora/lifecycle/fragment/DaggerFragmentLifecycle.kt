package dora.lifecycle.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import dora.dagger.DaggerBaseFragment

class DaggerFragmentLifecycle : FragmentManager.FragmentLifecycleCallbacks() {

    override fun onFragmentCreated(fm: FragmentManager, f: Fragment, savedInstanceState: Bundle?) {
        if (f is DaggerBaseFragment<*>) {
            f.onInjectDaggerComponent()
        }
    }
}