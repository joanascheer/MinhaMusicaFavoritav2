package br.com.zup.minhamusicafavoritav2.detalhes.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.minhamusicafavoritav2.R
import br.com.zup.minhamusicafavoritav2.databinding.FragmentAlbumInfoBinding

class AlbumInfoFragment : Fragment() {
    private lateinit var binding: FragmentAlbumInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAlbumInfoBinding.inflate(inflater,container,false)
        return binding.root
    }

}