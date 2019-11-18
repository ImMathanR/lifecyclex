package dev.immathan.lifecyclex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

abstract class BaseFragmentXScreen : Fragment(), FragmentX {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        create(savedInstanceState)
    }

    override fun onPause() {
        super.onPause()
        pause()
    }

    override fun onResume() {
        super.onResume()
        resume()
    }

    override fun onStart() {
        super.onStart()
        start()
    }

    override fun onStop() {
        super.onStop()
        stop()
    }

    override fun onDestroy() {
        super.onDestroy()
        destroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        saveInstanceState(outState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        throw RuntimeException("Fragment screen should be extending this")
    }

    override fun createView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return TextView(container?.context)
    }

    override fun create(savedState: Bundle?) {
    }

    override fun start() {
    }

    override fun resume() {
    }

    override fun pause() {
    }

    override fun stop() {
    }

    override fun destroy() {
    }

    override fun restart() {
    }

    override fun saveInstanceState(outState: Bundle?) {
    }

    override fun restoreInstanceState(savedState: Bundle?) {
    }

}