package com.gericass.fabsample

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import uk.co.markormesher.android_fab.FloatingActionButton
import uk.co.markormesher.android_fab.SpeedDialMenuAdapter
import uk.co.markormesher.android_fab.SpeedDialMenuItem

class MainActivity : AppCompatActivity() {

    private val fabAdapter = object : SpeedDialMenuAdapter() {
        override fun getCount(): Int = 3

        override fun getMenuItem(context: Context, position: Int): SpeedDialMenuItem {
            return when (position) {
                0 -> SpeedDialMenuItem(context, R.drawable.ic_audiotrack_24dp, "Audio")
                1 -> SpeedDialMenuItem(context, R.drawable.ic_brush_24dp, "Brush")
                2 -> SpeedDialMenuItem(context, R.drawable.ic_local_dining_24dp, "Dining")
                else -> throw IllegalArgumentException("No menu item: $position")

            }
        }

        override fun onMenuItemClick(position: Int): Boolean {
            when (position) {
                0 -> Toast.makeText(applicationContext, "Audio", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(applicationContext, "Brush", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(applicationContext, "Dining", Toast.LENGTH_SHORT).show()
            }
            return super.onMenuItemClick(position)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.speedDialMenuAdapter = fabAdapter
        val button = findViewById<Button>(R.id.button_skimach)
        button.setOnClickListener {
            Intent(this, SkimachiActivity::class.java).run {
                startActivity(this)
            }
        }
    }
}
