package com.sollaris.admin.catalogo.application.category.create;

import com.sollaris.admin.catalogo.application.UseCase;
import com.sollaris.admin.catalogo.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {

}
