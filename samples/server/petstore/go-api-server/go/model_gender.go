// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API version: 1.0.0
 */

package petstoreserver


import (
	"fmt"
)



type Gender string

// List of Gender
const (
	MALE Gender = "male"
	FEMALE Gender = "female"
)

// AllowedGenderEnumValues is all the allowed values of Gender enum
var AllowedGenderEnumValues = []Gender{
	"male",
	"female",
}

// validGenderEnumValue provides a map of Genders for fast verification of use input
var validGenderEnumValues = map[Gender]struct{}{
	"male": {},
	"female": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v Gender) IsValid() bool {
	_, ok := validGenderEnumValues[v]
	return ok
}

// NewGenderFromValue returns a pointer to a valid Gender
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewGenderFromValue(v string) (Gender, error) {
	ev := Gender(v)
	if ev.IsValid() {
		return ev, nil
	}

	return "", fmt.Errorf("invalid value '%v' for Gender: valid values are %v", v, AllowedGenderEnumValues)
}



// AssertGenderRequired checks if the required fields are not zero-ed
func AssertGenderRequired(obj Gender) error {
	return nil
}

// AssertGenderConstraints checks if the values respects the defined constraints
func AssertGenderConstraints(obj Gender) error {
	return nil
}