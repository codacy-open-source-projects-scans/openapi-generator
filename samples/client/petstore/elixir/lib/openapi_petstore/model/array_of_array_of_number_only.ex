# NOTE: This file is auto generated by OpenAPI Generator 7.9.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.ArrayOfArrayOfNumberOnly do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :ArrayArrayNumber
  ]

  @type t :: %__MODULE__{
    :ArrayArrayNumber => [[float()]] | nil
  }

  def decode(value) do
    value
  end
end
