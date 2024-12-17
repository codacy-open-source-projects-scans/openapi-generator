extends Resource
class_name DemoTypeTestingModel

# THIS FILE WAS AUTOMATICALLY GENERATED by the OpenAPI Generator project.
# For more information on how to customize templates, see:
# https://openapi-generator.tech
# https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources/gdscript
# The OpenAPI Generator Community, © Public Domain, 2022

# DemoTypeTestingModel Model
# Test handling of different field data types


# Required: True
# isArray: false
@export var int32: int:
	set(value):
		__int32__was__set = true
		int32 = value
var __int32__was__set := false

# Required: True
# isArray: false
@export var int64: float:
	set(value):
		__int64__was__set = true
		int64 = value
var __int64__was__set := false

# Required: True
# isArray: false
@export var some_float: float:
	set(value):
		__some_float__was__set = true
		some_float = value
var __some_float__was__set := false

# Required: True
# isArray: false
@export var double: int:
	set(value):
		__double__was__set = true
		double = value
var __double__was__set := false

# Required: True
# isArray: false
@export var some_string: String = "":
	set(value):
		__some_string__was__set = true
		some_string = value
var __some_string__was__set := false

# Required: True
# isArray: false
@export var boolean: bool:
	set(value):
		__boolean__was__set = true
		boolean = value
var __boolean__was__set := false

# Required: True
# isArray: false
@export var uuid: String:
	set(value):
		__uuid__was__set = true
		uuid = value
var __uuid__was__set := false


func bzz_collect_missing_properties() -> Array:
	var bzz_missing_properties := Array()
	if not self.__int32__was__set:
		bzz_missing_properties.append("int32")
	if not self.__int64__was__set:
		bzz_missing_properties.append("int64")
	if not self.__some_float__was__set:
		bzz_missing_properties.append("some_float")
	if not self.__double__was__set:
		bzz_missing_properties.append("double")
	if not self.__some_string__was__set:
		bzz_missing_properties.append("some_string")
	if not self.__boolean__was__set:
		bzz_missing_properties.append("boolean")
	if not self.__uuid__was__set:
		bzz_missing_properties.append("uuid")
	return bzz_missing_properties


func bzz_normalize() -> Dictionary:
	var bzz_dictionary := Dictionary()
	if self.__int32__was__set:
		bzz_dictionary["int32"] = self.int32
	if self.__int64__was__set:
		bzz_dictionary["int64"] = self.int64
	if self.__some_float__was__set:
		bzz_dictionary["some_float"] = self.some_float
	if self.__double__was__set:
		bzz_dictionary["double"] = self.double
	if self.__some_string__was__set:
		bzz_dictionary["some_string"] = self.some_string
	if self.__boolean__was__set:
		bzz_dictionary["boolean"] = self.boolean
	if self.__uuid__was__set:
		bzz_dictionary["uuid"] = self.uuid
	return bzz_dictionary


# Won't work for JSON+LD
static func bzz_denormalize_single(from_dict: Dictionary):
	var me := new()
	if from_dict.has("int32"):
		me.int32 = from_dict["int32"]
	if from_dict.has("int64"):
		me.int64 = from_dict["int64"]
	if from_dict.has("some_float"):
		me.some_float = from_dict["some_float"]
	if from_dict.has("double"):
		me.double = from_dict["double"]
	if from_dict.has("some_string"):
		me.some_string = from_dict["some_string"]
	if from_dict.has("boolean"):
		me.boolean = from_dict["boolean"]
	if from_dict.has("uuid"):
		me.uuid = from_dict["uuid"]
	return me


# Won't work for JSON+LD
static func bzz_denormalize_multiple(from_array: Array):
	var mes := Array()
	for element in from_array:
		if element is Array:
			mes.append(bzz_denormalize_multiple(element))
		elif element is Dictionary:
			# TODO: perhaps check first if it looks like a match or an intermediate container
			mes.append(bzz_denormalize_single(element))
		else:
			mes.append(element)
	return mes
