package dev.immathan.lifecyclex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

interface FragmentX : LifecycleX {

    fun createView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View

}