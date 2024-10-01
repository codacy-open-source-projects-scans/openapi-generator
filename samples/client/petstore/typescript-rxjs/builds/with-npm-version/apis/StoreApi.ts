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
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpHeaders } from '../runtime';
import type {
    Order,
} from '../models';

export interface DeleteOrderRequest {
    orderId: string;
}

export interface GetOrderByIdRequest {
    orderId: number;
}

export interface PlaceOrderRequest {
    body: Order;
}

/**
 * no description
 */
export class StoreApi extends BaseAPI {

    /**
     * For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors
     * Delete purchase order by ID
     */
    deleteOrder({ orderId }: DeleteOrderRequest): Observable<void>
    deleteOrder({ orderId }: DeleteOrderRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    deleteOrder({ orderId }: DeleteOrderRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(orderId, 'orderId', 'deleteOrder');

        return this.request<void>({
            url: '/store/order/{orderId}'.replace('{orderId}', encodeURI(orderId)),
            method: 'DELETE',
        }, opts?.responseOpts);
    };

    /**
     * Returns a map of status codes to quantities
     * Returns pet inventories by status
     */
    getInventory(): Observable<{ [key: string]: number; }>
    getInventory(opts?: OperationOpts): Observable<AjaxResponse<{ [key: string]: number; }>>
    getInventory(opts?: OperationOpts): Observable<{ [key: string]: number; } | AjaxResponse<{ [key: string]: number; }>> {
        const headers: HttpHeaders = {
            ...(this.configuration.apiKey && { 'api_key': this.configuration.apiKey('api_key') }), // api_key authentication
        };

        return this.request<{ [key: string]: number; }>({
            url: '/store/inventory',
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * For valid response try integer IDs with value <= 5 or > 10. Other values will generate exceptions
     * Find purchase order by ID
     */
    getOrderById({ orderId }: GetOrderByIdRequest): Observable<Order>
    getOrderById({ orderId }: GetOrderByIdRequest, opts?: OperationOpts): Observable<AjaxResponse<Order>>
    getOrderById({ orderId }: GetOrderByIdRequest, opts?: OperationOpts): Observable<Order | AjaxResponse<Order>> {
        throwIfNullOrUndefined(orderId, 'orderId', 'getOrderById');

        return this.request<Order>({
            url: '/store/order/{orderId}'.replace('{orderId}', encodeURI(orderId)),
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Place an order for a pet
     */
    placeOrder({ body }: PlaceOrderRequest): Observable<Order>
    placeOrder({ body }: PlaceOrderRequest, opts?: OperationOpts): Observable<AjaxResponse<Order>>
    placeOrder({ body }: PlaceOrderRequest, opts?: OperationOpts): Observable<Order | AjaxResponse<Order>> {
        throwIfNullOrUndefined(body, 'body', 'placeOrder');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<Order>({
            url: '/store/order',
            method: 'POST',
            headers,
            body: body,
        }, opts?.responseOpts);
    };

}