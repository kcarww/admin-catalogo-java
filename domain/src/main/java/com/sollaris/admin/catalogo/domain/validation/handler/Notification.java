package com.sollaris.admin.catalogo.domain.validation.handler;

import com.sollaris.admin.catalogo.domain.exceptions.DomainException;
import com.sollaris.admin.catalogo.domain.validation.Error;
import com.sollaris.admin.catalogo.domain.validation.ValidationHandler;

import java.util.ArrayList;
import java.util.List;

public class Notification implements ValidationHandler {

    private final List<Error> erros;

    private Notification(final List<Error> errors) {
        this.erros = errors;
    }

    public static Notification create() {
        return new Notification(new ArrayList<>());
    }

    public static Notification create(final Error anError) {
        return new Notification(new ArrayList<>()).append(anError);
    }

    @Override
    public Notification append(final Error anError) {
        this.erros.add(anError);
        return this;
    }

    @Override
    public Notification append(final ValidationHandler anError) {
        this.erros.addAll(anError.getErrors());
        return this;
    }

    @Override
    public Notification validate(final Validation aValidation) {
        try {
            aValidation.validate();
        } catch (final DomainException ex) {
            this.erros.addAll(ex.getErrors());
        } catch (final Throwable t) {
            this.erros.add(new Error(t.getMessage()));
        }
        return this;
    }

    @Override
    public List<Error> getErrors() {
        return this.erros;
    }
}
