package app.easylink.helloworld

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hello1.setOnClickListener{text1.setText("my love")}
       // for Toast Method
        /* Code for Swap
        hello.setOnClickListener{ toast("Hello There") }
        hello.setText("Hey")
        var first: Float
            first = 1.20f
        var second = 2.45f
        println("--Before swap--")
        println("First number = $first")
        println("Second number = $second")
        // Value of first is assigned to temporary
        val temporary = first
        // Value of second is assigned to first
        first = second
        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary
        println("--After swap--")
        println("First number = $first")
        println("Second number = $second")
        */

    }
    }

