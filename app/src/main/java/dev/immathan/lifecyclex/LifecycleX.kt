package dev.immathan.lifecyclex

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

interface LifecycleX {

    fun create(savedState: Bundle?)

    fun start()

    fun resume()

    fun pause()

    fun stop()

    fun destroy()

    fun restart()

    fun saveInstanceState(outState: Bundle?)

    fun restoreInstanceState(savedState: Bundle?)

}