package dev.immathan.lifecyclex

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivityXScreen : AppCompatActivity(), ActivityX {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        create(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        start()
    }

    override fun onResume() {
        super.onResume()
        resume()
    }

    override fun onPause() {
        super.onPause()
        pause()
    }

    override fun onStop() {
        super.onStop()
        stop()
    }

    override fun onDestroy() {
        super.onDestroy()
        destroy()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        newIntent(intent)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        saveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        restoreInstanceState(savedInstanceState)
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

    override fun newIntent(intent: Intent?) {

    }

    override fun saveInstanceState(outState: Bundle?) {

    }

    override fun restoreInstanceState(savedState: Bundle?) {

    }
}