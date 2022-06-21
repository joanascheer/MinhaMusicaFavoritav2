package br.com.zup.minhamusicafavoritav2.home.repository

import br.com.zup.minhamusicafavorita.model.Album
import br.com.zup.minhamusicafavoritav2.R

class HomeRepository {

    // fazer lista de albuns aqui. sao os dados que o detalhes vai mandar pra home
    fun getAlbumList(): List<Album> {
        val albumList = mutableListOf<Album>()

        albumList.add(
            Album(
                R.drawable.parachutes,
                "Coldplay",
                2000,
                "Capitol",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Parachutes é o álbum de estreia da banda inglesa de rock Coldplay, lançado pela gravadora Parlophone em 10 de julho de 2000 no Reino Unido. O álbum foi produzido pela própria banda e pelo produtor britânico Ken Nelson, com exceção de uma faixa que foi produzido por Chris Allison. Parachutes gerou quatro singles de sucesso \"Shiver\", \"Yellow\", \"Trouble\" e \"Don't Panic\".",
                "Parachutes"
            )
        )

        albumList.add(
            Album(
                R.drawable.rush_of_blood,
                "Coldplay",
                2002,
                "Capitol",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Desc",
                "Rush of Blood"
            )
        )

        albumList.add(
            Album(
                R.drawable.xy,
                "Coldplay",
                2004,
                "Capitol",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Desc",
                "X & Y"
            )
        )

        albumList.add(
            Album(
                R.drawable.viva_la_vida,
                "Coldplay",
                2007,
                "Parlophone",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Desc",
                "Viva la Vida"
            )
        )

        albumList.add(
            Album(
                R.drawable.myloxyloto,
                "Coldplay",
                2009,
                "Parlophone",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Desc",
                "Myloxyloto"
            )
        )

        albumList.add(
            Album(
                R.drawable.ghost_stories,
                "Coldplay",
                2012,
                "Atlantic",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Desc",
                "Ghost Stories"
            )
        )

        return albumList
    }

}