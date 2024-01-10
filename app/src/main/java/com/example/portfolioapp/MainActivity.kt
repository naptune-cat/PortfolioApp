package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val skills = findViewById<Button>(R.id.skills)
        skills.setOnClickListener {
            intent = Intent(this , skillsActivity::class.java)
            startActivity(intent)
        }
        val edu = findViewById<Button>(R.id.edu)
        edu.setOnClickListener {
            intent =Intent(this,EduActivity::class.java)
            startActivity(intent)
        }
        val project=findViewById<Button>(R.id.projects)
        project.setOnClickListener {
            intent = Intent(this, ActivityProject::class.java)
            startActivity(intent)
        }
        val works=findViewById<Button>(R.id.work)
        works.setOnClickListener {
            intent = Intent(this,ActivityWork::class.java)
            startActivity(intent)
        }
    }
}