package dora.dagger

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import dora.BaseFragment

abstract class DaggerBaseFragment<T : ViewDataBinding> : BaseFragment<T>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        onInjectDaggerComponent()
        super.onCreate(savedInstanceState)
    }

    abstract fun onInjectDaggerComponent()
}