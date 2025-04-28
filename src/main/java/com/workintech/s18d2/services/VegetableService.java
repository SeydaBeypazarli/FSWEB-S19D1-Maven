package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Vegetable;

public interface VegetableService {
    Vegetable getByID(long id);
    Vegetable save(Vegetable vegetable);
    Vegetable delete(long id);
}
