package dora.lifecycle.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import dora.dagger.onInjectDaggerComponent

class DaggerFragmentLifecycle : FragmentManager.FragmentLifecycleCallbacks() {

    override fun onFragmentPreCreated(
        fm: FragmentManager,
        f: Fragment,
        savedInstanceState: Bundle?
    ) {
        f.onInjectDaggerComponent()
    }
}