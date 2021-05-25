package nik.iant.permiter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class showList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_list)
        title = "Please Select your Food"
        setTheme(android.R.style.Theme_DeviceDefault_Light_NoActionBar)

        val myRecycler = findViewById<RecyclerView>(R.id.rcvVegies)
        val lmm = LinearLayoutManager(this)
        val myAdapter = VegAdapter(this, arrayOf(
            "Tomato","Potato"
        ))
        Toast.makeText(this, myAdapter.itemCount.toString(), Toast.LENGTH_SHORT).show()
        myRecycler.layoutManager = lmm
        myRecycler.adapter = myAdapter

    }
}