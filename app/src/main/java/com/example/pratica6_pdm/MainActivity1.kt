package com.example.pratica6_pdm

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity1 : AppCompatActivity() {

    private lateinit var editNome: EditText
    private lateinit var editEmail: EditText
    private lateinit var btnEnviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        Log.d("CicloDeVida", "onCreate - MainActivity1 - Arthur")

        editNome = findViewById(R.id.editNome)
        editEmail = findViewById(R.id.editEmail)
        btnEnviar = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("NOME_EXTRA", editNome.text.toString())
                putExtra("EMAIL_EXTRA", editEmail.text.toString())
            }
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "onStart - MainActivity1 - Arthur")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloDeVida", "onResume - MainActivity1 - Arthur")
        recuperarDados()
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloDeVida", "onPause - MainActivity1 - Arthur")
        salvarDados()
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloDeVida", "onStop - MainActivity1 - Arthur")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloDeVida", "onDestroy - MainActivity1 - Arthur")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("CicloDeVida", "onRestart - MainActivity1 - Arthur")
    }

    private fun salvarDados() {
        val sharedPref = getSharedPreferences("FormularioPrefs", MODE_PRIVATE)
        with(sharedPref.edit()) {
            putString("NOME_SALVO", editNome.text.toString())
            putString("EMAIL_SALVO", editEmail.text.toString())
            apply()
        }
        Log.d("CicloDeVida", "Função salvarDados chamada - Dados salvos")
    }

    private fun recuperarDados() {
        val sharedPref = getSharedPreferences("FormularioPrefs", MODE_PRIVATE)
        val nome = sharedPref.getString("NOME_SALVO", "")
        val email = sharedPref.getString("EMAIL_SALVO", "")

        editNome.setText(nome)
        editEmail.setText(email)
        Log.d("CicloDeVida", "Função recuperarDados chamada - Dados recuperados")
    }
}