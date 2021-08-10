package com.example.snquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class Result_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username

        val correctAns = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTION,0)

        tv_score.text = ("Your Score is $correctAns out of $totalQuestion")

        btn_finish.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        })
    }
}