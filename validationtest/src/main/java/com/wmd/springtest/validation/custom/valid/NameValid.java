package com.wmd.springtest.validation.custom.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author wengmd
 * @date 19-1-15 下午5:37
 */
@Target({ PARAMETER, FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = NameValidator.class)
@Documented
public @interface NameValid {
    String message() default "名称不是abc";//"{name.invalid}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
