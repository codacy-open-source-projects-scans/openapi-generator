// <auto-generated>
/*
 * Files.com API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: support@files.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections.Generic;
using System.Net;
using System.Threading.Tasks;
using Microsoft.Extensions.Logging;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text.Json;
using Org.OpenAPITools.Client;
using System.Diagnostics.CodeAnalysis;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// This class is registered as transient.
    /// </summary>
    public interface IApiKeysApi : IApi
    {
        /// <summary>
        /// The class containing the events
        /// </summary>
        ApiKeysApiEvents Events { get; }

        /// <summary>
        /// Show API Key
        /// </summary>
        /// <remarks>
        /// Show API Key
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Api Key ID.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IGetApiKeysIdApiResponse"/>&gt;</returns>
        Task<IGetApiKeysIdApiResponse> GetApiKeysIdAsync(int id, System.Threading.CancellationToken cancellationToken = default);

        /// <summary>
        /// Show API Key
        /// </summary>
        /// <remarks>
        /// Show API Key
        /// </remarks>
        /// <param name="id">Api Key ID.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IGetApiKeysIdApiResponse"/>?&gt;</returns>
        Task<IGetApiKeysIdApiResponse?> GetApiKeysIdOrDefaultAsync(int id, System.Threading.CancellationToken cancellationToken = default);
    }

    /// <summary>
    /// The <see cref="IGetApiKeysIdApiResponse"/>
    /// </summary>
    public interface IGetApiKeysIdApiResponse : Org.OpenAPITools.Client.IApiResponse
    {
        /// <summary>
        /// Returns true if the response is 400 BadRequest
        /// </summary>
        /// <returns></returns>
        bool IsBadRequest { get; }
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ApiKeysApiEvents
    {
        /// <summary>
        /// The event raised after the server response
        /// </summary>
        public event EventHandler<ApiResponseEventArgs>? OnGetApiKeysId;

        /// <summary>
        /// The event raised after an error querying the server
        /// </summary>
        public event EventHandler<ExceptionEventArgs>? OnErrorGetApiKeysId;

        internal void ExecuteOnGetApiKeysId(ApiKeysApi.GetApiKeysIdApiResponse apiResponse)
        {
            OnGetApiKeysId?.Invoke(this, new ApiResponseEventArgs(apiResponse));
        }

        internal void ExecuteOnErrorGetApiKeysId(Exception exception)
        {
            OnErrorGetApiKeysId?.Invoke(this, new ExceptionEventArgs(exception));
        }
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public sealed partial class ApiKeysApi : IApiKeysApi
    {
        private JsonSerializerOptions _jsonSerializerOptions;

        /// <summary>
        /// The logger factory
        /// </summary>
        public ILoggerFactory LoggerFactory { get; }

        /// <summary>
        /// The logger
        /// </summary>
        public ILogger<ApiKeysApi> Logger { get; }

        /// <summary>
        /// The HttpClient
        /// </summary>
        public HttpClient HttpClient { get; }

        /// <summary>
        /// The class containing the events
        /// </summary>
        public ApiKeysApiEvents Events { get; }

        /// <summary>
        /// A token provider of type <see cref="ApiKeyProvider"/>
        /// </summary>
        public TokenProvider<ApiKeyToken> ApiKeyProvider { get; }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiKeysApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ApiKeysApi(ILogger<ApiKeysApi> logger, ILoggerFactory loggerFactory, HttpClient httpClient, JsonSerializerOptionsProvider jsonSerializerOptionsProvider, ApiKeysApiEvents apiKeysApiEvents,
            TokenProvider<ApiKeyToken> apiKeyProvider)
        {
            _jsonSerializerOptions = jsonSerializerOptionsProvider.Options;
            LoggerFactory = loggerFactory;
            Logger = LoggerFactory.CreateLogger<ApiKeysApi>();
            HttpClient = httpClient;
            Events = apiKeysApiEvents;
            ApiKeyProvider = apiKeyProvider;
        }

        partial void FormatGetApiKeysId(ref int id);

        /// <summary>
        /// Processes the server response
        /// </summary>
        /// <param name="apiResponseLocalVar"></param>
        /// <param name="id"></param>
        private void AfterGetApiKeysIdDefaultImplementation(IGetApiKeysIdApiResponse apiResponseLocalVar, int id)
        {
            bool suppressDefaultLog = false;
            AfterGetApiKeysId(ref suppressDefaultLog, apiResponseLocalVar, id);
            if (!suppressDefaultLog)
                Logger.LogInformation("{0,-9} | {1} | {3}", (apiResponseLocalVar.DownloadedAt - apiResponseLocalVar.RequestedAt).TotalSeconds, apiResponseLocalVar.StatusCode, apiResponseLocalVar.Path);
        }

        /// <summary>
        /// Processes the server response
        /// </summary>
        /// <param name="suppressDefaultLog"></param>
        /// <param name="apiResponseLocalVar"></param>
        /// <param name="id"></param>
        partial void AfterGetApiKeysId(ref bool suppressDefaultLog, IGetApiKeysIdApiResponse apiResponseLocalVar, int id);

        /// <summary>
        /// Logs exceptions that occur while retrieving the server response
        /// </summary>
        /// <param name="exceptionLocalVar"></param>
        /// <param name="pathFormatLocalVar"></param>
        /// <param name="pathLocalVar"></param>
        /// <param name="id"></param>
        private void OnErrorGetApiKeysIdDefaultImplementation(Exception exceptionLocalVar, string pathFormatLocalVar, string pathLocalVar, int id)
        {
            bool suppressDefaultLogLocalVar = false;
            OnErrorGetApiKeysId(ref suppressDefaultLogLocalVar, exceptionLocalVar, pathFormatLocalVar, pathLocalVar, id);
            if (!suppressDefaultLogLocalVar)
                Logger.LogError(exceptionLocalVar, "An error occurred while sending the request to the server.");
        }

        /// <summary>
        /// A partial method that gives developers a way to provide customized exception handling
        /// </summary>
        /// <param name="suppressDefaultLogLocalVar"></param>
        /// <param name="exceptionLocalVar"></param>
        /// <param name="pathFormatLocalVar"></param>
        /// <param name="pathLocalVar"></param>
        /// <param name="id"></param>
        partial void OnErrorGetApiKeysId(ref bool suppressDefaultLogLocalVar, Exception exceptionLocalVar, string pathFormatLocalVar, string pathLocalVar, int id);

        /// <summary>
        /// Show API Key Show API Key
        /// </summary>
        /// <param name="id">Api Key ID.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IGetApiKeysIdApiResponse"/>&gt;</returns>
        public async Task<IGetApiKeysIdApiResponse?> GetApiKeysIdOrDefaultAsync(int id, System.Threading.CancellationToken cancellationToken = default)
        {
            try
            {
                return await GetApiKeysIdAsync(id, cancellationToken).ConfigureAwait(false);
            }
            catch (Exception)
            {
                return null;
            }
        }

        /// <summary>
        /// Show API Key Show API Key
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">Api Key ID.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IGetApiKeysIdApiResponse"/>&gt;</returns>
        public async Task<IGetApiKeysIdApiResponse> GetApiKeysIdAsync(int id, System.Threading.CancellationToken cancellationToken = default)
        {
            UriBuilder uriBuilderLocalVar = new UriBuilder();

            try
            {
                FormatGetApiKeysId(ref id);

                using (HttpRequestMessage httpRequestMessageLocalVar = new HttpRequestMessage())
                {
                    uriBuilderLocalVar.Host = HttpClient.BaseAddress!.Host;
                    uriBuilderLocalVar.Port = HttpClient.BaseAddress.Port;
                    uriBuilderLocalVar.Scheme = HttpClient.BaseAddress.Scheme;
                    uriBuilderLocalVar.Path = ClientUtils.CONTEXT_PATH + "/api_keys/{id}";
                    uriBuilderLocalVar.Path = uriBuilderLocalVar.Path.Replace("%7Bid%7D", Uri.EscapeDataString(id.ToString()));

                    httpRequestMessageLocalVar.RequestUri = uriBuilderLocalVar.Uri;

                    httpRequestMessageLocalVar.Method = HttpMethod.Get;

                    DateTime requestedAtLocalVar = DateTime.UtcNow;

                    using (HttpResponseMessage httpResponseMessageLocalVar = await HttpClient.SendAsync(httpRequestMessageLocalVar, cancellationToken).ConfigureAwait(false))
                    {
                        string responseContentLocalVar = await httpResponseMessageLocalVar.Content.ReadAsStringAsync(cancellationToken).ConfigureAwait(false);

                        ILogger<GetApiKeysIdApiResponse> apiResponseLoggerLocalVar = LoggerFactory.CreateLogger<GetApiKeysIdApiResponse>();

                        GetApiKeysIdApiResponse apiResponseLocalVar = new(apiResponseLoggerLocalVar, httpRequestMessageLocalVar, httpResponseMessageLocalVar, responseContentLocalVar, "/api_keys/{id}", requestedAtLocalVar, _jsonSerializerOptions);

                        AfterGetApiKeysIdDefaultImplementation(apiResponseLocalVar, id);

                        Events.ExecuteOnGetApiKeysId(apiResponseLocalVar);

                        return apiResponseLocalVar;
                    }
                }
            }
            catch(Exception e)
            {
                OnErrorGetApiKeysIdDefaultImplementation(e, "/api_keys/{id}", uriBuilderLocalVar.Path, id);
                Events.ExecuteOnErrorGetApiKeysId(e);
                throw;
            }
        }

        /// <summary>
        /// The <see cref="GetApiKeysIdApiResponse"/>
        /// </summary>
        public partial class GetApiKeysIdApiResponse : Org.OpenAPITools.Client.ApiResponse, IGetApiKeysIdApiResponse
        {
            /// <summary>
            /// The logger
            /// </summary>
            public ILogger<GetApiKeysIdApiResponse> Logger { get; }

            /// <summary>
            /// The <see cref="GetApiKeysIdApiResponse"/>
            /// </summary>
            /// <param name="logger"></param>
            /// <param name="httpRequestMessage"></param>
            /// <param name="httpResponseMessage"></param>
            /// <param name="rawContent"></param>
            /// <param name="path"></param>
            /// <param name="requestedAt"></param>
            /// <param name="jsonSerializerOptions"></param>
            public GetApiKeysIdApiResponse(ILogger<GetApiKeysIdApiResponse> logger, System.Net.Http.HttpRequestMessage httpRequestMessage, System.Net.Http.HttpResponseMessage httpResponseMessage, string rawContent, string path, DateTime requestedAt, System.Text.Json.JsonSerializerOptions jsonSerializerOptions) : base(httpRequestMessage, httpResponseMessage, rawContent, path, requestedAt, jsonSerializerOptions)
            {
                Logger = logger;
                OnCreated(httpRequestMessage, httpResponseMessage);
            }

            partial void OnCreated(global::System.Net.Http.HttpRequestMessage httpRequestMessage, System.Net.Http.HttpResponseMessage httpResponseMessage);

            /// <summary>
            /// Returns true if the response is 400 BadRequest
            /// </summary>
            /// <returns></returns>
            public bool IsBadRequest => 400 == (int)StatusCode;

            private void OnDeserializationErrorDefaultImplementation(Exception exception, HttpStatusCode httpStatusCode)
            {
                bool suppressDefaultLog = false;
                OnDeserializationError(ref suppressDefaultLog, exception, httpStatusCode);
                if (!suppressDefaultLog)
                    Logger.LogError(exception, "An error occurred while deserializing the {code} response.", httpStatusCode);
            }

            partial void OnDeserializationError(ref bool suppressDefaultLog, Exception exception, HttpStatusCode httpStatusCode);
        }
    }
}