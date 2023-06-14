package com.example.bottom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    lateinit var Sheet:FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Sheet=findViewById(R.id.sheet)

        BottomSheetBehavior.from(Sheet).apply {

            peekHeight=500
            this.state=BottomSheetBehavior.STATE_COLLAPSED
        }
    }
}