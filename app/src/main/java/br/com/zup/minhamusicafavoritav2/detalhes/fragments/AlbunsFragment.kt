package br.com.zup.minhamusicafavoritav2.detalhes.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.minhamusicafavoritav2.R
import br.com.zup.minhamusicafavoritav2.databinding.FragmentAlbunsBinding

class AlbunsFragment : Fragment() {
private lateinit var binding: FragmentAlbunsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAlbunsBinding.inflate(inflater,container,false)
        return binding.root
    }

}