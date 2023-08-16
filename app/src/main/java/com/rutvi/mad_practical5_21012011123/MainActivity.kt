package com.rutvi.mad_practical5_21012011123

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Browser
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnBrowser:Button=findViewById(R.id.buttonBrowser)
        val editBrowser:EditText=findViewById(R.id.editTextBrowser)
        btnBrowser.setOnClickListener {
            browser(editBrowser.text.toString())
        }
    }
    fun browser(url:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also{startActivity(it)}
    }
    fun call(no:String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$")).also { startActivity(it) }

    }
}
