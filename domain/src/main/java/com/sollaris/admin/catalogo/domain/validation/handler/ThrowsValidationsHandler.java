package com.sollaris.admin.catalogo.domain.validation.handler;

import com.sollaris.admin.catalogo.domain.exceptions.DomainException;
import com.sollaris.admin.catalogo.domain.validation.Error;
import com.sollaris.admin.catalogo.domain.validation.ValidationHandler;

import java.util.List;

public class ThrowsValidationsHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(final Error anError) {
        throw DomainException.with(anError);
    }

    @Override
    public ValidationHandler append(ValidationHandler anError) {
        return null;
    }

    @Override
    public ValidationHandler validate(Validation aValidation) {
        return null;
    }

    @Override
    public List<Error> getErrors() {
        return List.of();
    }
}
