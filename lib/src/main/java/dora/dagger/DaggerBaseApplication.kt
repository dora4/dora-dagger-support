package dora.dagger

import dora.BaseApplication

abstract class DaggerBaseApplication : BaseApplication() {

    abstract fun onInjectDaggerComponent()
}