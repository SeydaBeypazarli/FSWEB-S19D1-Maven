package com.workintech.s18d2.services;

import com.workintech.s18d2.repository.VegetableRepository;
import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.exceptions.PlantException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VegetableServiceImpl implements VegetableService{
    private final VegetableRepository vegetableRepository;

    @Override
    public List<Vegetable> getAll() {
        return vegetableRepository.findAll();
    }

    @Override
    public List<Vegetable> getByPriceDesc() {
        return vegetableRepository.getByPriceDesc();
    }
    @Override
    public Vegetable getByID(long id) {
        return vegetableRepository.findById(id).orElseThrow(() -> new PlantException("plant with given id is not exist: " + id, HttpStatus.NOT_FOUND));
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public Vegetable delete(long id) {
        Vegetable vegetable = getByID(id);
        vegetableRepository.delete(vegetable);
        return vegetable;
    }
    @Override
    public List<Vegetable> searchByName(String name) {
        return vegetableRepository.searchByName(name); // Call to repository method
    }
}
