package com.hridoydas.androidviewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hridoydas.androidviewbindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Add ActivityMainBinding to inflate it to layoutFlater pass setContentview
       val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       /* binding.textView.text="Hello I am Hridoy"
        binding.textView2.text="Now Learning View binding"

        binding.btnClickMe.setOnClickListener {
            binding.textView.text = "Hello Now learn Time"
            Toast.makeText(this, "Hello World", Toast.LENGTH_LONG).show()

        }*/

        with(binding){

            textView.text="Hello I am Hridoy"
            textView2.text="Now Learning View binding"



            btnClickMe.setOnClickListener{
                textView.text="Hello Now learn Time"
                includedLayout.fragmentLayout.text="New Writing"
               // Toast.makeText(this@MainActivity,"Hello World",Toast.LENGTH_LONG).show()
            }
        }





    }
}

