/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidationException;

public class BeanValidationException extends ValidationException {
    /**
     *
     */
    private static final long serialVersionUID = -5294733947409491364L;
    Set<ConstraintViolation<Object>> violations;

    public BeanValidationException(Set<ConstraintViolation<Object>> violations) {
        this.violations = violations;
    }

    public Set<ConstraintViolation<Object>> getViolations() {
        return violations;
    }

    public void setViolations(Set<ConstraintViolation<Object>> violations) {
        this.violations = violations;
    }

}