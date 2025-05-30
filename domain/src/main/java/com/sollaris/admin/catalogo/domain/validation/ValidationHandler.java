package com.sollaris.admin.catalogo.domain.validation;

import java.util.List;

public interface ValidationHandler {
    ValidationHandler append(Error anError);
    ValidationHandler append(ValidationHandler anError);
    ValidationHandler validate(Validation aValidation);
    List<Error> getErrors();

    default boolean hasErrors() {
        return getErrors() != null && !(getErrors().isEmpty());
    }

    public interface Validation {
        void validate();
    }



}
