package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toastButton = findViewById<Button>(R.id.buttonToast)

        toastButton.setOnClickListener {
            Toast.makeText(this,"Hi I am Toast ❤", Toast.LENGTH_LONG).show()
          //  Toast.makeText(, "", Toast.LENGTH_SHORT).show()     //toast -> Code Snippet
        }

    }
}