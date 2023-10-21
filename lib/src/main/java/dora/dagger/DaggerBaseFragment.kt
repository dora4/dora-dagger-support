package dora.dagger

import androidx.databinding.ViewDataBinding
import dora.BaseFragment

abstract class DaggerBaseFragment<T : ViewDataBinding> : BaseFragment<T>() {

    abstract fun onInjectDaggerComponent()
}