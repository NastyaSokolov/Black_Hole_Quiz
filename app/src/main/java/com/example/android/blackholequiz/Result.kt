package com.example.android.blackholequiz

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.ColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.TintAwareDrawable
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        textResult.text = intent.getStringExtra("result")
        progress.progress=intent.getIntExtra("point", 50)

        pr.text = intent.getIntExtra("point", 50).toString() + "%"
        textAgain.setOnClickListener {
            finish()
        }
    }
}