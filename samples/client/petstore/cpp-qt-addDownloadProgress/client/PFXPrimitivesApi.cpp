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

#include "PFXPrimitivesApi.h"
#include "PFXServerConfiguration.h"
#include <QJsonArray>
#include <QJsonDocument>

namespace test_namespace {

PFXPrimitivesApi::PFXPrimitivesApi(const int timeOut)
    : _timeOut(timeOut),
      _manager(nullptr),
      _isResponseCompressionEnabled(false),
      _isRequestCompressionEnabled(false) {
    initializeServerConfigs();
}

PFXPrimitivesApi::~PFXPrimitivesApi() {
}

void PFXPrimitivesApi::initializeServerConfigs() {
    //Default server
    QList<PFXServerConfiguration> defaultConf = QList<PFXServerConfiguration>();
    //varying endpoint server
    defaultConf.append(PFXServerConfiguration(
    QUrl("http://petstore.swagger.io/v2"),
    "No description provided",
    QMap<QString, PFXServerVariable>()));
    _serverConfigs.insert("primitivesIntegerPost", defaultConf);
    _serverIndices.insert("primitivesIntegerPost", 0);
    _serverConfigs.insert("primitivesNumberPut", defaultConf);
    _serverIndices.insert("primitivesNumberPut", 0);
}

/**
* returns 0 on success and -1, -2 or -3 on failure.
* -1 when the variable does not exist and -2 if the value is not defined in the enum and -3 if the operation or server index is not found
*/
int PFXPrimitivesApi::setDefaultServerValue(int serverIndex, const QString &operation, const QString &variable, const QString &value) {
    auto it = _serverConfigs.find(operation);
    if (it != _serverConfigs.end() && serverIndex < it.value().size()) {
      return _serverConfigs[operation][serverIndex].setDefaultValue(variable,value);
    }
    return -3;
}
void PFXPrimitivesApi::setServerIndex(const QString &operation, int serverIndex) {
    if (_serverIndices.contains(operation) && serverIndex < _serverConfigs.find(operation).value().size()) {
        _serverIndices[operation] = serverIndex;
    }
}

void PFXPrimitivesApi::setApiKey(const QString &apiKeyName, const QString &apiKey) {
    _apiKeys.insert(apiKeyName, apiKey);
}

void PFXPrimitivesApi::setBearerToken(const QString &token) {
    _bearerToken = token;
}

void PFXPrimitivesApi::setUsername(const QString &username) {
    _username = username;
}

void PFXPrimitivesApi::setPassword(const QString &password) {
    _password = password;
}


void PFXPrimitivesApi::setTimeOut(const int timeOut) {
    _timeOut = timeOut;
}

void PFXPrimitivesApi::setWorkingDirectory(const QString &path) {
    _workingDirectory = path;
}

void PFXPrimitivesApi::setNetworkAccessManager(QNetworkAccessManager* manager) {
    _manager = manager;
}

/**
    * Appends a new ServerConfiguration to the config map for a specific operation.
    * @param operation The id to the target operation.
    * @param url A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    * returns the index of the new server config on success and -1 if the operation is not found
    */
int PFXPrimitivesApi::addServerConfiguration(const QString &operation, const QUrl &url, const QString &description, const QMap<QString, PFXServerVariable> &variables) {
    if (_serverConfigs.contains(operation)) {
        _serverConfigs[operation].append(PFXServerConfiguration(
                    url,
                    description,
                    variables));
        return _serverConfigs[operation].size()-1;
    } else {
        return -1;
    }
}

/**
    * Appends a new ServerConfiguration to the config map for a all operations and sets the index to that server.
    * @param url A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    */
void PFXPrimitivesApi::setNewServerForAllOperations(const QUrl &url, const QString &description, const QMap<QString, PFXServerVariable> &variables) {
    for (auto keyIt = _serverIndices.keyBegin(); keyIt != _serverIndices.keyEnd(); keyIt++) {
        setServerIndex(*keyIt, addServerConfiguration(*keyIt, url, description, variables));
    }
}

/**
    * Appends a new ServerConfiguration to the config map for an operations and sets the index to that server.
    * @param URL A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    */
void PFXPrimitivesApi::setNewServer(const QString &operation, const QUrl &url, const QString &description, const QMap<QString, PFXServerVariable> &variables) {
    setServerIndex(operation, addServerConfiguration(operation, url, description, variables));
}

void PFXPrimitivesApi::addHeaders(const QString &key, const QString &value) {
    _defaultHeaders.insert(key, value);
}

void PFXPrimitivesApi::enableRequestCompression() {
    _isRequestCompressionEnabled = true;
}

void PFXPrimitivesApi::enableResponseCompression() {
    _isResponseCompressionEnabled = true;
}

void PFXPrimitivesApi::abortRequests() {
    Q_EMIT abortRequestsSignal();
}

QString PFXPrimitivesApi::getParamStylePrefix(const QString &style) {
    if (style == "matrix") {
        return ";";
    } else if (style == "label") {
        return ".";
    } else if (style == "form") {
        return "&";
    } else if (style == "simple") {
        return "";
    } else if (style == "spaceDelimited") {
        return "&";
    } else if (style == "pipeDelimited") {
        return "&";
    } else {
        return "none";
    }
}

QString PFXPrimitivesApi::getParamStyleSuffix(const QString &style) {
    if (style == "matrix") {
        return "=";
    } else if (style == "label") {
        return "";
    } else if (style == "form") {
        return "=";
    } else if (style == "simple") {
        return "";
    } else if (style == "spaceDelimited") {
        return "=";
    } else if (style == "pipeDelimited") {
        return "=";
    } else {
        return "none";
    }
}

QString PFXPrimitivesApi::getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode) {

    if (style == "matrix") {
        return (isExplode) ? ";" + name + "=" : ",";

    } else if (style == "label") {
        return (isExplode) ? "." : ",";

    } else if (style == "form") {
        return (isExplode) ? "&" + name + "=" : ",";

    } else if (style == "simple") {
        return ",";
    } else if (style == "spaceDelimited") {
        return (isExplode) ? "&" + name + "=" : " ";

    } else if (style == "pipeDelimited") {
        return (isExplode) ? "&" + name + "=" : "|";

    } else if (style == "deepObject") {
        return (isExplode) ? "&" : "none";

    } else {
        return "none";
    }
}

void PFXPrimitivesApi::primitivesIntegerPost(const ::test_namespace::OptionalParam<qint32> &body) {
    QString fullPath = QString(_serverConfigs["primitivesIntegerPost"][_serverIndices.value("primitivesIntegerPost")].URL()+"/primitives/integer");
    
    PFXHttpRequestWorker *worker = new PFXHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    PFXHttpRequestInput input(fullPath, "POST");

    if (body.hasValue()){

        QByteArray output = QByteArray::number(body.value());
        input.request_body.append(output);
    }
    for (auto keyValueIt = _defaultHeaders.keyValueBegin(); keyValueIt != _defaultHeaders.keyValueEnd(); keyValueIt++) {
        input.headers.insert(keyValueIt->first, keyValueIt->second);
    }

    connect(worker, &PFXHttpRequestWorker::downloadProgress, this, &PFXPrimitivesApi::primitivesIntegerPostProgress);
    connect(worker, &PFXHttpRequestWorker::on_execution_finished, this, &PFXPrimitivesApi::primitivesIntegerPostCallback);
    connect(this, &PFXPrimitivesApi::abortRequestsSignal, worker, &QObject::deleteLater);
    connect(worker, &QObject::destroyed, this, [this]() {
        if (findChildren<PFXHttpRequestWorker*>().count() == 0) {
            Q_EMIT allPendingRequestsCompleted();
        }
    });

    worker->execute(&input);
}

void PFXPrimitivesApi::primitivesIntegerPostCallback(PFXHttpRequestWorker *worker) {
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type != QNetworkReply::NoError) {
        error_str = QString("%1, %2").arg(worker->error_str, QString(worker->response));
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        Q_EMIT primitivesIntegerPostSignal();
        Q_EMIT primitivesIntegerPostSignalFull(worker);
    } else {

#if defined(_MSC_VER)
// For MSVC
#pragma warning(push)
#pragma warning(disable : 4996)
#elif defined(__clang__)
// For Clang
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"
#elif defined(__GNUC__)
// For GCC
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wdeprecated-declarations"
#endif

        Q_EMIT primitivesIntegerPostSignalE(error_type, error_str);
        Q_EMIT primitivesIntegerPostSignalEFull(worker, error_type, error_str);

#if defined(_MSC_VER)
#pragma warning(pop)
#elif defined(__clang__)
#pragma clang diagnostic pop
#elif defined(__GNUC__)
#pragma GCC diagnostic pop
#endif

        Q_EMIT primitivesIntegerPostSignalError(error_type, error_str);
        Q_EMIT primitivesIntegerPostSignalErrorFull(worker, error_type, error_str);
    }
}

void PFXPrimitivesApi::primitivesNumberPut(const ::test_namespace::OptionalParam<double> &body) {
    QString fullPath = QString(_serverConfigs["primitivesNumberPut"][_serverIndices.value("primitivesNumberPut")].URL()+"/primitives/number");
    
    PFXHttpRequestWorker *worker = new PFXHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    PFXHttpRequestInput input(fullPath, "PUT");

    if (body.hasValue()){

        QByteArray output = QByteArray::number(body.value());
        input.request_body.append(output);
    }
    for (auto keyValueIt = _defaultHeaders.keyValueBegin(); keyValueIt != _defaultHeaders.keyValueEnd(); keyValueIt++) {
        input.headers.insert(keyValueIt->first, keyValueIt->second);
    }

    connect(worker, &PFXHttpRequestWorker::downloadProgress, this, &PFXPrimitivesApi::primitivesNumberPutProgress);
    connect(worker, &PFXHttpRequestWorker::on_execution_finished, this, &PFXPrimitivesApi::primitivesNumberPutCallback);
    connect(this, &PFXPrimitivesApi::abortRequestsSignal, worker, &QObject::deleteLater);
    connect(worker, &QObject::destroyed, this, [this]() {
        if (findChildren<PFXHttpRequestWorker*>().count() == 0) {
            Q_EMIT allPendingRequestsCompleted();
        }
    });

    worker->execute(&input);
}

void PFXPrimitivesApi::primitivesNumberPutCallback(PFXHttpRequestWorker *worker) {
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type != QNetworkReply::NoError) {
        error_str = QString("%1, %2").arg(worker->error_str, QString(worker->response));
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        Q_EMIT primitivesNumberPutSignal();
        Q_EMIT primitivesNumberPutSignalFull(worker);
    } else {

#if defined(_MSC_VER)
// For MSVC
#pragma warning(push)
#pragma warning(disable : 4996)
#elif defined(__clang__)
// For Clang
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"
#elif defined(__GNUC__)
// For GCC
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wdeprecated-declarations"
#endif

        Q_EMIT primitivesNumberPutSignalE(error_type, error_str);
        Q_EMIT primitivesNumberPutSignalEFull(worker, error_type, error_str);

#if defined(_MSC_VER)
#pragma warning(pop)
#elif defined(__clang__)
#pragma clang diagnostic pop
#elif defined(__GNUC__)
#pragma GCC diagnostic pop
#endif

        Q_EMIT primitivesNumberPutSignalError(error_type, error_str);
        Q_EMIT primitivesNumberPutSignalErrorFull(worker, error_type, error_str);
    }
}

void PFXPrimitivesApi::tokenAvailable(){

    oauthToken token;
    switch (_OauthMethod) {
    case 1: //implicit flow
        token = _implicitFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _implicitFlow.removeToken(_latestScope.join(" "));
            qDebug() << "Could not retrieve a valid token";
        }
        break;
    case 2: //authorization flow
        token = _authFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _authFlow.removeToken(_latestScope.join(" "));
            qDebug() << "Could not retrieve a valid token";
        }
        break;
    case 3: //client credentials flow
        token = _credentialFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _credentialFlow.removeToken(_latestScope.join(" "));
            qDebug() << "Could not retrieve a valid token";
        }
        break;
    case 4: //resource owner password flow
        token = _passwordFlow.getToken(_latestScope.join(" "));
        if(token.isValid()){
            _latestInput.headers.insert("Authorization", "Bearer " + token.getToken());
            _latestWorker->execute(&_latestInput);
        }else{
            _credentialFlow.removeToken(_latestScope.join(" "));
            qDebug() << "Could not retrieve a valid token";
        }
        break;
    default:
        qDebug() << "No Oauth method set!";
        break;
    }
}
} // namespace test_namespace