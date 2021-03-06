package bg.softuni.homerestate.models.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Constraint(validatedBy = NullSizeValidator.class)
public @interface SizeWithNull {
        int min();
        int max() default Integer.MAX_VALUE;
        String message() default "Size should be in the boundaries";
        Class<?>[] groups() default { };
        Class<? extends Payload>[] payload() default { };
}

