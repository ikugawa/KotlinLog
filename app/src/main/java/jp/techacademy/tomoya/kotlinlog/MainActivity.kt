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

        val human2 = Human("ヒロト", 12, "プログラム")

        human2.say()
        Log.d("kotlintest", "私の名前は" + human2.name +"です。" + human2.age +"歳になりました。")
        }
}