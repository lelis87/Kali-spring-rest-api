package br.com.roger.kali.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class DeleteLanguageRequest {
    @JsonProperty("name")
    private String nome;
    @JsonProperty("release_date")
    private Date releasingDate;
    @JsonProperty("last_version")
    private String lastVersion;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getReleasingDate() {
        return releasingDate;
    }

    public void setReleasingDate(Date releasingDate) {
        this.releasingDate = releasingDate;
    }

    public String getLastVersion() {
        return lastVersion;
    }

    public void setLastVersion(String lastVersion) {
        this.lastVersion = lastVersion;
    }
}
