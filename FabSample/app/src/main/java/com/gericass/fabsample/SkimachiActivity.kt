package com.gericass.fabsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skimachi.*

class SkimachiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skimachi)
        audio.setOnClickListener {
            Toast.makeText(this, "Audio", Toast.LENGTH_SHORT).show()
            motion_layout.transitionToStart()
        }
        brush.setOnClickListener {
            Toast.makeText(this, "Brush", Toast.LENGTH_SHORT).show()
            motion_layout.transitionToStart()
        }
        smoking.setOnClickListener {
            Toast.makeText(this, "Smoking", Toast.LENGTH_SHORT).show()
            motion_layout.transitionToStart()
        }
        dining.setOnClickListener {
            Toast.makeText(this, "Dining", Toast.LENGTH_SHORT).show()
            motion_layout.transitionToStart()
        }
    }
}
