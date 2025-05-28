package com.sollaris.admin.catalogo.application.category.create;

import com.sollaris.admin.catalogo.domain.category.Category;
import com.sollaris.admin.catalogo.domain.category.CategoryID;

public record CreateCategoryOutput(
        CategoryID id
) {
    public static CreateCategoryOutput from(
            final Category aCategory
    ) {
        return new CreateCategoryOutput(aCategory.getId());
    }
}
