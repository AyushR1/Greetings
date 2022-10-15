package com.ayushr1.greetings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ButtonClick(view: View) {
        Toast.makeText(this,"Button was cliucked",Toast.LENGTH_LONG).show()
    }
}