/*
 * Example
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct Apple {
    #[serde(rename = "cultivar", skip_serializing_if = "Option::is_none")]
    pub cultivar: Option<String>,
    #[serde(rename = "origin", skip_serializing_if = "Option::is_none")]
    pub origin: Option<String>,
}

impl Apple {
    pub fn new() -> Apple {
        Apple {
            cultivar: None,
            origin: None,
        }
    }
}

