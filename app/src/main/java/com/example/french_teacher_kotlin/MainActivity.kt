package com.example.french_teacher_kotlin

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.MediaController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SayTheColor(view: View){
        val clickedButton : Button = view as Button
        var mediaPlayer : MediaPlayer = MediaPlayer.create(this, resources.getIdentifier(clickedButton.tag.toString(), "raw" , packageName))
        mediaPlayer.start()
    }
}