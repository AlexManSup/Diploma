package com.example.kgtu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kgtu.databinding.ActivityScheduleBinding

class Schedule : AppCompatActivity() {
    lateinit var binding: ActivityScheduleBinding
    lateinit var scheduleAdapter: ScheduleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val st1 = Class("Разработка программных комплексов. Каб. 261/6")
        val st2 = Class("Исследование операций. Каб. 261/8")
        var st : MutableList<Class> = ArrayList()
        st.add(st1)
        st.add(st2)
        binding = ActivityScheduleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        scheduleAdapter = ScheduleAdapter(st)

        binding.rvSchedule.adapter = scheduleAdapter
        binding.rvSchedule.layoutManager = LinearLayoutManager(this)

    }
}