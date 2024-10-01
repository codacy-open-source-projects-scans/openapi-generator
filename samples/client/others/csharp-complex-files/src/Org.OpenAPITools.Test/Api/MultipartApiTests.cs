/*
 * MultipartFile test
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing MultipartApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class MultipartApiTests : IDisposable
    {
        private MultipartApi instance;

        public MultipartApiTests()
        {
            instance = new MultipartApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of MultipartApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' MultipartApi
            //Assert.IsType<MultipartApi>(instance);
        }

        /// <summary>
        /// Test MultipartArray
        /// </summary>
        [Fact]
        public void MultipartArrayTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<System.IO.Stream> files = null;
            //instance.MultipartArray(files);
        }

        /// <summary>
        /// Test MultipartMixed
        /// </summary>
        [Fact]
        public void MultipartMixedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //MultipartMixedStatus status = null;
            //System.IO.Stream file = null;
            //MultipartMixedRequestMarker marker = null;
            //List<MultipartMixedStatus> statusArray = null;
            //instance.MultipartMixed(status, file, marker, statusArray);
        }

        /// <summary>
        /// Test MultipartSingle
        /// </summary>
        [Fact]
        public void MultipartSingleTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //System.IO.Stream file = null;
            //instance.MultipartSingle(file);
        }
    }
}
