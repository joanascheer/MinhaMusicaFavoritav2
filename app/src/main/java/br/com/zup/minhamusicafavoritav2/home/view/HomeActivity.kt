package br.com.zup.minhamusicafavoritav2.home.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.minhamusicafavoritav2.databinding.ActivityHomeBinding
import br.com.zup.minhamusicafavoritav2.detalhes.DetalhesActivity

class HomeActivity : AppCompatActivity() {
private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetalhes.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)
            startActivity(intent)
        }
    }
}