package com.example.itsTimeToMovie.data.api.service;


import com.squareup.moshi.Json;

import java.util.List;

public class FilmesResult {

    @Json(name = "results")
    private final List<FilmeResponse> resultadoFilmes;

    public FilmesResult(List<FilmeResponse> resultadoFilmes) {
        this.resultadoFilmes = resultadoFilmes;

    }

    public List<FilmeResponse> getResultadoFilmes() {
        return resultadoFilmes;
    }

}
