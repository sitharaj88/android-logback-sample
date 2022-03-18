package com.sitharaj.log

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.slf4j.LoggerFactory
import org.slf4j.Logger;

class MainActivity : AppCompatActivity() {
    var log: Logger = LoggerFactory.getLogger(MainActivity::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log.info("hello world");
    }
}