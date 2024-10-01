# NOTE: This file is auto generated by OpenAPI Generator 7.9.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Api.Pet do
  @moduledoc """
  API calls for all endpoints tagged `Pet`.
  """

  alias OpenapiPetstore.Connection
  import OpenapiPetstore.RequestBuilder

  @doc """
  Add a new pet to the store
  

  ### Parameters

  - `connection` (OpenapiPetstore.Connection): Connection to server
  - `pet` (Pet): Pet object that needs to be added to the store
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec add_pet(Tesla.Env.client, OpenapiPetstore.Model.Pet.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def add_pet(connection, pet, _opts \\ []) do
    request =
      %{}
      |> method(:post)
      |> url("/pet")
      |> add_param(:body, :body, pet)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false},
      {405, false}
    ])
  end

  @doc """
  Deletes a pet
  

  ### Parameters

  - `connection` (OpenapiPetstore.Connection): Connection to server
  - `pet_id` (integer()): Pet id to delete
  - `opts` (keyword): Optional parameters
    - `:api_key` (String.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec delete_pet(Tesla.Env.client, integer(), keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def delete_pet(connection, pet_id, opts \\ []) do
    optional_params = %{
      :api_key => :headers
    }

    request =
      %{}
      |> method(:delete)
      |> url("/pet/#{pet_id}")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false},
      {400, false}
    ])
  end

  @doc """
  Finds Pets by status
  Multiple status values can be provided with comma separated strings

  ### Parameters

  - `connection` (OpenapiPetstore.Connection): Connection to server
  - `status` ([String.t]): Status values that need to be considered for filter
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%Pet{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec find_pets_by_status(Tesla.Env.client, list(String.t), keyword()) :: {:ok, nil} | {:ok, [OpenapiPetstore.Model.Pet.t]} | {:error, Tesla.Env.t}
  def find_pets_by_status(connection, status, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/pet/findByStatus")
      |> add_param(:query, :status, status)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, OpenapiPetstore.Model.Pet},
      {400, false}
    ])
  end

  @doc """
  Finds Pets by tags
  Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

  ### Parameters

  - `connection` (OpenapiPetstore.Connection): Connection to server
  - `tags` ([String.t]): Tags to filter by
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%Pet{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec find_pets_by_tags(Tesla.Env.client, list(String.t), keyword()) :: {:ok, nil} | {:ok, [OpenapiPetstore.Model.Pet.t]} | {:error, Tesla.Env.t}
  def find_pets_by_tags(connection, tags, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/pet/findByTags")
      |> add_param(:query, :tags, tags)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, OpenapiPetstore.Model.Pet},
      {400, false}
    ])
  end

  @doc """
  Find pet by ID
  Returns a single pet

  ### Parameters

  - `connection` (OpenapiPetstore.Connection): Connection to server
  - `pet_id` (integer()): ID of pet to return
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, OpenapiPetstore.Model.Pet.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec get_pet_by_id(Tesla.Env.client, integer(), keyword()) :: {:ok, nil} | {:ok, OpenapiPetstore.Model.Pet.t} | {:error, Tesla.Env.t}
  def get_pet_by_id(connection, pet_id, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/pet/#{pet_id}")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, OpenapiPetstore.Model.Pet},
      {400, false},
      {404, false}
    ])
  end

  @doc """
  Update an existing pet
  

  ### Parameters

  - `connection` (OpenapiPetstore.Connection): Connection to server
  - `pet` (Pet): Pet object that needs to be added to the store
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec update_pet(Tesla.Env.client, OpenapiPetstore.Model.Pet.t, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def update_pet(connection, pet, _opts \\ []) do
    request =
      %{}
      |> method(:put)
      |> url("/pet")
      |> add_param(:body, :body, pet)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false},
      {400, false},
      {404, false},
      {405, false}
    ])
  end

  @doc """
  Updates a pet in the store with form data
  

  ### Parameters

  - `connection` (OpenapiPetstore.Connection): Connection to server
  - `pet_id` (integer()): ID of pet that needs to be updated
  - `opts` (keyword): Optional parameters
    - `:name` (String.t): Updated name of the pet
    - `:status` (String.t): Updated status of the pet

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec update_pet_with_form(Tesla.Env.client, integer(), keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def update_pet_with_form(connection, pet_id, opts \\ []) do
    optional_params = %{
      :name => :form,
      :status => :form
    }

    request =
      %{}
      |> method(:post)
      |> url("/pet/#{pet_id}")
      |> add_optional_params(optional_params, opts)
      |> ensure_body()
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false},
      {405, false}
    ])
  end

  @doc """
  uploads an image
  

  ### Parameters

  - `connection` (OpenapiPetstore.Connection): Connection to server
  - `pet_id` (integer()): ID of pet to update
  - `opts` (keyword): Optional parameters
    - `:additionalMetadata` (String.t): Additional data to pass to server
    - `:file` (String.t): file to upload

  ### Returns

  - `{:ok, OpenapiPetstore.Model.ApiResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec upload_file(Tesla.Env.client, integer(), keyword()) :: {:ok, OpenapiPetstore.Model.ApiResponse.t} | {:error, Tesla.Env.t}
  def upload_file(connection, pet_id, opts \\ []) do
    optional_params = %{
      :additionalMetadata => :form,
      :file => :form
    }

    request =
      %{}
      |> method(:post)
      |> url("/pet/#{pet_id}/uploadImage")
      |> add_optional_params(optional_params, opts)
      |> ensure_body()
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, OpenapiPetstore.Model.ApiResponse}
    ])
  end

  @doc """
  uploads an image (required)
  

  ### Parameters

  - `connection` (OpenapiPetstore.Connection): Connection to server
  - `pet_id` (integer()): ID of pet to update
  - `required_file` (String.t): file to upload
  - `opts` (keyword): Optional parameters
    - `:additionalMetadata` (String.t): Additional data to pass to server

  ### Returns

  - `{:ok, OpenapiPetstore.Model.ApiResponse.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec upload_file_with_required_file(Tesla.Env.client, integer(), String.t, keyword()) :: {:ok, OpenapiPetstore.Model.ApiResponse.t} | {:error, Tesla.Env.t}
  def upload_file_with_required_file(connection, pet_id, required_file, opts \\ []) do
    optional_params = %{
      :additionalMetadata => :form
    }

    request =
      %{}
      |> method(:post)
      |> url("/fake/#{pet_id}/uploadImageWithRequiredFile")
      |> add_param(:file, :requiredFile, required_file)
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, OpenapiPetstore.Model.ApiResponse}
    ])
  end
end