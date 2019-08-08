package com.lambdaschool.basilintentsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        text_view.text = intent.getIntExtra(MainActivity.INT_DATA_KEY, 0).toString()
    }


}
