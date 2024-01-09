package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.Group

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = "Goodbye!!!"

        val button: Button = findViewById<Button>(R.id.button)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val group: Group = findViewById<Group>(R.id.group)
        val button: Button = findViewById<Button>(R.id.button)
        if (group.visibility == View.GONE) {
            group.visibility = View.VISIBLE
//            button.setText(R.string.hide_details)
            button.setText("Hide details")
        } else {
            group.visibility = View.GONE
//            button.setText(R.string.show_details)
            button.setText("Show details")
        }
//        TODO("Not yet implemented")
    }

}