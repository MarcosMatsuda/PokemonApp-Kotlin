package br.com.matsuda.marcos.api

import br.com.matsuda.marcos.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonAPI {


    @GET( "pokemon/{id}")
    fun obtemPokemonPorId(@Path("id") id: Int) : Call<Pokemon>

    //fun listaPokemon() : Call<List<>>


}