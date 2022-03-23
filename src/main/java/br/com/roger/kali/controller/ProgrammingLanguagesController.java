package br.com.roger.kali.controller;

import br.com.roger.kali.controller.mapper.ProgrammingLanguageMap;
import br.com.roger.kali.controller.request.CreateLanguageRequest;
import br.com.roger.kali.controller.request.PatchLanguageRequest;
import br.com.roger.kali.controller.request.PutLanguageRequest;
import br.com.roger.kali.model.ProgrammingLanguage;
import br.com.roger.kali.service.ProgramingLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/programming-languages")
public class ProgrammingLanguagesController {

    private ProgramingLanguageService programingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgramingLanguageService programingLanguageService) {
        this.programingLanguageService = programingLanguageService;
    }

    @PostMapping
    public ProgrammingLanguage create(@RequestBody CreateLanguageRequest request) {
        ProgrammingLanguage programmingLanguage = ProgrammingLanguageMap.map(request);
        return programingLanguageService.create(programmingLanguage);
    }
    @GetMapping
    public List<ProgrammingLanguage> getAll() {
        return null;
    }
    @GetMapping("/{Id}")
    public ProgrammingLanguage get(@PathVariable("id") Integer id) {
        return null;
    }
    @PutMapping("/{Id}")
    public ProgrammingLanguage put(@PathVariable("id") Integer id,
                                   @RequestBody PutLanguageRequest request) {
        return null;

    }
    @PatchMapping("/{Id}")
    public ProgrammingLanguage patch(@RequestBody PatchLanguageRequest request,
                                     @PathVariable("id") Integer id){
        return null;
    }
    @DeleteMapping("/{Id}")
    public void delete(@PathVariable("id") Integer id){
    }

}
