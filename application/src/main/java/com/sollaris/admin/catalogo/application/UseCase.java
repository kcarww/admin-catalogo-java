package com.sollaris.admin.catalogo.application;


import com.sollaris.admin.catalogo.domain.category.Category;

public abstract class UseCase<IN, OUT> {
    public abstract OUT execute(IN anIn);


}