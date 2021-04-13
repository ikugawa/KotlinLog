package jp.techacademy.tomoya.kotlinlog

import android.util.Log

open class Human:Animal, thinkable {


    constructor(name: String, age: Int, hobby: String): super(name, age, hobby){
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。")
        Log.d("kotlintest", "年は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }

}