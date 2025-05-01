package com.sollaris.admin.catalogo.application;


import com.sollaris.admin.catalogo.domain.category.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}