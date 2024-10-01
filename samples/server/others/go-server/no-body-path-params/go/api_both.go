// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Simple no path and body param spec
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0.0
 */

package petstoreserver

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// BothAPIController binds http requests to an api service and writes the service results to the http response
type BothAPIController struct {
	service BothAPIServicer
	errorHandler ErrorHandler
}

// BothAPIOption for how the controller is set up.
type BothAPIOption func(*BothAPIController)

// WithBothAPIErrorHandler inject ErrorHandler into controller
func WithBothAPIErrorHandler(h ErrorHandler) BothAPIOption {
	return func(c *BothAPIController) {
		c.errorHandler = h
	}
}

// NewBothAPIController creates a default api controller
func NewBothAPIController(s BothAPIServicer, opts ...BothAPIOption) *BothAPIController {
	controller := &BothAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the BothAPIController
func (c *BothAPIController) Routes() Routes {
	return Routes{
		"Both": Route{
			strings.ToUpper("Post"),
			"/both/endpoint/{pathParam}",
			c.Both,
		},
	}
}

// Both - summary
func (c *BothAPIController) Both(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	pathParamParam := params["pathParam"]
	if pathParamParam == "" {
		c.errorHandler(w, r, &RequiredError{"pathParam"}, nil)
		return
	}
	bodyRequestParam := BodyRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertBodyRequestRequired(bodyRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertBodyRequestConstraints(bodyRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.Both(r.Context(), pathParamParam, bodyRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, result.Headers, w)
}