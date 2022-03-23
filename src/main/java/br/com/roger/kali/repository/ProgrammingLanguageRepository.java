package br.com.roger.kali.repository;

import br.com.roger.kali.model.ProgrammingLanguage;
import br.com.roger.kali.repository.entity.ProgrammingLanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguageEntity, Long> {
    public ProgrammingLanguageEntity save(ProgrammingLanguageEntity programmingLanguage);
}
