package com.example.test_lib_denoise

import android.util.Log
import io.flutter.embedding.android.FlutterActivity

class MainActivity : FlutterActivity() {
    init {
        try {
            System.loadLibrary("audio_recorder")
        } catch (e: UnsatisfiedLinkError) {
            Log.e("MainActivity", "Failed to load libaudio_recorder.so", e)
        }
    }
}
