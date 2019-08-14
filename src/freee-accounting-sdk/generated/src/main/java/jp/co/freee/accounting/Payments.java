/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting;

import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import jp.co.freee.accounting.models.DealPaymentParams;
import jp.co.freee.accounting.models.DealsResponse;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Payments.
 */
public interface Payments {
    /**
     * 取引（収入／支出）の支払行作成.
     * 指定した事業所の取引（収入／支出）の支払行を作成する.
     *
     * @param id 取引ID
     * @param parameters 取引（収入／支出）の支払行作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DealsResponse object if successful.
     */
    DealsResponse createDeal(int id, DealPaymentParams parameters);

    /**
     * 取引（収入／支出）の支払行作成.
     * 指定した事業所の取引（収入／支出）の支払行を作成する.
     *
     * @param id 取引ID
     * @param parameters 取引（収入／支出）の支払行作成
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DealsResponse> createDealAsync(int id, DealPaymentParams parameters, final ServiceCallback<DealsResponse> serviceCallback);

    /**
     * 取引（収入／支出）の支払行作成.
     * 指定した事業所の取引（収入／支出）の支払行を作成する.
     *
     * @param id 取引ID
     * @param parameters 取引（収入／支出）の支払行作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DealsResponse object
     */
    Observable<DealsResponse> createDealAsync(int id, DealPaymentParams parameters);

    /**
     * 取引（収入／支出）の支払行作成.
     * 指定した事業所の取引（収入／支出）の支払行を作成する.
     *
     * @param id 取引ID
     * @param parameters 取引（収入／支出）の支払行作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DealsResponse object
     */
    Observable<ServiceResponse<DealsResponse>> createDealWithServiceResponseAsync(int id, DealPaymentParams parameters);

    /**
     * 取引（収入／支出）の支払行更新.
     * 指定した事業所の取引（収入／支出）の支払行を更新する.
     *
     * @param id 取引ID
     * @param paymentId 決済ID
     * @param parameters 取引（収入／支出）の支払行更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DealsResponse object if successful.
     */
    DealsResponse updateDeal(int id, int paymentId, DealPaymentParams parameters);

    /**
     * 取引（収入／支出）の支払行更新.
     * 指定した事業所の取引（収入／支出）の支払行を更新する.
     *
     * @param id 取引ID
     * @param paymentId 決済ID
     * @param parameters 取引（収入／支出）の支払行更新
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DealsResponse> updateDealAsync(int id, int paymentId, DealPaymentParams parameters, final ServiceCallback<DealsResponse> serviceCallback);

    /**
     * 取引（収入／支出）の支払行更新.
     * 指定した事業所の取引（収入／支出）の支払行を更新する.
     *
     * @param id 取引ID
     * @param paymentId 決済ID
     * @param parameters 取引（収入／支出）の支払行更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DealsResponse object
     */
    Observable<DealsResponse> updateDealAsync(int id, int paymentId, DealPaymentParams parameters);

    /**
     * 取引（収入／支出）の支払行更新.
     * 指定した事業所の取引（収入／支出）の支払行を更新する.
     *
     * @param id 取引ID
     * @param paymentId 決済ID
     * @param parameters 取引（収入／支出）の支払行更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DealsResponse object
     */
    Observable<ServiceResponse<DealsResponse>> updateDealWithServiceResponseAsync(int id, int paymentId, DealPaymentParams parameters);

    /**
     * 取引（収入／支出）の支払行削除.
     * 指定した事業所の取引（収入／支出）の支払行を削除する.
     *
     * @param id 取引ID
     * @param paymentId 決済ID
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void destroyDeal(int id, int paymentId, int companyId);

    /**
     * 取引（収入／支出）の支払行削除.
     * 指定した事業所の取引（収入／支出）の支払行を削除する.
     *
     * @param id 取引ID
     * @param paymentId 決済ID
     * @param companyId 事業所ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> destroyDealAsync(int id, int paymentId, int companyId, final ServiceCallback<Void> serviceCallback);

    /**
     * 取引（収入／支出）の支払行削除.
     * 指定した事業所の取引（収入／支出）の支払行を削除する.
     *
     * @param id 取引ID
     * @param paymentId 決済ID
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> destroyDealAsync(int id, int paymentId, int companyId);

    /**
     * 取引（収入／支出）の支払行削除.
     * 指定した事業所の取引（収入／支出）の支払行を削除する.
     *
     * @param id 取引ID
     * @param paymentId 決済ID
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> destroyDealWithServiceResponseAsync(int id, int paymentId, int companyId);

}
