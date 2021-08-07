package com.andariadar.deeplinks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val action = intent.action
        val data = intent.data
        if (Intent.ACTION_VIEW == action && data != null) {
            val id = data.getQueryParameter("id")
            val name = data.getQueryParameter("name")
            Toast.makeText(this, "id: $id, name: $name", Toast.LENGTH_LONG).show()
        }
    }
}