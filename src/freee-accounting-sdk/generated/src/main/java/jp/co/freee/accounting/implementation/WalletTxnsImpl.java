/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting.implementation;

import retrofit2.Retrofit;
import jp.co.freee.accounting.WalletTxns;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import jp.co.freee.accounting.models.CreateWalletTxnParams;
import jp.co.freee.accounting.models.WalletTxnsCreateResponse;
import jp.co.freee.accounting.models.WalletTxnsIndexResponse;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in WalletTxns.
 */
public class WalletTxnsImpl implements WalletTxns {
    /** The Retrofit service to perform REST calls. */
    private WalletTxnsService service;
    /** The service client containing this operation class. */
    private AccountingClientImpl client;

    /**
     * Initializes an instance of WalletTxns.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WalletTxnsImpl(Retrofit retrofit, AccountingClientImpl client) {
        this.service = retrofit.create(WalletTxnsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for WalletTxns to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WalletTxnsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.WalletTxns list" })
        @GET("wallet_txns")
        Observable<Response<ResponseBody>> list(@Query("company_id") int companyId, @Query("walletable_type") String walletableType, @Query("walletable_id") Integer walletableId, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("entry_side") String entrySide, @Query("offset") Integer offset, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.WalletTxns create" })
        @POST("wallet_txns")
        Observable<Response<ResponseBody>> create(@Body CreateWalletTxnParams parameters);

    }

    /**
     * 明細一覧の取得.
     * 指定した事業所の明細一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WalletTxnsIndexResponse object if successful.
     */
    public WalletTxnsIndexResponse list(int companyId) {
        return listWithServiceResponseAsync(companyId).toBlocking().single().body();
    }

    /**
     * 明細一覧の取得.
     * 指定した事業所の明細一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WalletTxnsIndexResponse> listAsync(int companyId, final ServiceCallback<WalletTxnsIndexResponse> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(companyId), serviceCallback);
    }

    /**
     * 明細一覧の取得.
     * 指定した事業所の明細一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletTxnsIndexResponse object
     */
    public Observable<WalletTxnsIndexResponse> listAsync(int companyId) {
        return listWithServiceResponseAsync(companyId).map(new Func1<ServiceResponse<WalletTxnsIndexResponse>, WalletTxnsIndexResponse>() {
            @Override
            public WalletTxnsIndexResponse call(ServiceResponse<WalletTxnsIndexResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 明細一覧の取得.
     * 指定した事業所の明細一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletTxnsIndexResponse object
     */
    public Observable<ServiceResponse<WalletTxnsIndexResponse>> listWithServiceResponseAsync(int companyId) {
        final String walletableType = null;
        final Integer walletableId = null;
        final String startDate = null;
        final String endDate = null;
        final String entrySide = null;
        final Integer offset = null;
        final Integer limit = null;
        return service.list(companyId, walletableType, walletableId, startDate, endDate, entrySide, offset, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WalletTxnsIndexResponse>>>() {
                @Override
                public Observable<ServiceResponse<WalletTxnsIndexResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WalletTxnsIndexResponse> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 明細一覧の取得.
     * 指定した事業所の明細一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param walletableType 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet). Possible values include: 'bank_account', 'credit_card', 'wallet'
     * @param walletableId 口座ID
     * @param startDate 取引日で絞込：開始日 (yyyy-mm-dd)
     * @param endDate 取引日で絞込：終了日 (yyyy-mm-dd)
     * @param entrySide 入金／出金 (入金: income, 出金: expense). Possible values include: 'income', 'expense'
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WalletTxnsIndexResponse object if successful.
     */
    public WalletTxnsIndexResponse list(int companyId, String walletableType, Integer walletableId, String startDate, String endDate, String entrySide, Integer offset, Integer limit) {
        return listWithServiceResponseAsync(companyId, walletableType, walletableId, startDate, endDate, entrySide, offset, limit).toBlocking().single().body();
    }

    /**
     * 明細一覧の取得.
     * 指定した事業所の明細一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param walletableType 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet). Possible values include: 'bank_account', 'credit_card', 'wallet'
     * @param walletableId 口座ID
     * @param startDate 取引日で絞込：開始日 (yyyy-mm-dd)
     * @param endDate 取引日で絞込：終了日 (yyyy-mm-dd)
     * @param entrySide 入金／出金 (入金: income, 出金: expense). Possible values include: 'income', 'expense'
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WalletTxnsIndexResponse> listAsync(int companyId, String walletableType, Integer walletableId, String startDate, String endDate, String entrySide, Integer offset, Integer limit, final ServiceCallback<WalletTxnsIndexResponse> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(companyId, walletableType, walletableId, startDate, endDate, entrySide, offset, limit), serviceCallback);
    }

    /**
     * 明細一覧の取得.
     * 指定した事業所の明細一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param walletableType 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet). Possible values include: 'bank_account', 'credit_card', 'wallet'
     * @param walletableId 口座ID
     * @param startDate 取引日で絞込：開始日 (yyyy-mm-dd)
     * @param endDate 取引日で絞込：終了日 (yyyy-mm-dd)
     * @param entrySide 入金／出金 (入金: income, 出金: expense). Possible values include: 'income', 'expense'
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletTxnsIndexResponse object
     */
    public Observable<WalletTxnsIndexResponse> listAsync(int companyId, String walletableType, Integer walletableId, String startDate, String endDate, String entrySide, Integer offset, Integer limit) {
        return listWithServiceResponseAsync(companyId, walletableType, walletableId, startDate, endDate, entrySide, offset, limit).map(new Func1<ServiceResponse<WalletTxnsIndexResponse>, WalletTxnsIndexResponse>() {
            @Override
            public WalletTxnsIndexResponse call(ServiceResponse<WalletTxnsIndexResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 明細一覧の取得.
     * 指定した事業所の明細一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param walletableType 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet). Possible values include: 'bank_account', 'credit_card', 'wallet'
     * @param walletableId 口座ID
     * @param startDate 取引日で絞込：開始日 (yyyy-mm-dd)
     * @param endDate 取引日で絞込：終了日 (yyyy-mm-dd)
     * @param entrySide 入金／出金 (入金: income, 出金: expense). Possible values include: 'income', 'expense'
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletTxnsIndexResponse object
     */
    public Observable<ServiceResponse<WalletTxnsIndexResponse>> listWithServiceResponseAsync(int companyId, String walletableType, Integer walletableId, String startDate, String endDate, String entrySide, Integer offset, Integer limit) {
        return service.list(companyId, walletableType, walletableId, startDate, endDate, entrySide, offset, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WalletTxnsIndexResponse>>>() {
                @Override
                public Observable<ServiceResponse<WalletTxnsIndexResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WalletTxnsIndexResponse> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WalletTxnsIndexResponse> listDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<WalletTxnsIndexResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WalletTxnsIndexResponse>() { }.getType())
                .build(response);
    }

    /**
     * 明細の作成.
     * 指定した事業所の明細を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WalletTxnsCreateResponse object if successful.
     */
    public WalletTxnsCreateResponse create() {
        return createWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 明細の作成.
     * 指定した事業所の明細を作成する.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WalletTxnsCreateResponse> createAsync(final ServiceCallback<WalletTxnsCreateResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 明細の作成.
     * 指定した事業所の明細を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletTxnsCreateResponse object
     */
    public Observable<WalletTxnsCreateResponse> createAsync() {
        return createWithServiceResponseAsync().map(new Func1<ServiceResponse<WalletTxnsCreateResponse>, WalletTxnsCreateResponse>() {
            @Override
            public WalletTxnsCreateResponse call(ServiceResponse<WalletTxnsCreateResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 明細の作成.
     * 指定した事業所の明細を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletTxnsCreateResponse object
     */
    public Observable<ServiceResponse<WalletTxnsCreateResponse>> createWithServiceResponseAsync() {
        final CreateWalletTxnParams parameters = null;
        return service.create(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WalletTxnsCreateResponse>>>() {
                @Override
                public Observable<ServiceResponse<WalletTxnsCreateResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WalletTxnsCreateResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 明細の作成.
     * 指定した事業所の明細を作成する.
     *
     * @param parameters 明細の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WalletTxnsCreateResponse object if successful.
     */
    public WalletTxnsCreateResponse create(CreateWalletTxnParams parameters) {
        return createWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * 明細の作成.
     * 指定した事業所の明細を作成する.
     *
     * @param parameters 明細の作成
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WalletTxnsCreateResponse> createAsync(CreateWalletTxnParams parameters, final ServiceCallback<WalletTxnsCreateResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * 明細の作成.
     * 指定した事業所の明細を作成する.
     *
     * @param parameters 明細の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletTxnsCreateResponse object
     */
    public Observable<WalletTxnsCreateResponse> createAsync(CreateWalletTxnParams parameters) {
        return createWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<WalletTxnsCreateResponse>, WalletTxnsCreateResponse>() {
            @Override
            public WalletTxnsCreateResponse call(ServiceResponse<WalletTxnsCreateResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 明細の作成.
     * 指定した事業所の明細を作成する.
     *
     * @param parameters 明細の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WalletTxnsCreateResponse object
     */
    public Observable<ServiceResponse<WalletTxnsCreateResponse>> createWithServiceResponseAsync(CreateWalletTxnParams parameters) {
        Validator.validate(parameters);
        return service.create(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WalletTxnsCreateResponse>>>() {
                @Override
                public Observable<ServiceResponse<WalletTxnsCreateResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WalletTxnsCreateResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WalletTxnsCreateResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<WalletTxnsCreateResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<WalletTxnsCreateResponse>() { }.getType())
                .build(response);
    }

}
