package com.example.tourdefrance

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val todayStage = DateToStage.dateToStage[LocalDate.now()]
        stage.setText(todayStage?.toString())
        viewProfileButton.setOnClickListener{
            if(stage.text.isNotEmpty()){
                openStageProfile(Integer.parseInt(stage.text.toString()))
            }
            else{
                Toast.makeText(applicationContext, "Stage must not be empty", Toast.LENGTH_SHORT).show()
            }
        }
        openRaceCenterButton.setOnClickListener{
            openRaceCenter();
        }
        tdfImage.setOnClickListener{
            openPrincipal()
        }
    }

    private fun openPrincipal(){
        openUri("https://www.letour.fr/fr/")
    }

    private fun openRaceCenter(){
        openUri("https://racecenter.letour.fr/fr/")
    }

    private fun openStageProfile(stage: Int){
        if(stage < 1 || stage > 21) {
            Toast.makeText(applicationContext, "Stage must be a number between 1 and 21", Toast.LENGTH_SHORT).show()
        }else{
            openUri("https://www.letour.fr/fr/etape-$stage")
        }
    }

    private fun openUri(uri: String){
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
        startActivity(browserIntent)
    }

}