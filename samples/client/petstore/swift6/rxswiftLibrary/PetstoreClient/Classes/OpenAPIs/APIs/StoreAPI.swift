//
// StoreAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
@preconcurrency import RxSwift
#if canImport(AnyCodable)
import AnyCodable
#endif

open class StoreAPI {

    /**
     Delete purchase order by ID
     
     - parameter orderId: (path) ID of the order that needs to be deleted 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: Observable<Void>
     */
    open class func deleteOrder(orderId: String, apiResponseQueue: DispatchQueue = PetstoreClientAPI.shared.apiResponseQueue) -> Observable<Void> {
        return Observable.create { observer -> Disposable in
            let requestTask = self.deleteOrderWithRequestBuilder(orderId: orderId).execute(apiResponseQueue) { result in
                switch result {
                case .success:
                    observer.onNext(())
                case let .failure(error):
                    observer.onError(error)
                }
                observer.onCompleted()
            }
            
            return Disposables.create {
                requestTask.cancel()
            }
        }
    }

    /**
     Delete purchase order by ID
     - DELETE /store/order/{order_id}
     - For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors
     - parameter orderId: (path) ID of the order that needs to be deleted 
     - returns: RequestBuilder<Void> 
     */
    open class func deleteOrderWithRequestBuilder(orderId: String) -> RequestBuilder<Void> {
        var localVariablePath = "/store/order/{order_id}"
        let orderIdPreEscape = "\(APIHelper.mapValueToPathItem(orderId))"
        let orderIdPostEscape = orderIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{order_id}", with: orderIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = PetstoreClientAPI.shared.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Void>.Type = PetstoreClientAPI.shared.requestBuilderFactory.getNonDecodableBuilder()

        return localVariableRequestBuilder.init(method: "DELETE", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: false)
    }

    /**
     Returns pet inventories by status
     
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: Observable<[String: Int]>
     */
    open class func getInventory(apiResponseQueue: DispatchQueue = PetstoreClientAPI.shared.apiResponseQueue) -> Observable<[String: Int]> {
        return Observable.create { observer -> Disposable in
            let requestTask = self.getInventoryWithRequestBuilder().execute(apiResponseQueue) { result in
                switch result {
                case let .success(response):
                    observer.onNext(response.body)
                case let .failure(error):
                    observer.onError(error)
                }
                observer.onCompleted()
            }
            
            return Disposables.create {
                requestTask.cancel()
            }
        }
    }

    /**
     Returns pet inventories by status
     - GET /store/inventory
     - Returns a map of status codes to quantities
     - API Key:
       - type: apiKey api_key (HEADER)
       - name: api_key
     - returns: RequestBuilder<[String: Int]> 
     */
    open class func getInventoryWithRequestBuilder() -> RequestBuilder<[String: Int]> {
        let localVariablePath = "/store/inventory"
        let localVariableURLString = PetstoreClientAPI.shared.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<[String: Int]>.Type = PetstoreClientAPI.shared.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: true)
    }

    /**
     Find purchase order by ID
     
     - parameter orderId: (path) ID of pet that needs to be fetched 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: Observable<Order>
     */
    open class func getOrderById(orderId: Int64, apiResponseQueue: DispatchQueue = PetstoreClientAPI.shared.apiResponseQueue) -> Observable<Order> {
        return Observable.create { observer -> Disposable in
            let requestTask = self.getOrderByIdWithRequestBuilder(orderId: orderId).execute(apiResponseQueue) { result in
                switch result {
                case let .success(response):
                    observer.onNext(response.body)
                case let .failure(error):
                    observer.onError(error)
                }
                observer.onCompleted()
            }
            
            return Disposables.create {
                requestTask.cancel()
            }
        }
    }

    /**
     Find purchase order by ID
     - GET /store/order/{order_id}
     - For valid response try integer IDs with value <= 5 or > 10. Other values will generate exceptions
     - parameter orderId: (path) ID of pet that needs to be fetched 
     - returns: RequestBuilder<Order> 
     */
    open class func getOrderByIdWithRequestBuilder(orderId: Int64) -> RequestBuilder<Order> {
        var localVariablePath = "/store/order/{order_id}"
        let orderIdPreEscape = "\(APIHelper.mapValueToPathItem(orderId))"
        let orderIdPostEscape = orderIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        localVariablePath = localVariablePath.replacingOccurrences(of: "{order_id}", with: orderIdPostEscape, options: .literal, range: nil)
        let localVariableURLString = PetstoreClientAPI.shared.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Order>.Type = PetstoreClientAPI.shared.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: false)
    }

    /**
     Place an order for a pet
     
     - parameter body: (body) order placed for purchasing the pet 
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - returns: Observable<Order>
     */
    open class func placeOrder(body: Order, apiResponseQueue: DispatchQueue = PetstoreClientAPI.shared.apiResponseQueue) -> Observable<Order> {
        return Observable.create { observer -> Disposable in
            let requestTask = self.placeOrderWithRequestBuilder(body: body).execute(apiResponseQueue) { result in
                switch result {
                case let .success(response):
                    observer.onNext(response.body)
                case let .failure(error):
                    observer.onError(error)
                }
                observer.onCompleted()
            }
            
            return Disposables.create {
                requestTask.cancel()
            }
        }
    }

    /**
     Place an order for a pet
     - POST /store/order
     - parameter body: (body) order placed for purchasing the pet 
     - returns: RequestBuilder<Order> 
     */
    open class func placeOrderWithRequestBuilder(body: Order) -> RequestBuilder<Order> {
        let localVariablePath = "/store/order"
        let localVariableURLString = PetstoreClientAPI.shared.basePath + localVariablePath
        let localVariableParameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<Order>.Type = PetstoreClientAPI.shared.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "POST", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: false)
    }
}