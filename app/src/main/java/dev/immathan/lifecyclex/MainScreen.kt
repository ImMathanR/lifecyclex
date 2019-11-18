package dev.immathan.lifecyclex

import android.os.Bundle

class MainScreen : BaseActivityXScreen() {

    override fun create(savedState: Bundle?) {
        super.create(savedState)
        setContentView(R.layout.activity_main)
    }

}