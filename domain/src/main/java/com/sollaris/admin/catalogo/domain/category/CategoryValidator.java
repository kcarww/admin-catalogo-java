package com.sollaris.admin.catalogo.domain.category;

import com.sollaris.admin.catalogo.domain.validation.ValidationHandler;

public class CategoryValidator extends Validator{
    public CategoryValidator(final Category aCategory, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {

    }


}
