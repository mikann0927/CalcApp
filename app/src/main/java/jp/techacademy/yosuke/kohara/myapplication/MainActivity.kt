package jp.techacademy.yosuke.kohara.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        try {

            val intent = Intent(this, SecondActivity::class.java)

            val str1 = editText1.text.toString()
            val str2 = editText2.text.toString()
            var a = str1.toDouble()
            var b = str2.toDouble()
            var result = 0.0

            if (v != null) {
                if (v.id == R.id.button1) {
                    result = a + b
                } else if (v.id == R.id.button2) {
                    result = a - b
                } else if (v.id == R.id.button3) {
                    result = a * b
                } else if (v.id == R.id.button4) {
                    result = a / b
                }
                intent.putExtra("VALUE1", a)
                intent.putExtra("VALUE2", b)
                intent.putExtra("result", result)
                startActivity(intent)
            }
        } catch (e : Exception) {
        }
    }
}