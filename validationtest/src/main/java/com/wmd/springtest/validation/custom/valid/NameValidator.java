package com.wmd.springtest.validation.custom.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author wengmd
 * @date 19-1-15 下午5:38
 */
public class NameValidator implements ConstraintValidator<NameValid, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (! "abc".equalsIgnoreCase(value)) {

            return false;
        }
        return true;
    }
}
