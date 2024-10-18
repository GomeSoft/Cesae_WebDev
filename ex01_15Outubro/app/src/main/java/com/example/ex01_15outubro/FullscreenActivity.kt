package com.example.ex01_15outubro

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import androidx.appcompat.app.AppCompatActivity
import com.example.ex01_15outubro.databinding.ActivityFullscreenBinding

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FullscreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFullscreenBinding

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.addFlags(
                windowManager.LayoutParams.FLAG_FULLSCREEN,
            )
        }
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.setFlags(
                windowManager.LayoutParams.FLAG_FULLSCREEN,
                windowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        window.addFlags(windowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }
}