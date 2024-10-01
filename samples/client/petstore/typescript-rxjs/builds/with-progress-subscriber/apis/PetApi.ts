// tslint:disable
/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI, COLLECTION_FORMATS } from '../runtime';
import type { OperationOpts, HttpHeaders, HttpQuery } from '../runtime';
import type {
    ApiResponse,
    Pet,
} from '../models';

export interface AddPetRequest {
    body: Pet;
}

export interface DeletePetRequest {
    petId: number;
    apiKey?: string;
}

export interface FindPetsByStatusRequest {
    status: Array<FindPetsByStatusStatusEnum>;
}

export interface FindPetsByTagsRequest {
    tags: Array<string>;
}

export interface GetPetByIdRequest {
    petId: number;
}

export interface UpdatePetRequest {
    body: Pet;
}

export interface UpdatePetWithFormRequest {
    petId: number;
    name?: string;
    status?: string;
}

export interface UploadFileRequest {
    petId: number;
    additionalMetadata?: string;
    file?: Blob;
}

/**
 * no description
 */
export class PetApi extends BaseAPI {

    /**
     * Add a new pet to the store
     */
    addPet({ body }: AddPetRequest): Observable<void>
    addPet({ body }: AddPetRequest, opts?: Pick<OperationOpts, 'progressSubscriber'>): Observable<void>
    addPet({ body }: AddPetRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    addPet({ body }: AddPetRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(body, 'body', 'addPet');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('petstore_auth', ['write:pets', 'read:pets'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<void>({
            url: '/pet',
            method: 'POST',
            headers,
            body: body,
            progressSubscriber: opts?.progressSubscriber,
        }, opts?.responseOpts);
    };

    /**
     * Deletes a pet
     */
    deletePet({ petId, apiKey }: DeletePetRequest): Observable<void>
    deletePet({ petId, apiKey }: DeletePetRequest, opts?: Pick<OperationOpts, 'progressSubscriber'>): Observable<void>
    deletePet({ petId, apiKey }: DeletePetRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    deletePet({ petId, apiKey }: DeletePetRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(petId, 'petId', 'deletePet');

        const headers: HttpHeaders = {
            ...(apiKey != null ? { 'api_key': String(apiKey) } : undefined),
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('petstore_auth', ['write:pets', 'read:pets'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<void>({
            url: '/pet/{petId}'.replace('{petId}', encodeURI(petId)),
            method: 'DELETE',
            headers,
            progressSubscriber: opts?.progressSubscriber,
        }, opts?.responseOpts);
    };

    /**
     * Multiple status values can be provided with comma separated strings
     * Finds Pets by status
     */
    findPetsByStatus({ status }: FindPetsByStatusRequest): Observable<Array<Pet>>
    findPetsByStatus({ status }: FindPetsByStatusRequest, opts?: Pick<OperationOpts, 'progressSubscriber'>): Observable<Array<Pet>>
    findPetsByStatus({ status }: FindPetsByStatusRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<Pet>>>
    findPetsByStatus({ status }: FindPetsByStatusRequest, opts?: OperationOpts): Observable<Array<Pet> | AjaxResponse<Array<Pet>>> {
        throwIfNullOrUndefined(status, 'status', 'findPetsByStatus');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('petstore_auth', ['write:pets', 'read:pets'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'status': status.join(COLLECTION_FORMATS['csv']),
        };

        return this.request<Array<Pet>>({
            url: '/pet/findByStatus',
            method: 'GET',
            headers,
            query,
            progressSubscriber: opts?.progressSubscriber,
        }, opts?.responseOpts);
    };

    /**
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * Finds Pets by tags
     */
    findPetsByTags({ tags }: FindPetsByTagsRequest): Observable<Array<Pet>>
    findPetsByTags({ tags }: FindPetsByTagsRequest, opts?: Pick<OperationOpts, 'progressSubscriber'>): Observable<Array<Pet>>
    findPetsByTags({ tags }: FindPetsByTagsRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<Pet>>>
    findPetsByTags({ tags }: FindPetsByTagsRequest, opts?: OperationOpts): Observable<Array<Pet> | AjaxResponse<Array<Pet>>> {
        throwIfNullOrUndefined(tags, 'tags', 'findPetsByTags');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('petstore_auth', ['write:pets', 'read:pets'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'tags': tags.join(COLLECTION_FORMATS['csv']),
        };

        return this.request<Array<Pet>>({
            url: '/pet/findByTags',
            method: 'GET',
            headers,
            query,
            progressSubscriber: opts?.progressSubscriber,
        }, opts?.responseOpts);
    };

    /**
     * Returns a single pet
     * Find pet by ID
     */
    getPetById({ petId }: GetPetByIdRequest): Observable<Pet>
    getPetById({ petId }: GetPetByIdRequest, opts?: Pick<OperationOpts, 'progressSubscriber'>): Observable<Pet>
    getPetById({ petId }: GetPetByIdRequest, opts?: OperationOpts): Observable<AjaxResponse<Pet>>
    getPetById({ petId }: GetPetByIdRequest, opts?: OperationOpts): Observable<Pet | AjaxResponse<Pet>> {
        throwIfNullOrUndefined(petId, 'petId', 'getPetById');

        const headers: HttpHeaders = {
            ...(this.configuration.apiKey && { 'api_key': this.configuration.apiKey('api_key') }), // api_key authentication
        };

        return this.request<Pet>({
            url: '/pet/{petId}'.replace('{petId}', encodeURI(petId)),
            method: 'GET',
            headers,
            progressSubscriber: opts?.progressSubscriber,
        }, opts?.responseOpts);
    };

    /**
     * Update an existing pet
     */
    updatePet({ body }: UpdatePetRequest): Observable<void>
    updatePet({ body }: UpdatePetRequest, opts?: Pick<OperationOpts, 'progressSubscriber'>): Observable<void>
    updatePet({ body }: UpdatePetRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    updatePet({ body }: UpdatePetRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(body, 'body', 'updatePet');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('petstore_auth', ['write:pets', 'read:pets'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<void>({
            url: '/pet',
            method: 'PUT',
            headers,
            body: body,
            progressSubscriber: opts?.progressSubscriber,
        }, opts?.responseOpts);
    };

    /**
     * Updates a pet in the store with form data
     */
    updatePetWithForm({ petId, name, status }: UpdatePetWithFormRequest): Observable<void>
    updatePetWithForm({ petId, name, status }: UpdatePetWithFormRequest, opts?: Pick<OperationOpts, 'progressSubscriber'>): Observable<void>
    updatePetWithForm({ petId, name, status }: UpdatePetWithFormRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    updatePetWithForm({ petId, name, status }: UpdatePetWithFormRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(petId, 'petId', 'updatePetWithForm');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('petstore_auth', ['write:pets', 'read:pets'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const formData = new FormData();
        if (name !== undefined) { formData.append('name', name as any); }
        if (status !== undefined) { formData.append('status', status as any); }

        return this.request<void>({
            url: '/pet/{petId}'.replace('{petId}', encodeURI(petId)),
            method: 'POST',
            headers,
            body: formData,
            progressSubscriber: opts?.progressSubscriber,
        }, opts?.responseOpts);
    };

    /**
     * uploads an image
     */
    uploadFile({ petId, additionalMetadata, file }: UploadFileRequest): Observable<ApiResponse>
    uploadFile({ petId, additionalMetadata, file }: UploadFileRequest, opts?: Pick<OperationOpts, 'progressSubscriber'>): Observable<ApiResponse>
    uploadFile({ petId, additionalMetadata, file }: UploadFileRequest, opts?: OperationOpts): Observable<AjaxResponse<ApiResponse>>
    uploadFile({ petId, additionalMetadata, file }: UploadFileRequest, opts?: OperationOpts): Observable<ApiResponse | AjaxResponse<ApiResponse>> {
        throwIfNullOrUndefined(petId, 'petId', 'uploadFile');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('petstore_auth', ['write:pets', 'read:pets'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const formData = new FormData();
        if (additionalMetadata !== undefined) { formData.append('additionalMetadata', additionalMetadata as any); }
        if (file !== undefined) { formData.append('file', file as any); }

        return this.request<ApiResponse>({
            url: '/pet/{petId}/uploadImage'.replace('{petId}', encodeURI(petId)),
            method: 'POST',
            headers,
            body: formData,
            progressSubscriber: opts?.progressSubscriber,
        }, opts?.responseOpts);
    };

}

/**
 * @export
 * @enum {string}
 */
export enum FindPetsByStatusStatusEnum {
    Available = 'available',
    Pending = 'pending',
    Sold = 'sold'
}
