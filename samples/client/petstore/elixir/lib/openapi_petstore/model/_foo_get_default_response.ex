# NOTE: This file is auto generated by OpenAPI Generator 7.9.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.FooGetDefaultResponse do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :string
  ]

  @type t :: %__MODULE__{
    :string => OpenapiPetstore.Model.Foo.t | nil
  }

  alias OpenapiPetstore.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:string, :struct, OpenapiPetstore.Model.Foo)
  end
end
