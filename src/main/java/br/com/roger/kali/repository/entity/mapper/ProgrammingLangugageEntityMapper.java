package br.com.roger.kali.repository.entity.mapper;


import br.com.roger.kali.model.ProgrammingLanguage;
import br.com.roger.kali.repository.entity.ProgrammingLanguageEntity;

public class ProgrammingLangugageEntityMapper {
    public static ProgrammingLanguageEntity map(ProgrammingLanguage programmingLanguage) {
        var entity = new ProgrammingLanguageEntity();
        entity.setId(programmingLanguage.getId());
        entity.setName(programmingLanguage.getName());
        entity.setLastVersion(programmingLanguage.getLastVersion());
        entity.setReleaseDate(programmingLanguage.getReleaseDate());
        return entity;
    }
    public static ProgrammingLanguage map(ProgrammingLanguageEntity programmingLanguageEntity){
        var programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setId(programmingLanguageEntity.getId());
        programmingLanguage.setName(programmingLanguage.getName());
        programmingLanguage.setReleaseDate(programmingLanguage.getReleaseDate());
        programmingLanguage.setLastVersion(programmingLanguage.getLastVersion());
        return programmingLanguage;
    }
}
