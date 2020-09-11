package com.example.android.blackholequiz

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat.recreate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var point: Int = 100
    var result: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a1 = false
        var a2 = false
        var a3 = false
        var a4 = false
        var a5 = false
        var a6 = false
        button1_a.setOnClickListener {
            button1_c.setBackgroundColor(Color.parseColor("#000000"))
            button1_b.setBackgroundColor(Color.parseColor("#000000"))
            quest1.text = ""
            button1_a.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest1.text = resources.getString(R.string.incorrect)
            point -= 5
            quest1.setTextColor(Color.parseColor("#FFCDD2"))
        }
        button1_c.setOnClickListener {
            button1_a.setBackgroundColor(Color.parseColor("#000000"))
            button1_b.setBackgroundColor(Color.parseColor("#000000"))
            quest1.text = ""
            button1_c.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest1.text = resources.getString(R.string.incorrect)
            point -= 5
            quest1.setTextColor(Color.parseColor("#FFCDD2"))
        }
        button1_b.setOnClickListener {
            button1_a.setBackgroundColor(Color.parseColor("#000000"))
            button1_c.setBackgroundColor(Color.parseColor("#000000"))
            quest1.text = ""
            button1_b.setBackgroundColor(Color.parseColor("#C8E6C9"))
            quest1.setTextColor(Color.parseColor("#C8E6C9"))
            quest1.text = resources.getString(R.string.correct)
            button1_a.isClickable = false
            button1_b.isClickable = false
            button1_c.isClickable = false
            a1 = true
            if (a1 && a2 && a3 && a4 && a5 && a6) {
                this.result()
            }
        }
        button2_a.setOnClickListener {
            button2_c.setBackgroundColor(Color.parseColor("#000000"))
            button2_b.setBackgroundColor(Color.parseColor("#000000"))
            quest2.text = ""
            button2_a.setBackgroundColor(Color.parseColor("#C8E6C9"))
            quest2.setTextColor(Color.parseColor("#C8E6C9"))
            quest2.text = resources.getString(R.string.correct)
            button2_a.isClickable = false
            button2_b.isClickable = false
            button2_c.isClickable = false
            a2 = true
            if (a1 && a2 && a3 && a4 && a5 && a6) {
                this.result()
            }
        }
        button2_c.setOnClickListener {
            button2_a.setBackgroundColor(Color.parseColor("#000000"))
            button2_b.setBackgroundColor(Color.parseColor("#000000"))
            quest2.text = ""
            button2_c.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest2.text = resources.getString(R.string.incorrect)
            point -= 5
            quest2.setTextColor(Color.parseColor("#FFCDD2"))
        }
        button2_b.setOnClickListener {
            button2_a.setBackgroundColor(Color.parseColor("#000000"))
            button2_c.setBackgroundColor(Color.parseColor("#000000"))
            quest2.text = ""
            button2_b.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest2.text = resources.getString(R.string.incorrect)
            point -= 5
            quest2.setTextColor(Color.parseColor("#FFCDD2"))
        }
        button3_b.setOnClickListener {
            button3_a.setBackgroundColor(Color.parseColor("#000000"))
            button3_c.setBackgroundColor(Color.parseColor("#000000"))
            quest3.text = ""
            button3_b.setBackgroundColor(Color.parseColor("#C8E6C9"))
            quest3.setTextColor(Color.parseColor("#C8E6C9"))
            quest3.text = resources.getString(R.string.incorrect)
            button3_a.isClickable = false
            button3_b.isClickable = false
            button3_c.isClickable = false
            a3 = true
            if (a1 && a2 && a3 && a4 && a5 && a6) {
                this.result()
            }
        }
        button3_c.setOnClickListener {
            button3_a.setBackgroundColor(Color.parseColor("#000000"))
            button3_b.setBackgroundColor(Color.parseColor("#000000"))
            quest3.text = ""
            button3_c.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest3.text = resources.getString(R.string.correct)
            point -= 5
            quest3.setTextColor(Color.parseColor("#FFCDD2"))
        }
        button3_a.setOnClickListener {
            button3_b.setBackgroundColor(Color.parseColor("#000000"))
            button3_c.setBackgroundColor(Color.parseColor("#000000"))
            quest3.text = ""
            button3_a.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest3.text = resources.getString(R.string.incorrect)
            point -= 5
            quest3.setTextColor(Color.parseColor("#FFCDD2"))
        }
        button4_b.setOnClickListener {
            button4_a.setBackgroundColor(Color.parseColor("#000000"))
            button4_c.setBackgroundColor(Color.parseColor("#000000"))
            quest4.text = ""
            button4_b.setBackgroundColor(Color.parseColor("#C8E6C9"))
            quest4.setTextColor(Color.parseColor("#C8E6C9"))
            quest4.text = resources.getString(R.string.correct)
            button4_a.isClickable = false
            button4_b.isClickable = false
            button4_c.isClickable = false
            a4 = true
            if (a1 && a2 && a3 && a4 && a5 && a6) {
                this.result()
            }
        }
        button4_c.setOnClickListener {
            button4_a.setBackgroundColor(Color.parseColor("#000000"))
            button4_b.setBackgroundColor(Color.parseColor("#000000"))
            quest4.text = ""
            button4_c.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest4.text = resources.getString(R.string.incorrect)
            point -= 5
            quest4.setTextColor(Color.parseColor("#FFCDD2"))
        }
        button4_a.setOnClickListener {
            button4_b.setBackgroundColor(Color.parseColor("#000000"))
            button4_c.setBackgroundColor(Color.parseColor("#000000"))
            quest4.text = ""
            button4_a.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest4.text = resources.getString(R.string.incorrect)
            point -= 5
            quest4.setTextColor(Color.parseColor("#FFCDD2"))
        }
        button5_b.setOnClickListener {
            button5_a.setBackgroundColor(Color.parseColor("#000000"))
            button5_c.setBackgroundColor(Color.parseColor("#000000"))
            quest5.text = ""
            button5_b.setBackgroundColor(Color.parseColor("#C8E6C9"))
            quest5.setTextColor(Color.parseColor("#C8E6C9"))
            quest5.text = resources.getString(R.string.correct)
            a5 = true
            button5_a.isClickable = false
            button5_b.isClickable = false
            button5_c.isClickable = false
            if (a1 && a2 && a3 && a4 && a5 && a6) {
                this.result()
            }
        }
        button5_c.setOnClickListener {
            button5_a.setBackgroundColor(Color.parseColor("#000000"))
            button5_b.setBackgroundColor(Color.parseColor("#000000"))
            quest5.text = ""
            button5_c.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest5.text = resources.getString(R.string.incorrect)
            point -= 5
            quest5.setTextColor(Color.parseColor("#FFCDD2"))
        }
        button5_a.setOnClickListener {
            button5_b.setBackgroundColor(Color.parseColor("#000000"))
            button5_c.setBackgroundColor(Color.parseColor("#000000"))
            quest5.text = ""
            button5_a.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest5.text = resources.getString(R.string.incorrect)
            point -= 5
            quest5.setTextColor(Color.parseColor("#FFCDD2"))
        }
        button6_c.setOnClickListener {
            button6_a.setBackgroundColor(Color.parseColor("#000000"))
            button6_b.setBackgroundColor(Color.parseColor("#000000"))
            quest6.text = ""
            button6_c.setBackgroundColor(Color.parseColor("#C8E6C9"))
            quest6.setTextColor(Color.parseColor("#C8E6C9"))
            quest6.text = resources.getString(R.string.correct)
            button6_a.isClickable = false
            button6_b.isClickable = false
            button6_c.isClickable = false
            a6 = true
            if (a1 && a2 && a3 && a4 && a5 && a6) {
                this.result()
            } else{
                Toast.makeText(this,"Answer all questions correctly!", Toast.LENGTH_SHORT).show()
            }
        }
        button6_b.setOnClickListener {
            button6_a.setBackgroundColor(Color.parseColor("#000000"))
            button6_c.setBackgroundColor(Color.parseColor("#000000"))
            quest6.text = ""
            button6_b.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest6.text = resources.getString(R.string.incorrect)
            point -= 5
            Toast.makeText(this,"Answer all questions correctly!", Toast.LENGTH_SHORT).show()
            quest6.setTextColor(Color.parseColor("#FFCDD2"))
        }
        button6_a.setOnClickListener {
            button6_b.setBackgroundColor(Color.parseColor("#000000"))
            button6_c.setBackgroundColor(Color.parseColor("#000000"))
            quest6.text = ""
            button6_a.setBackgroundColor(Color.parseColor("#FFCDD2"))
            quest6.text = resources.getString(R.string.incorrect)
            point -= 5
            Toast.makeText(this,"Answer all questions correctly!", Toast.LENGTH_LONG).show()
            quest6.setTextColor(Color.parseColor("#FFCDD2"))
        }
    }

    private fun result() {
        if (point < 0) {
            point = 0
            result = "Try again!"
        } else if (point < 75) {
            result = "Try again!"
        } else if ((point <= 90) && (point >= 75)) {
            result = "Not bad, but you can better."
        } else {
            result = "Excellent result!"
        }
        val intent = Intent(this, Result::class.java)
        intent.putExtra("point", point)
        intent.putExtra("result", result)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        rg_1.clearCheck()
        rg_2.clearCheck()
        rg_3.clearCheck()
        rg_4.clearCheck()
        rg_5.clearCheck()
        rg_6.clearCheck()
        this.recreate()
    }
}