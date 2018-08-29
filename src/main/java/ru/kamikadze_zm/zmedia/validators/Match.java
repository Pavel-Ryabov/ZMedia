package ru.kamikadze_zm.zmedia.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MatchValidator.class)
public @interface Match {

    String message() default "Поля не совпадают";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String field();

    String confirmationField();
}
