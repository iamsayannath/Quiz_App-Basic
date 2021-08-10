package com.example.snquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_btn.setOnClickListener(View.OnClickListener {
            if(textField.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter your name ",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, textField.text.toString())
                startActivity(intent)
                finish()
            }
        })
    }
}