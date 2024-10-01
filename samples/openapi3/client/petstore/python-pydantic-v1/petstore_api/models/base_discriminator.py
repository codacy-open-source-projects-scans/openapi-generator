# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Any, Dict, Optional, Union
from pydantic import BaseModel, Field, StrictStr

from typing import TYPE_CHECKING
from importlib import import_module
if TYPE_CHECKING:
    from petstore_api.models.primitive_string import PrimitiveString
    from petstore_api.models.info import Info

class BaseDiscriminator(BaseModel):
    """
    BaseDiscriminator
    """
    type_name: Optional[StrictStr] = Field(default=None, alias="_typeName")
    additional_properties: Dict[str, Any] = {}
    __properties = ["_typeName"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    # JSON field name that stores the object type
    __discriminator_property_name = '_typeName'

    # discriminator mappings
    __discriminator_value_class_map = {
        'string': 'PrimitiveString',
        'Info': 'Info'
    }

    @classmethod
    def get_discriminator_value(cls, obj: dict) -> str:
        """Returns the discriminator value (object type) of the data"""
        discriminator_value = obj[cls.__discriminator_property_name]
        if discriminator_value:
            return cls.__discriminator_value_class_map.get(discriminator_value)
        else:
            return None

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Union(Info, PrimitiveString):
        """Create an instance of BaseDiscriminator from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                            "additional_properties"
                          },
                          exclude_none=True)
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Union(Info, PrimitiveString):
        """Create an instance of BaseDiscriminator from a dict"""
        # look up the object type based on discriminator mapping
        object_type = cls.get_discriminator_value(obj)
        if object_type ==  'PrimitiveString':
            return import_module("petstore_api.models.primitive_string").PrimitiveString.from_dict(obj)
        if object_type ==  'Info':
            return import_module("petstore_api.models.info").Info.from_dict(obj)
        raise ValueError("BaseDiscriminator failed to lookup discriminator value from " +
                            json.dumps(obj) + ". Discriminator property name: " + cls.__discriminator_property_name +
                            ", mapping: " + json.dumps(cls.__discriminator_value_class_map))

