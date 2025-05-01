package com.workintech.s18d2.controller;



import com.workintech.s18d2.dto.VegetableResponse;

import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/vegetable")
public class VegetableController {
    private final VegetableService vegetableService;

    @GetMapping("/desc")
    public List<Vegetable> getAllDesc() {
        return vegetableService.getByPriceDesc();
    }
    @GetMapping("/{id}")
    public VegetableResponse get(@Positive( message = "id sıfırdan küçük olamaz") @PathVariable("id") Long id) {
        return new VegetableResponse( "get it succeed!", vegetableService.getByID(id));
    }

    @GetMapping("/search/{name}")
    public List<Vegetable> searchByName(@PathVariable("name") String name) {
        return vegetableService.searchByName(name);
    }

    @PostMapping
    public Vegetable save(@Validated @RequestBody Vegetable vegetable){
        return vegetableService.save(vegetable);
    }

    @DeleteMapping("/{id}")
    public Vegetable delete(@NotNull @Positive @PathVariable Long id) {
        return vegetableService.delete(id);
    }

}
