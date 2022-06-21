package br.com.zup.minhamusicafavorita.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

class Album(
    private val foto: Int,
    private val artista: String = "Coldplay",
    private val lancamento: Int,
    private val gravadora: String,
    private val estudio: String,
    private val formato: String,
    private val genero: String = "Rock Alternativo",
    private val descricao: String = "Descrição geral",
    private val nome: String,
)