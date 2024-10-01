/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "PFXUser.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "PFXHelpers.h"

namespace test_namespace {

PFXUser::PFXUser(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

PFXUser::PFXUser() {
    this->initializeModel();
}

PFXUser::~PFXUser() {}

void PFXUser::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_username_isSet = false;
    m_username_isValid = false;

    m_first_name_isSet = false;
    m_first_name_isValid = false;

    m_last_name_isSet = false;
    m_last_name_isValid = false;

    m_email_isSet = false;
    m_email_isValid = false;

    m_password_isSet = false;
    m_password_isValid = false;

    m_phone_isSet = false;
    m_phone_isValid = false;

    m_user_status_isSet = false;
    m_user_status_isValid = false;
}

void PFXUser::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void PFXUser::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::test_namespace::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_username_isValid = ::test_namespace::fromJsonValue(m_username, json[QString("username")]);
    m_username_isSet = !json[QString("username")].isNull() && m_username_isValid;

    m_first_name_isValid = ::test_namespace::fromJsonValue(m_first_name, json[QString("firstName")]);
    m_first_name_isSet = !json[QString("firstName")].isNull() && m_first_name_isValid;

    m_last_name_isValid = ::test_namespace::fromJsonValue(m_last_name, json[QString("lastName")]);
    m_last_name_isSet = !json[QString("lastName")].isNull() && m_last_name_isValid;

    m_email_isValid = ::test_namespace::fromJsonValue(m_email, json[QString("email")]);
    m_email_isSet = !json[QString("email")].isNull() && m_email_isValid;

    m_password_isValid = ::test_namespace::fromJsonValue(m_password, json[QString("password")]);
    m_password_isSet = !json[QString("password")].isNull() && m_password_isValid;

    m_phone_isValid = ::test_namespace::fromJsonValue(m_phone, json[QString("phone")]);
    m_phone_isSet = !json[QString("phone")].isNull() && m_phone_isValid;

    m_user_status_isValid = ::test_namespace::fromJsonValue(m_user_status, json[QString("userStatus")]);
    m_user_status_isSet = !json[QString("userStatus")].isNull() && m_user_status_isValid;
}

QString PFXUser::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject PFXUser::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::test_namespace::toJsonValue(m_id));
    }
    if (m_username_isSet) {
        obj.insert(QString("username"), ::test_namespace::toJsonValue(m_username));
    }
    if (m_first_name_isSet) {
        obj.insert(QString("firstName"), ::test_namespace::toJsonValue(m_first_name));
    }
    if (m_last_name_isSet) {
        obj.insert(QString("lastName"), ::test_namespace::toJsonValue(m_last_name));
    }
    if (m_email_isSet) {
        obj.insert(QString("email"), ::test_namespace::toJsonValue(m_email));
    }
    if (m_password_isSet) {
        obj.insert(QString("password"), ::test_namespace::toJsonValue(m_password));
    }
    if (m_phone_isSet) {
        obj.insert(QString("phone"), ::test_namespace::toJsonValue(m_phone));
    }
    if (m_user_status_isSet) {
        obj.insert(QString("userStatus"), ::test_namespace::toJsonValue(m_user_status));
    }
    return obj;
}

qint64 PFXUser::getId() const {
    return m_id;
}
void PFXUser::setId(const qint64 &id) {
    m_id = id;
    m_id_isSet = true;
}

bool PFXUser::is_id_Set() const{
    return m_id_isSet;
}

bool PFXUser::is_id_Valid() const{
    return m_id_isValid;
}

QString PFXUser::getUsername() const {
    return m_username;
}
void PFXUser::setUsername(const QString &username) {
    m_username = username;
    m_username_isSet = true;
}

bool PFXUser::is_username_Set() const{
    return m_username_isSet;
}

bool PFXUser::is_username_Valid() const{
    return m_username_isValid;
}

QString PFXUser::getFirstName() const {
    return m_first_name;
}
void PFXUser::setFirstName(const QString &first_name) {
    m_first_name = first_name;
    m_first_name_isSet = true;
}

bool PFXUser::is_first_name_Set() const{
    return m_first_name_isSet;
}

bool PFXUser::is_first_name_Valid() const{
    return m_first_name_isValid;
}

QString PFXUser::getLastName() const {
    return m_last_name;
}
void PFXUser::setLastName(const QString &last_name) {
    m_last_name = last_name;
    m_last_name_isSet = true;
}

bool PFXUser::is_last_name_Set() const{
    return m_last_name_isSet;
}

bool PFXUser::is_last_name_Valid() const{
    return m_last_name_isValid;
}

QString PFXUser::getEmail() const {
    return m_email;
}
void PFXUser::setEmail(const QString &email) {
    m_email = email;
    m_email_isSet = true;
}

bool PFXUser::is_email_Set() const{
    return m_email_isSet;
}

bool PFXUser::is_email_Valid() const{
    return m_email_isValid;
}

QString PFXUser::getPassword() const {
    return m_password;
}
void PFXUser::setPassword(const QString &password) {
    m_password = password;
    m_password_isSet = true;
}

bool PFXUser::is_password_Set() const{
    return m_password_isSet;
}

bool PFXUser::is_password_Valid() const{
    return m_password_isValid;
}

QString PFXUser::getPhone() const {
    return m_phone;
}
void PFXUser::setPhone(const QString &phone) {
    m_phone = phone;
    m_phone_isSet = true;
}

bool PFXUser::is_phone_Set() const{
    return m_phone_isSet;
}

bool PFXUser::is_phone_Valid() const{
    return m_phone_isValid;
}

qint32 PFXUser::getUserStatus() const {
    return m_user_status;
}
void PFXUser::setUserStatus(const qint32 &user_status) {
    m_user_status = user_status;
    m_user_status_isSet = true;
}

bool PFXUser::is_user_status_Set() const{
    return m_user_status_isSet;
}

bool PFXUser::is_user_status_Valid() const{
    return m_user_status_isValid;
}

bool PFXUser::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_username_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_first_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_last_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_email_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_password_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_phone_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_user_status_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool PFXUser::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace test_namespace