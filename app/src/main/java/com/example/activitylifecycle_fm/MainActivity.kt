package com.example.activitylifecycle_fm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate")

        /*
        *   Activity başladığında ilk çalışmaya başlayan methodtur.
        *   Activity destroy olmadığı süreçte asla tekrar çalışamaz
        *
        * */
    }


    override fun onRestart() {
        super.onRestart()
        println("onRestart")
    }


    override fun onStart() {
        super.onStart()
        println("onStart")

        /*
        *   onCreate sonrası çalışır.
        *   onStop çalışmış ise sonrasında onRestart methodu çalışır ve sonrasında onStart çalışır.
        * */
    }

    override fun onResume() {
        super.onResume()
        println("onResume")

        /*
        *    Kullanıcı ile etkilesime geçilebilecek en iyi yerdir.
        *    onStart sonrası çalışır.
        * */
    }


    override fun onPause() {
        super.onPause()
        println("onPause")
        /*
        *   Activity arka plana gönderildiğinde; ancak öldürülmediğinde çağrılır.
        * */

    }


    override fun onStop() {
        super.onStop()
        println("onStop")

        /*
        *   onRestart veya onDestroy öncesi çalışır.
        *   Activity artık kullanıcı tarafından görüntülenemediğinde çalışır.
        * */
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")

        /*
        *   Activity tamamen yok olmadan önce gerekli olan tüm temizlik işlemleri burada yapılır.
        * */
    }


}
