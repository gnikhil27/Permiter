package nik.iant.permiter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class showList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_list)
        title = "Please Select your Food"
        setTheme(android.R.style.Theme_DeviceDefault_Light_NoActionBar)
    }
}