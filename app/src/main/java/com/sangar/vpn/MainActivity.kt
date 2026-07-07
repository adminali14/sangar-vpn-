package com.sangar.vpn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(40, 60, 40, 40)

        val title = TextView(this)
        title.text = "Sangar VPN"
        title.textSize = 30f

        val sub = EditText(this)
        sub.hint = "Subscription URL"

        val button = Button(this)
        button.text = "اتصال"

        val status = TextView(this)
        status.text = "وضعیت: آماده"

        button.setOnClickListener {
            status.text = "وضعیت: در حال اتصال..."
        }

        layout.addView(title)
        layout.addView(sub)
        layout.addView(button)
        layout.addView(status)

        setContentView(layout)
    }
}
