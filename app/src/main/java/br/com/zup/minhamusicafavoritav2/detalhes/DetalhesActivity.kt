package br.com.zup.minhamusicafavoritav2.detalhes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavoritav2.databinding.ActivityDetalhesBinding

class DetalhesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalhesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}