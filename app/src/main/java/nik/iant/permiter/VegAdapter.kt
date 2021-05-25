package nik.iant.permiter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class VegAdapter(private val nContext: Context, private val lstVeg: Array<String>):RecyclerView.Adapter<VegAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun setCheckBox(string: String){
            val checkBox = itemView.findViewById<CheckBox>(R.id.txtFoodItem)
            checkBox.text = string
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_vegitables, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //Toast.makeText(nContext, "Called", Toast.LENGTH_SHORT).show()
        holder.setCheckBox(lstVeg[position])
    }

    override fun getItemCount(): Int {
        return lstVeg.count()
    }
}