using FluentValidation;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AddPetRequest
{
    /// <summary>
    /// Pet object that needs to be added to the store
    /// </summary>
    [FastEndpoints.FromBody]
    public Pet pet { get; set; }
}
public class DeletePetRequest
{
    /// <summary>
    /// Pet id to delete
    /// </summary>
    [FastEndpoints.BindFrom("petId")]
    public long PetId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromHeader]
    public string? ApiKey { get; set; }
}
public class FindPetsByStatusRequest
{
    /// <summary>
    /// Status values that need to be considered for filter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public List<string> Status { get; set; }
}
public class FindPetsByTagsRequest
{
    /// <summary>
    /// Tags to filter by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public List<string> Tags { get; set; }
}
public class GetPetByIdRequest
{
    /// <summary>
    /// ID of pet to return
    /// </summary>
    [FastEndpoints.BindFrom("petId")]
    public long PetId { get; set; }
}
public class UpdatePetRequest
{
    /// <summary>
    /// Pet object that needs to be added to the store
    /// </summary>
    [FastEndpoints.FromBody]
    public Pet pet { get; set; }
}
public class UpdatePetWithFormRequest
{
    /// <summary>
    /// ID of pet that needs to be updated
    /// </summary>
    [FastEndpoints.BindFrom("petId")]
    public long PetId { get; set; }
    /// <summary>
    /// Updated name of the pet
    /// </summary>
    [FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// Updated status of the pet
    /// </summary>
    [FastEndpoints.BindFrom("status")]
    public string? Status { get; set; }
}
public class UploadFileRequest
{
    /// <summary>
    /// ID of pet to update
    /// </summary>
    [FastEndpoints.BindFrom("petId")]
    public long PetId { get; set; }
    /// <summary>
    /// Additional data to pass to server
    /// </summary>
    [FastEndpoints.BindFrom("additionalMetadata")]
    public string? AdditionalMetadata { get; set; }
    /// <summary>
    /// file to upload
    /// </summary>
    [FastEndpoints.BindFrom("file")]
    public System.IO.Stream? File { get; set; }
}



public class AddPetRequestValidator : FastEndpoints.Validator<AddPetRequest>
{
    public AddPetRequestValidator()
    {
        RuleFor(x => x.pet).NotEmpty();
    }
}


public class DeletePetRequestValidator : FastEndpoints.Validator<DeletePetRequest>
{
    public DeletePetRequestValidator()
    {
        RuleFor(x => x.PetId).NotEmpty();
    }
}


public class FindPetsByStatusRequestValidator : FastEndpoints.Validator<FindPetsByStatusRequest>
{
    public FindPetsByStatusRequestValidator()
    {
        RuleFor(x => x.Status).NotEmpty();
    }
}


public class FindPetsByTagsRequestValidator : FastEndpoints.Validator<FindPetsByTagsRequest>
{
    public FindPetsByTagsRequestValidator()
    {
        RuleFor(x => x.Tags).NotEmpty();
    }
}


public class GetPetByIdRequestValidator : FastEndpoints.Validator<GetPetByIdRequest>
{
    public GetPetByIdRequestValidator()
    {
        RuleFor(x => x.PetId).NotEmpty();
    }
}


public class UpdatePetRequestValidator : FastEndpoints.Validator<UpdatePetRequest>
{
    public UpdatePetRequestValidator()
    {
        RuleFor(x => x.pet).NotEmpty();
    }
}


public class UpdatePetWithFormRequestValidator : FastEndpoints.Validator<UpdatePetWithFormRequest>
{
    public UpdatePetWithFormRequestValidator()
    {
        RuleFor(x => x.PetId).NotEmpty();
    }
}


public class UploadFileRequestValidator : FastEndpoints.Validator<UploadFileRequest>
{
    public UploadFileRequestValidator()
    {
        RuleFor(x => x.PetId).NotEmpty();
    }
}

