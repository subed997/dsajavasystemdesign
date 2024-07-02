package com.example.syedubedulla.springcrud.controllers;

import com.example.syedubedulla.springcrud.models.Characters;
import com.example.syedubedulla.springcrud.services.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MarvelCrudController
{
    @Autowired
    CRUDService crudService;
    //CRUD
    //Create API endpoint-POST
    @PostMapping(path = "create")
    public void createSuperHero(@RequestBody Characters superhero)
    {
        crudService.createSuperhero(superhero);
    }
    //Read API endpoint-GET
    //localhost:8080/read?id=1
    @GetMapping("read")
    public Characters readSuperHeroById(@RequestParam(name = "id")int val)
    {
       return crudService.readSuperheroById(val);
    }
    //Update API endpoint-PUT
    @PutMapping("update")
    public void updateSuperHeroHumanName(@RequestBody Characters superhero,@RequestParam(name = "id") int id)
    {
        crudService.updateSuperHeroHumanName(superhero, id);
    }
    //Delete API endpoint-DELETE
    @DeleteMapping("delete")
    public void deleteSuperHero(@RequestParam(name = "id")int id)
    {
        crudService.deleteSuperHero(id);
    }
}
