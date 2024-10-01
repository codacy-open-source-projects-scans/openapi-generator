/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "MapTest.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <algorithm>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

MapTest::MapTest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string MapTest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void MapTest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree MapTest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Map_map_of_string
    if (!m_Map_map_of_string.empty()) {
        tmp_node = toPt(m_Map_map_of_string);
        pt.add_child("map_map_of_string", tmp_node);
    }
    tmp_node.clear();
	// generate tree for Map_of_enum_string
    if (!m_Map_of_enum_string.empty()) {
        tmp_node = toPt(m_Map_of_enum_string);
        pt.add_child("map_of_enum_string", tmp_node);
    }
    tmp_node.clear();
	// generate tree for Direct_map
    if (!m_Direct_map.empty()) {
        tmp_node = toPt(m_Direct_map);
        pt.add_child("direct_map", tmp_node);
    }
    tmp_node.clear();
	// generate tree for Indirect_map
    if (!m_Indirect_map.empty()) {
        tmp_node = toPt(m_Indirect_map);
        pt.add_child("indirect_map", tmp_node);
    }
    tmp_node.clear();
	return pt;
}

void MapTest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
    if (pt.get_child_optional("map_map_of_string")) {
        m_Map_map_of_string = fromPt<std::map<std::string, std::map<std::string, std::string>>>(pt.get_child("map_map_of_string"));
    }
    if (pt.get_child_optional("map_of_enum_string")) {
        m_Map_of_enum_string = fromPt<std::map<std::string, std::string>>(pt.get_child("map_of_enum_string"));
    }
    if (pt.get_child_optional("direct_map")) {
        m_Direct_map = fromPt<std::map<std::string, bool>>(pt.get_child("direct_map"));
    }
    if (pt.get_child_optional("indirect_map")) {
        m_Indirect_map = fromPt<std::map<std::string, bool>>(pt.get_child("indirect_map"));
    }
}

std::map<std::string, std::map<std::string, std::string>> MapTest::getMapMapOfString() const
{
    return m_Map_map_of_string;
}

void MapTest::setMapMapOfString(std::map<std::string, std::map<std::string, std::string>> value)
{
    m_Map_map_of_string = value;
}


std::map<std::string, std::string> MapTest::getMapOfEnumString() const
{
    return m_Map_of_enum_string;
}

void MapTest::setMapOfEnumString(std::map<std::string, std::string> value)
{
    static const std::array<std::string, 2> allowedValues = {
        "UPPER", "lower"
    };

    for (const auto &v: value) {
        if (std::find(allowedValues.begin(), allowedValues.end(), v.first) == allowedValues.end()) {
            throw std::runtime_error("Value " + boost::lexical_cast<std::string>(v.first) + " not allowed");
        }
    }
    m_Map_of_enum_string = value;
}


std::map<std::string, bool> MapTest::getDirectMap() const
{
    return m_Direct_map;
}

void MapTest::setDirectMap(std::map<std::string, bool> value)
{
    m_Direct_map = value;
}


std::map<std::string, bool> MapTest::getIndirectMap() const
{
    return m_Indirect_map;
}

void MapTest::setIndirectMap(std::map<std::string, bool> value)
{
    m_Indirect_map = value;
}



std::vector<MapTest> createMapTestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<MapTest>();
    for (const auto& child: pt) {
        vec.emplace_back(MapTest(child.second));
    }

    return vec;
}

}
}
}
}
