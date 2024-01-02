package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonSkills = findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener {
            intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }
        val buttonSchool = findViewById<Button>(R.id.btnSchool)
        buttonSchool.setOnClickListener {
            intent = Intent(this,SchoolActivity::class.java)
            startActivity(intent)
        }
        val buttonCollege = findViewById<Button>(R.id.btnCollege)
        buttonCollege.setOnClickListener {
            intent = Intent(this,CollegeActivity::class.java)
            startActivity(intent)
        }
        val buttonProject = findViewById<Button>(R.id.btnProjects)
        buttonProject.setOnClickListener {
            intent = Intent(this,ProjectActivity::class.java)
            startActivity(intent)
        }
        val buttonCertify = findViewById<Button>(R.id.btnCertify)
        buttonCertify.setOnClickListener {
            intent = Intent(this,CertifyActivity::class.java)
            startActivity(intent)
        }
        val buttonContact = findViewById<Button>(R.id.btnContact)
        buttonContact.setOnClickListener {
            intent = Intent(this,ContactActivity::class.java)
            startActivity(intent)
        }
    }
}