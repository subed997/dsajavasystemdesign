package com.example.syedubedulla.springcrud.services;

import com.example.syedubedulla.springcrud.models.Characters;
import com.example.syedubedulla.springcrud.repositories.SuperheroCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CRUDService
{
    @Autowired
    SuperheroCharacterRepository superheroCharacterRepository;
    public void createSuperhero(Characters character)
    {
        superheroCharacterRepository.save(character);
    }

    public Characters readSuperheroById(int val)
    {
        return superheroCharacterRepository.findById(val).get();
    }

    public void updateSuperHeroHumanName(Characters superhero, int id)
    {
        Characters superheroToBeUpdated = readSuperheroById(id);
        superheroToBeUpdated.setHumanName(superhero.getHumanName());
        superheroCharacterRepository.save(superheroToBeUpdated);
    }

    public void deleteSuperHero(int id)
    {
        superheroCharacterRepository.deleteById(id);
    }
}
