# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
from inspect import getfullargspec
import json
import pprint
import re  # noqa: F401

from typing import Any, List, Optional
from pydantic import BaseModel, Field, StrictStr, ValidationError, validator
from petstore_api.models.bathing import Bathing
from petstore_api.models.feeding import Feeding
from petstore_api.models.poop_cleaning import PoopCleaning
from typing import Union, Any, List, TYPE_CHECKING
from pydantic import StrictStr, Field

TASKACTIVITY_ONE_OF_SCHEMAS = ["Bathing", "Feeding", "PoopCleaning"]

class TaskActivity(BaseModel):
    """
    TaskActivity
    """
    # data type: PoopCleaning
    oneof_schema_1_validator: Optional[PoopCleaning] = None
    # data type: Feeding
    oneof_schema_2_validator: Optional[Feeding] = None
    # data type: Bathing
    oneof_schema_3_validator: Optional[Bathing] = None
    if TYPE_CHECKING:
        actual_instance: Union[Bathing, Feeding, PoopCleaning]
    else:
        actual_instance: Any
    one_of_schemas: List[str] = Field(TASKACTIVITY_ONE_OF_SCHEMAS, const=True)

    class Config:
        validate_assignment = True

    def __init__(self, *args, **kwargs) -> None:
        if args:
            if len(args) > 1:
                raise ValueError("If a position argument is used, only 1 is allowed to set `actual_instance`")
            if kwargs:
                raise ValueError("If a position argument is used, keyword arguments cannot be used.")
            super().__init__(actual_instance=args[0])
        else:
            super().__init__(**kwargs)

    @validator('actual_instance')
    def actual_instance_must_validate_oneof(cls, v):
        instance = TaskActivity.construct()
        error_messages = []
        match = 0
        # validate data type: PoopCleaning
        if not isinstance(v, PoopCleaning):
            error_messages.append(f"Error! Input type `{type(v)}` is not `PoopCleaning`")
        else:
            match += 1
        # validate data type: Feeding
        if not isinstance(v, Feeding):
            error_messages.append(f"Error! Input type `{type(v)}` is not `Feeding`")
        else:
            match += 1
        # validate data type: Bathing
        if not isinstance(v, Bathing):
            error_messages.append(f"Error! Input type `{type(v)}` is not `Bathing`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in TaskActivity with oneOf schemas: Bathing, Feeding, PoopCleaning. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in TaskActivity with oneOf schemas: Bathing, Feeding, PoopCleaning. Details: " + ", ".join(error_messages))
        else:
            return v

    @classmethod
    def from_dict(cls, obj: dict) -> TaskActivity:
        return cls.from_json(json.dumps(obj))

    @classmethod
    def from_json(cls, json_str: str) -> TaskActivity:
        """Returns the object represented by the json string"""
        instance = TaskActivity.construct()
        error_messages = []
        match = 0

        # deserialize data into PoopCleaning
        try:
            instance.actual_instance = PoopCleaning.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into Feeding
        try:
            instance.actual_instance = Feeding.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into Bathing
        try:
            instance.actual_instance = Bathing.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into TaskActivity with oneOf schemas: Bathing, Feeding, PoopCleaning. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into TaskActivity with oneOf schemas: Bathing, Feeding, PoopCleaning. Details: " + ", ".join(error_messages))
        else:
            return instance

    def to_json(self) -> str:
        """Returns the JSON representation of the actual instance"""
        if self.actual_instance is None:
            return "null"

        to_json = getattr(self.actual_instance, "to_json", None)
        if callable(to_json):
            return self.actual_instance.to_json()
        else:
            return json.dumps(self.actual_instance)

    def to_dict(self) -> dict:
        """Returns the dict representation of the actual instance"""
        if self.actual_instance is None:
            return None

        to_dict = getattr(self.actual_instance, "to_dict", None)
        if callable(to_dict):
            return self.actual_instance.to_dict()
        else:
            # primitive type
            return self.actual_instance

    def to_str(self) -> str:
        """Returns the string representation of the actual instance"""
        return pprint.pformat(self.dict())

