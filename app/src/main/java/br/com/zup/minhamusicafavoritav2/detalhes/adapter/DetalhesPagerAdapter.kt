package br.com.zup.minhamusicafavoritav2.detalhes.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.zup.minhamusicafavoritav2.detalhes.fragments.AlbumInfoFragment
import br.com.zup.minhamusicafavoritav2.detalhes.fragments.AlbunsFragment

//pager adapter sempre que tiver um viewpager, adapter sempre que tiver um recyclerview
class DetalhesPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    //guias do meu tabLayout
    private var listaTitulos: List<String>,
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = listaTitulos.size

    //sempre que usar viewpager, tem que usar fragmentos junto
    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return AlbumInfoFragment()
            1 -> return AlbunsFragment()
        }
        return AlbumInfoFragment()
    }
}