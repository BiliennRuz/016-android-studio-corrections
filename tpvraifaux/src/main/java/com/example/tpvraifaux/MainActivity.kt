package com.example.tpvraifaux

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tpvraifaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val arrayListQR = arrayOf(
        QuestionReponse("Est-ce qu'on peut s'en servir pour donner de l'élan" +
                "à un pigeon",false),
        QuestionReponse("Est-ce que le soleil est chaud",true),
        QuestionReponse("Est-ce que le Java est un langage bas niveau?",false),
        QuestionReponse("Est-ce qu'Android est un langage de programmation",false),
        QuestionReponse("Un iphone tourne t-il sur Android",false),
        QuestionReponse("Philéas va t-il amener les pains aux choc demain?",false),
        QuestionReponse("Est-il légal d'appeler les pains au chocs : chocolatines",false),
    )
    var index = 0
    var score = 0
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.qr = arrayListQR[index]
        showScore()
        binding.buttonFaux.setOnClickListener { checkUserResponse(false) }
        binding.buttonVrai.setOnClickListener { checkUserResponse(true) }
    }
    fun checkUserResponse(responseUser: Boolean){
        if(index > arrayListQR.size-1) return
        if(responseUser == arrayListQR[index].reponse){
            //il a raison score++
            score++
            showScore()
        }
        if(index++ < (arrayListQR.size -1)){
            //Affichage question suivantes
            binding.qr = arrayListQR[index]
        }
    }
    fun showScore(){
        binding.textViewScore.text = "${score.toString()}/${arrayListQR.size}"
    }
}