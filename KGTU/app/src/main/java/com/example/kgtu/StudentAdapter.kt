package com.example.kgtu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

import com.example.kgtu.databinding.ActivityMainBinding
import com.example.kgtu.databinding.ItemStudentBinding


class StudentAdapter(
    var Students: MutableList<Student>
    ): RecyclerView.Adapter<StudentAdapter.StudentsHolder>() {

    private lateinit var binding: ActivityMainBinding

    inner class StudentsHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = ItemStudentBinding.bind(itemView)
    }

    fun addStud(student: Student){
        Students.add(student)
        notifyItemInserted(Students.size-1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentsHolder {

        return StudentsHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.item_student,
                        parent,
                        false
                )
        )
    }

    override fun onBindViewHolder(holder: StudentsHolder, position: Int) {
        val currentStudent = Students[position]

        holder.itemView.apply{
            holder.binding.tvName.text = currentStudent.firstName


        }
    }

    override fun getItemCount(): Int {
        return Students.size
    }
}