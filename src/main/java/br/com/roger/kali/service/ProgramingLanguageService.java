package br.com.roger.kali.service;

import br.com.roger.kali.model.ProgrammingLanguage;
import br.com.roger.kali.repository.ProgrammingLanguageRepository;
import br.com.roger.kali.repository.entity.mapper.ProgrammingLangugageEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProgramingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgramingLanguageService(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    public ProgrammingLanguage create(ProgrammingLanguage p){
        var entity = ProgrammingLangugageEntityMapper.map(p);
        var result =  programmingLanguageRepository.save(entity);
        return ProgrammingLangugageEntityMapper.map(result);
    }


}
