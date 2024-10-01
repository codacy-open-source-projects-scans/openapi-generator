# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class EnumSerialization(int, Enum):
    """
    EnumSerialization
    """

    """
    allowed enum values
    """
    NUMBER_0 = 0
    NUMBER_1 = 1

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of EnumSerialization from a JSON string"""
        return cls(json.loads(json_str))

