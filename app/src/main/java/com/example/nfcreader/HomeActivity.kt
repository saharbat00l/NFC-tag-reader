package com.example.nfcreader

import android.nfc.tech.Ndef
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val nfcTagId = intent.getStringExtra("NFC_TAG_ID")

        if (nfcTagId != null) {
            val textView = findViewById<TextView>(R.id.tagtext)
            textView.text = "NFC Tag Connected of ID: $nfcTagId"
        }
    }
}