package com.example.registrationform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

     private lateinit var name: EditText
     private lateinit var surname: EditText
     private lateinit var mail: EditText
     private lateinit var pass: EditText
     private lateinit var box: CheckBox
     private lateinit var jigglybutt: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.personame)
        surname = findViewById(R.id.persurname)
        mail = findViewById(R.id.pemail)
        pass = findViewById(R.id.perword)
        box = findViewById(R.id.mark)
        jigglybutt = findViewById(R.id.clicker)

        jigglybutt.setOnClickListener {

            val firstname = name.text.toString().trim()
            val lastname = surname.text.toString().trim()
            val email = mail.text.toString().trim()
            val password = pass.text.toString().trim()
            val checker = box


            if (firstname.isEmpty()){
                name.error = "გთხოვთ შეიყვანოთ სახელი"
                return@setOnClickListener
            }else if (lastname.isEmpty()){
                surname.error = "გთხოვთ შეიყვანოთ გვარი"
                return@setOnClickListener
            }else if (email.isEmpty()){
                mail.error = "გთხოვთ შეიყვანოთ მეილი"
            }else if (password.isEmpty()){
                pass.error = "გთხოვთ შეიყვანოთ პაროლი"
                return@setOnClickListener
            }else if (password.length < 6){
                pass.error = "პაროლი უნდა შეიცავდეს 5 - ზე მეტ სიმბოლოს"
                return@setOnClickListener
            }else if (!checker.isChecked) {
                box.error = "გთხოვთ დაეთანხმოთ პირობებს"
                return@setOnClickListener
            }else {
                Toast.makeText(this, "კოდი მუშაობს", Toast.LENGTH_LONG).show()
            }




        }


    }
}