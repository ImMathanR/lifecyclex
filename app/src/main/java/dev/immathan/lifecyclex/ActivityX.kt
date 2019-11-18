package dev.immathan.lifecyclex

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

interface ActivityX : LifecycleX {
    fun newIntent(intent: Intent?)
}