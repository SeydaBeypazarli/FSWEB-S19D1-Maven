package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    Vegetable getByID(long id);
    Vegetable save(Vegetable vegetable);
    Vegetable delete(long id);
    List<Vegetable> getAll();
    List<Vegetable> getByPriceDesc();
    List<Vegetable> searchByName(String name);
}
