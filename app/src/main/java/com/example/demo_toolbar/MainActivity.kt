package com.example.demo_toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Le indicamos a la vista que incluya nuestro custom-toolbar
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        title="Custom toolbar"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // menuInflater nos permite inyectar un recurso xml (menu_items) en el menu
        // R. => Carpeta de Recursos de android
        // menu. => Carpeta del recurso al que queremos acceder
        menuInflater.inflate(R.menu.menu_items, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_chat -> chat()
            R.id.action_info -> info()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun info() {
        Log.d(tag, "Info Clicked")
    }

    private fun chat() {
        Log.d(tag, "chat Clicked")
    }
}