package dora.dagger

import androidx.databinding.ViewDataBinding
import dora.BaseActivity

abstract class DaggerBaseActivity<T : ViewDataBinding> : BaseActivity<T>() {

    abstract fun onInjectDaggerComponent()
}