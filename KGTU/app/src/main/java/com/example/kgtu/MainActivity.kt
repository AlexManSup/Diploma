package com.example.kgtu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kgtu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var studentAdapter: StudentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val st1 = Student("student #1",false)
        var st : MutableList<Student> = ArrayList()

        for (i in 1..15 ){
            val st1 = Student("Имя и фамилия студента № "+i.toString(),false)
            st.add(st1)
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        studentAdapter = StudentAdapter(st)

        binding.rvStudentList.adapter = studentAdapter
        binding.rvStudentList.layoutManager = LinearLayoutManager(this)

        binding.btApprove.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            this.finish()
        }

    }

}