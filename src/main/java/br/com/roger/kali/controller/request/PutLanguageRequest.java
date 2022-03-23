package br.com.roger.kali.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class PutLanguageRequest {
    @JsonProperty("name")
    private String nome;
    @JsonProperty("release_date")
    private Date releaseDate;
    @JsonProperty("last_version")
    private String lastVersion;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLastVersion() {
        return lastVersion;
    }

    public void setLastVersion(String lastVersion) {
        this.lastVersion = lastVersion;
    }
}
