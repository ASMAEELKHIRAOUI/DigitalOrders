package com.example.digitalorders.service.impl;

import com.example.digitalorders.entities.Category;
import com.example.digitalorders.repositories.CategoryRepository;
import com.example.digitalorders.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    public final CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.getAllById(id);
    }
}
