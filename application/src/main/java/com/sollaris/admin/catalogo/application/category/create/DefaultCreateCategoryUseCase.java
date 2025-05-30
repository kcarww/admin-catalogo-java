package com.sollaris.admin.catalogo.application.category.create;

import com.sollaris.admin.catalogo.domain.category.Category;
import com.sollaris.admin.catalogo.domain.category.CategoryGateway;
import com.sollaris.admin.catalogo.domain.validation.handler.Notification;
import com.sollaris.admin.catalogo.domain.validation.handler.ThrowsValidationsHandler;
import io.vavr.control.Either;

import java.util.Objects;

public class DefaultCreateCategoryUseCase extends CreateCategoryUseCase{

    private final CategoryGateway categoryGateway;

    public DefaultCreateCategoryUseCase(CategoryGateway categoryGateway) {
        this.categoryGateway = Objects.requireNonNull(categoryGateway);
    }

    @Override
    public Either<Notification, CreateCategoryOutput> execute(final CreateCategoryCommand aCommand) {
        final var aName = aCommand.name();
        final var aDescription = aCommand.description();
        final var aIsActive = aCommand.isActive();

        final var notification = Notification.create();

        final var aCategory = Category.newCategory(aName, aDescription, aIsActive);
        aCategory.validate(notification);

        if (notification.hasErrors()) {

        }

        return CreateCategoryOutput.from(this.categoryGateway.create(aCategory));
    }
}
