package br.com.roger.kali.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class CreateLanguageRequest {

    @JsonProperty("name")
    private String name;
    @JsonProperty("release_date")
    private Date releaseDate;
    @JsonProperty("last_version")
    private String lastVersion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
