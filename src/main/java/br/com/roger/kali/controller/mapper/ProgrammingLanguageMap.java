package br.com.roger.kali.controller.mapper;

import br.com.roger.kali.controller.request.CreateLanguageRequest;
import br.com.roger.kali.model.ProgrammingLanguage;

public class ProgrammingLanguageMap {

    public static ProgrammingLanguage map(CreateLanguageRequest request) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(request.getName());
        programmingLanguage.setLastVersion(request.getLastVersion());
        programmingLanguage.setReleaseDate(request.getReleaseDate());
        return programmingLanguage;
    }
}
