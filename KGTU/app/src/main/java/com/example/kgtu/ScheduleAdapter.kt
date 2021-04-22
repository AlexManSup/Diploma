package com.example.kgtu


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.kgtu.databinding.ActivityScheduleBinding
import com.example.kgtu.databinding.ItemClassBinding

class ScheduleAdapter(
        var Classes: MutableList<Class>): RecyclerView.Adapter<ScheduleAdapter.ClassesHolder>() {

    private lateinit var binding: ActivityScheduleBinding

    inner class ClassesHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val binding = ItemClassBinding.bind(itemView)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassesHolder {
        return ClassesHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.item_class,
                        parent,
                        false
                )
        )
    }

    override fun onBindViewHolder(holder: ClassesHolder, position: Int) {
        val curClass = Classes[position]
        holder.itemView.apply {
            holder.binding.tvClassInfo.text = curClass.classInfo
            holder.binding.tvClassNum.text = "№"+(position+1).toString()
            holder.binding.btnOpen.setOnClickListener{
                val intent = Intent(context, MainActivity::class.java)
                context.startActivity(intent)

            }
        }
    }

    override fun getItemCount(): Int {
        return Classes.size
    }
}