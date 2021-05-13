package nik.iant.permiter

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Resources
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_DeviceDefault_Light_NoActionBar)
        setContentView(R.layout.activity_main)
        val btnCaller = findViewById<Button>(R.id.btnCall)
        findViewById<Button>(R.id.btnList).setOnClickListener {
            val myListActivity = Intent(this, showList::class.java)
            startActivity(myListActivity)
        }
        btnCaller.setOnClickListener{
            try{

                //Check if i have Permission
                if(ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    // Ask for the Permission
                    ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 0)
                    //Check if i was given permission
                    if(ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                        callMe()
                    else findViewById<TextView>(R.id.txtlog).text = "Sorry, We Require permission to call"
                }
                else // if I have permission Call the Number
                    callMe()
            }catch (Ex:Exception)
            {
                findViewById<TextView>(R.id.txtlog).text = Ex.message
            }
        }
    }

    fun callMe()
    {
        val callPage = Intent(Intent.ACTION_CALL)
        callPage.data = Uri.parse("tel:919998887650")
        startActivity(callPage)
    }
}