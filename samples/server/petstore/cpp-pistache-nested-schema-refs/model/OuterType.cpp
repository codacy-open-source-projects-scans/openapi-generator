/**
* Test swagger file
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "OuterType.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OuterType::OuterType()
{
    
}

void OuterType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OuterType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OuterType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OuterType" : pathPrefix;

        
    if (!m_Middle.validate(msg, _pathPrefix + ".middle")) {
        msg << _pathPrefix << ": Middle is invalid;";
        success = false;
    }
    return success;
}

bool OuterType::operator==(const OuterType& rhs) const
{
    return
    
    
    (getMiddle() == rhs.getMiddle())
    
    
    ;
}

bool OuterType::operator!=(const OuterType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OuterType& o)
{
    j = nlohmann::json::object();
    j["middle"] = o.m_Middle;
    
}

void from_json(const nlohmann::json& j, OuterType& o)
{
    j.at("middle").get_to(o.m_Middle);
    
}

org::openapitools::server::model::MiddleType OuterType::getMiddle() const
{
    return m_Middle;
}
void OuterType::setMiddle(org::openapitools::server::model::MiddleType const& value)
{
    m_Middle = value;
}


} // namespace org::openapitools::server::model
