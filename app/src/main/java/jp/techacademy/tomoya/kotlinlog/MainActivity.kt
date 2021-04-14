package jp.techacademy.tomoya.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("トモヤ", 41, "プログラム")

        human.think()
        human.say()

        val human2 = Human("ヒロト", 12, "アンドロイド")

        human2.think()
        human2.say()

        }
}