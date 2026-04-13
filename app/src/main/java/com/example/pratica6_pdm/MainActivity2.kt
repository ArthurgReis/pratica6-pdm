package com.example.pratica6_pdm

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private lateinit var textNome: TextView
    private lateinit var textEmail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.d("CicloDeVida", "onCreate - MainActivity2 - Arthur")

        textNome = findViewById(R.id.textNomeExibicao)
        textEmail = findViewById(R.id.textEmailExibicao)

        val nomeRecebido = intent.getStringExtra("NOME_EXTRA")
        val emailRecebido = intent.getStringExtra("EMAIL_EXTRA")

        textNome.text = "Nome: $nomeRecebido"
        textEmail.text = "Email: $emailRecebido"
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "onStart - MainActivity2 - Arthur")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloDeVida", "onResume - MainActivity2 - Arthur")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloDeVida", "onPause - MainActivity2 - Arthur")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloDeVida", "onStop - MainActivity2 - Arthur")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloDeVida", "onDestroy - MainActivity2 - Arthur")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CicloDeVida", "onRestart - MainActivity2 - Arthur")
    }
}