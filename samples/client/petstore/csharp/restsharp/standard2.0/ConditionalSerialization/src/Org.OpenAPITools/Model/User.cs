/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// User
    /// </summary>
    [DataContract(Name = "User")]
    public partial class User : IEquatable<User>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="User" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="username">username.</param>
        /// <param name="firstName">firstName.</param>
        /// <param name="lastName">lastName.</param>
        /// <param name="email">email.</param>
        /// <param name="password">password.</param>
        /// <param name="phone">phone.</param>
        /// <param name="userStatus">User Status.</param>
        /// <param name="objectWithNoDeclaredProps">test code generation for objects Value must be a map of strings to values. It cannot be the &#39;null&#39; value..</param>
        /// <param name="objectWithNoDeclaredPropsNullable">test code generation for nullable objects. Value must be a map of strings to values or the &#39;null&#39; value..</param>
        /// <param name="anyTypeProp">test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389.</param>
        /// <param name="anyTypePropNullable">test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#39;nullable&#39; attribute does not change the allowed values..</param>
        public User(long id = default(long), string username = default(string), string firstName = default(string), string lastName = default(string), string email = default(string), string password = default(string), string phone = default(string), int userStatus = default(int), Object objectWithNoDeclaredProps = default(Object), Object objectWithNoDeclaredPropsNullable = default(Object), Object anyTypeProp = default(Object), Object anyTypePropNullable = default(Object))
        {
            this._Id = id;
            if (this.Id != null)
            {
                this._flagId = true;
            }
            this._Username = username;
            if (this.Username != null)
            {
                this._flagUsername = true;
            }
            this._FirstName = firstName;
            if (this.FirstName != null)
            {
                this._flagFirstName = true;
            }
            this._LastName = lastName;
            if (this.LastName != null)
            {
                this._flagLastName = true;
            }
            this._Email = email;
            if (this.Email != null)
            {
                this._flagEmail = true;
            }
            this._Password = password;
            if (this.Password != null)
            {
                this._flagPassword = true;
            }
            this._Phone = phone;
            if (this.Phone != null)
            {
                this._flagPhone = true;
            }
            this._UserStatus = userStatus;
            if (this.UserStatus != null)
            {
                this._flagUserStatus = true;
            }
            this._ObjectWithNoDeclaredProps = objectWithNoDeclaredProps;
            if (this.ObjectWithNoDeclaredProps != null)
            {
                this._flagObjectWithNoDeclaredProps = true;
            }
            this._ObjectWithNoDeclaredPropsNullable = objectWithNoDeclaredPropsNullable;
            if (this.ObjectWithNoDeclaredPropsNullable != null)
            {
                this._flagObjectWithNoDeclaredPropsNullable = true;
            }
            this._AnyTypeProp = anyTypeProp;
            if (this.AnyTypeProp != null)
            {
                this._flagAnyTypeProp = true;
            }
            this._AnyTypePropNullable = anyTypePropNullable;
            if (this.AnyTypePropNullable != null)
            {
                this._flagAnyTypePropNullable = true;
            }
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public long Id
        {
            get{ return _Id;}
            set
            {
                _Id = value;
                _flagId = true;
            }
        }
        private long _Id;
        private bool _flagId;

        /// <summary>
        /// Returns false as Id should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeId()
        {
            return _flagId;
        }
        /// <summary>
        /// Gets or Sets Username
        /// </summary>
        [DataMember(Name = "username", EmitDefaultValue = false)]
        public string Username
        {
            get{ return _Username;}
            set
            {
                _Username = value;
                _flagUsername = true;
            }
        }
        private string _Username;
        private bool _flagUsername;

        /// <summary>
        /// Returns false as Username should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeUsername()
        {
            return _flagUsername;
        }
        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name = "firstName", EmitDefaultValue = false)]
        public string FirstName
        {
            get{ return _FirstName;}
            set
            {
                _FirstName = value;
                _flagFirstName = true;
            }
        }
        private string _FirstName;
        private bool _flagFirstName;

        /// <summary>
        /// Returns false as FirstName should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeFirstName()
        {
            return _flagFirstName;
        }
        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        [DataMember(Name = "lastName", EmitDefaultValue = false)]
        public string LastName
        {
            get{ return _LastName;}
            set
            {
                _LastName = value;
                _flagLastName = true;
            }
        }
        private string _LastName;
        private bool _flagLastName;

        /// <summary>
        /// Returns false as LastName should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeLastName()
        {
            return _flagLastName;
        }
        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name = "email", EmitDefaultValue = false)]
        public string Email
        {
            get{ return _Email;}
            set
            {
                _Email = value;
                _flagEmail = true;
            }
        }
        private string _Email;
        private bool _flagEmail;

        /// <summary>
        /// Returns false as Email should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeEmail()
        {
            return _flagEmail;
        }
        /// <summary>
        /// Gets or Sets Password
        /// </summary>
        [DataMember(Name = "password", EmitDefaultValue = false)]
        public string Password
        {
            get{ return _Password;}
            set
            {
                _Password = value;
                _flagPassword = true;
            }
        }
        private string _Password;
        private bool _flagPassword;

        /// <summary>
        /// Returns false as Password should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializePassword()
        {
            return _flagPassword;
        }
        /// <summary>
        /// Gets or Sets Phone
        /// </summary>
        [DataMember(Name = "phone", EmitDefaultValue = false)]
        public string Phone
        {
            get{ return _Phone;}
            set
            {
                _Phone = value;
                _flagPhone = true;
            }
        }
        private string _Phone;
        private bool _flagPhone;

        /// <summary>
        /// Returns false as Phone should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializePhone()
        {
            return _flagPhone;
        }
        /// <summary>
        /// User Status
        /// </summary>
        /// <value>User Status</value>
        [DataMember(Name = "userStatus", EmitDefaultValue = false)]
        public int UserStatus
        {
            get{ return _UserStatus;}
            set
            {
                _UserStatus = value;
                _flagUserStatus = true;
            }
        }
        private int _UserStatus;
        private bool _flagUserStatus;

        /// <summary>
        /// Returns false as UserStatus should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeUserStatus()
        {
            return _flagUserStatus;
        }
        /// <summary>
        /// test code generation for objects Value must be a map of strings to values. It cannot be the &#39;null&#39; value.
        /// </summary>
        /// <value>test code generation for objects Value must be a map of strings to values. It cannot be the &#39;null&#39; value.</value>
        [DataMember(Name = "objectWithNoDeclaredProps", EmitDefaultValue = false)]
        public Object ObjectWithNoDeclaredProps
        {
            get{ return _ObjectWithNoDeclaredProps;}
            set
            {
                _ObjectWithNoDeclaredProps = value;
                _flagObjectWithNoDeclaredProps = true;
            }
        }
        private Object _ObjectWithNoDeclaredProps;
        private bool _flagObjectWithNoDeclaredProps;

        /// <summary>
        /// Returns false as ObjectWithNoDeclaredProps should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeObjectWithNoDeclaredProps()
        {
            return _flagObjectWithNoDeclaredProps;
        }
        /// <summary>
        /// test code generation for nullable objects. Value must be a map of strings to values or the &#39;null&#39; value.
        /// </summary>
        /// <value>test code generation for nullable objects. Value must be a map of strings to values or the &#39;null&#39; value.</value>
        [DataMember(Name = "objectWithNoDeclaredPropsNullable", EmitDefaultValue = true)]
        public Object ObjectWithNoDeclaredPropsNullable
        {
            get{ return _ObjectWithNoDeclaredPropsNullable;}
            set
            {
                _ObjectWithNoDeclaredPropsNullable = value;
                _flagObjectWithNoDeclaredPropsNullable = true;
            }
        }
        private Object _ObjectWithNoDeclaredPropsNullable;
        private bool _flagObjectWithNoDeclaredPropsNullable;

        /// <summary>
        /// Returns false as ObjectWithNoDeclaredPropsNullable should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeObjectWithNoDeclaredPropsNullable()
        {
            return _flagObjectWithNoDeclaredPropsNullable;
        }
        /// <summary>
        /// test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389
        /// </summary>
        /// <value>test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. See https://github.com/OAI/OpenAPI-Specification/issues/1389</value>
        [DataMember(Name = "anyTypeProp", EmitDefaultValue = true)]
        public Object AnyTypeProp
        {
            get{ return _AnyTypeProp;}
            set
            {
                _AnyTypeProp = value;
                _flagAnyTypeProp = true;
            }
        }
        private Object _AnyTypeProp;
        private bool _flagAnyTypeProp;

        /// <summary>
        /// Returns false as AnyTypeProp should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeAnyTypeProp()
        {
            return _flagAnyTypeProp;
        }
        /// <summary>
        /// test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#39;nullable&#39; attribute does not change the allowed values.
        /// </summary>
        /// <value>test code generation for any type Here the &#39;type&#39; attribute is not specified, which means the value can be anything, including the null value, string, number, boolean, array or object. The &#39;nullable&#39; attribute does not change the allowed values.</value>
        [DataMember(Name = "anyTypePropNullable", EmitDefaultValue = true)]
        public Object AnyTypePropNullable
        {
            get{ return _AnyTypePropNullable;}
            set
            {
                _AnyTypePropNullable = value;
                _flagAnyTypePropNullable = true;
            }
        }
        private Object _AnyTypePropNullable;
        private bool _flagAnyTypePropNullable;

        /// <summary>
        /// Returns false as AnyTypePropNullable should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeAnyTypePropNullable()
        {
            return _flagAnyTypePropNullable;
        }
        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class User {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Phone: ").Append(Phone).Append("\n");
            sb.Append("  UserStatus: ").Append(UserStatus).Append("\n");
            sb.Append("  ObjectWithNoDeclaredProps: ").Append(ObjectWithNoDeclaredProps).Append("\n");
            sb.Append("  ObjectWithNoDeclaredPropsNullable: ").Append(ObjectWithNoDeclaredPropsNullable).Append("\n");
            sb.Append("  AnyTypeProp: ").Append(AnyTypeProp).Append("\n");
            sb.Append("  AnyTypePropNullable: ").Append(AnyTypePropNullable).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input as User).AreEqual;
        }

        /// <summary>
        /// Returns true if User instances are equal
        /// </summary>
        /// <param name="input">Instance of User to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(User input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input).AreEqual;
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + this.Id.GetHashCode();
                if (this.Username != null)
                {
                    hashCode = (hashCode * 59) + this.Username.GetHashCode();
                }
                if (this.FirstName != null)
                {
                    hashCode = (hashCode * 59) + this.FirstName.GetHashCode();
                }
                if (this.LastName != null)
                {
                    hashCode = (hashCode * 59) + this.LastName.GetHashCode();
                }
                if (this.Email != null)
                {
                    hashCode = (hashCode * 59) + this.Email.GetHashCode();
                }
                if (this.Password != null)
                {
                    hashCode = (hashCode * 59) + this.Password.GetHashCode();
                }
                if (this.Phone != null)
                {
                    hashCode = (hashCode * 59) + this.Phone.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.UserStatus.GetHashCode();
                if (this.ObjectWithNoDeclaredProps != null)
                {
                    hashCode = (hashCode * 59) + this.ObjectWithNoDeclaredProps.GetHashCode();
                }
                if (this.ObjectWithNoDeclaredPropsNullable != null)
                {
                    hashCode = (hashCode * 59) + this.ObjectWithNoDeclaredPropsNullable.GetHashCode();
                }
                if (this.AnyTypeProp != null)
                {
                    hashCode = (hashCode * 59) + this.AnyTypeProp.GetHashCode();
                }
                if (this.AnyTypePropNullable != null)
                {
                    hashCode = (hashCode * 59) + this.AnyTypePropNullable.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}