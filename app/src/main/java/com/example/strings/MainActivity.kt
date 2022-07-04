package com.example.strings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.BulletSpan
import android.text.style.ForegroundColorSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spannable = SpannableString("Изменение текста всегда влечёт за собой вызов методов жизненного цикла TextView, в котором мы\n" +
                "модифицируем текст, меняя его цвет или размер. Представим такую ситуацию, когда в вашем\n" +
                "приложении пользователь может редактировать текст на ходу или просто настраивать внешний вид\n" +
                "экрана.")

for (i in 0 until spannable.length-1){
    if (i % 3 == 0) {
            spannable.setSpan(
                ForegroundColorSpan(resources.getColor(android.R.color.holo_blue_bright)),
                i, i+1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }
    findViewById<TextView>(R.id.textView).text = spannable


        if (i % 2 == 0) {
            spannable.setSpan(
                ForegroundColorSpan(resources.getColor(R.color.purple_200)),
                i, i+1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }

    else {
        spannable.setSpan(
            ForegroundColorSpan(resources.getColor(R.color.teal_200)),
            i, i+1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }
    findViewById<TextView>(R.id.textView).text = spannable


    }

    }}
