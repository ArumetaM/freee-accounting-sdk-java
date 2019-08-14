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
import jp.co.freee.accounting.Transfers;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import jp.co.freee.accounting.models.Parameter;
import jp.co.freee.accounting.models.TransfersCreateResponse;
import jp.co.freee.accounting.models.TransfersIndexResponse;
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
 * in Transfers.
 */
public class TransfersImpl implements Transfers {
    /** The Retrofit service to perform REST calls. */
    private TransfersService service;
    /** The service client containing this operation class. */
    private AccountingClientImpl client;

    /**
     * Initializes an instance of Transfers.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TransfersImpl(Retrofit retrofit, AccountingClientImpl client) {
        this.service = retrofit.create(TransfersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Transfers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TransfersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Transfers list" })
        @GET("transfers")
        Observable<Response<ResponseBody>> list(@Query("company_id") int companyId, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("offset") Integer offset, @Query("limit") Integer limit);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Transfers create" })
        @POST("transfers")
        Observable<Response<ResponseBody>> create(@Body Parameter parameter);

    }

    /**
     * 取引（振替）一覧の取得.
     * 指定した事業所の取引（振替）一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransfersIndexResponse object if successful.
     */
    public TransfersIndexResponse list(int companyId) {
        return listWithServiceResponseAsync(companyId).toBlocking().single().body();
    }

    /**
     * 取引（振替）一覧の取得.
     * 指定した事業所の取引（振替）一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransfersIndexResponse> listAsync(int companyId, final ServiceCallback<TransfersIndexResponse> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(companyId), serviceCallback);
    }

    /**
     * 取引（振替）一覧の取得.
     * 指定した事業所の取引（振替）一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransfersIndexResponse object
     */
    public Observable<TransfersIndexResponse> listAsync(int companyId) {
        return listWithServiceResponseAsync(companyId).map(new Func1<ServiceResponse<TransfersIndexResponse>, TransfersIndexResponse>() {
            @Override
            public TransfersIndexResponse call(ServiceResponse<TransfersIndexResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引（振替）一覧の取得.
     * 指定した事業所の取引（振替）一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransfersIndexResponse object
     */
    public Observable<ServiceResponse<TransfersIndexResponse>> listWithServiceResponseAsync(int companyId) {
        final String startDate = null;
        final String endDate = null;
        final Integer offset = null;
        final Integer limit = null;
        return service.list(companyId, startDate, endDate, offset, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TransfersIndexResponse>>>() {
                @Override
                public Observable<ServiceResponse<TransfersIndexResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TransfersIndexResponse> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 取引（振替）一覧の取得.
     * 指定した事業所の取引（振替）一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param startDate 振替日で絞込：開始日 (yyyy-mm-dd)
     * @param endDate 振替日で絞込：終了日 (yyyy-mm-dd)
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransfersIndexResponse object if successful.
     */
    public TransfersIndexResponse list(int companyId, String startDate, String endDate, Integer offset, Integer limit) {
        return listWithServiceResponseAsync(companyId, startDate, endDate, offset, limit).toBlocking().single().body();
    }

    /**
     * 取引（振替）一覧の取得.
     * 指定した事業所の取引（振替）一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param startDate 振替日で絞込：開始日 (yyyy-mm-dd)
     * @param endDate 振替日で絞込：終了日 (yyyy-mm-dd)
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransfersIndexResponse> listAsync(int companyId, String startDate, String endDate, Integer offset, Integer limit, final ServiceCallback<TransfersIndexResponse> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(companyId, startDate, endDate, offset, limit), serviceCallback);
    }

    /**
     * 取引（振替）一覧の取得.
     * 指定した事業所の取引（振替）一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param startDate 振替日で絞込：開始日 (yyyy-mm-dd)
     * @param endDate 振替日で絞込：終了日 (yyyy-mm-dd)
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransfersIndexResponse object
     */
    public Observable<TransfersIndexResponse> listAsync(int companyId, String startDate, String endDate, Integer offset, Integer limit) {
        return listWithServiceResponseAsync(companyId, startDate, endDate, offset, limit).map(new Func1<ServiceResponse<TransfersIndexResponse>, TransfersIndexResponse>() {
            @Override
            public TransfersIndexResponse call(ServiceResponse<TransfersIndexResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引（振替）一覧の取得.
     * 指定した事業所の取引（振替）一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param startDate 振替日で絞込：開始日 (yyyy-mm-dd)
     * @param endDate 振替日で絞込：終了日 (yyyy-mm-dd)
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 20, 最大: 100)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransfersIndexResponse object
     */
    public Observable<ServiceResponse<TransfersIndexResponse>> listWithServiceResponseAsync(int companyId, String startDate, String endDate, Integer offset, Integer limit) {
        return service.list(companyId, startDate, endDate, offset, limit)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TransfersIndexResponse>>>() {
                @Override
                public Observable<ServiceResponse<TransfersIndexResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TransfersIndexResponse> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TransfersIndexResponse> listDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<TransfersIndexResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TransfersIndexResponse>() { }.getType())
                .build(response);
    }

    /**
     * 取引（振替）の作成.
     * 指定した事業所の取引（振替）を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransfersCreateResponse object if successful.
     */
    public TransfersCreateResponse create() {
        return createWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * 取引（振替）の作成.
     * 指定した事業所の取引（振替）を作成する.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransfersCreateResponse> createAsync(final ServiceCallback<TransfersCreateResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * 取引（振替）の作成.
     * 指定した事業所の取引（振替）を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransfersCreateResponse object
     */
    public Observable<TransfersCreateResponse> createAsync() {
        return createWithServiceResponseAsync().map(new Func1<ServiceResponse<TransfersCreateResponse>, TransfersCreateResponse>() {
            @Override
            public TransfersCreateResponse call(ServiceResponse<TransfersCreateResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引（振替）の作成.
     * 指定した事業所の取引（振替）を作成する.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransfersCreateResponse object
     */
    public Observable<ServiceResponse<TransfersCreateResponse>> createWithServiceResponseAsync() {
        final Parameter parameter = null;
        return service.create(parameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TransfersCreateResponse>>>() {
                @Override
                public Observable<ServiceResponse<TransfersCreateResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TransfersCreateResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 取引（振替）の作成.
     * 指定した事業所の取引（振替）を作成する.
     *
     * @param parameter 取引（振替）の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransfersCreateResponse object if successful.
     */
    public TransfersCreateResponse create(Parameter parameter) {
        return createWithServiceResponseAsync(parameter).toBlocking().single().body();
    }

    /**
     * 取引（振替）の作成.
     * 指定した事業所の取引（振替）を作成する.
     *
     * @param parameter 取引（振替）の作成
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransfersCreateResponse> createAsync(Parameter parameter, final ServiceCallback<TransfersCreateResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameter), serviceCallback);
    }

    /**
     * 取引（振替）の作成.
     * 指定した事業所の取引（振替）を作成する.
     *
     * @param parameter 取引（振替）の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransfersCreateResponse object
     */
    public Observable<TransfersCreateResponse> createAsync(Parameter parameter) {
        return createWithServiceResponseAsync(parameter).map(new Func1<ServiceResponse<TransfersCreateResponse>, TransfersCreateResponse>() {
            @Override
            public TransfersCreateResponse call(ServiceResponse<TransfersCreateResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引（振替）の作成.
     * 指定した事業所の取引（振替）を作成する.
     *
     * @param parameter 取引（振替）の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransfersCreateResponse object
     */
    public Observable<ServiceResponse<TransfersCreateResponse>> createWithServiceResponseAsync(Parameter parameter) {
        Validator.validate(parameter);
        return service.create(parameter)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TransfersCreateResponse>>>() {
                @Override
                public Observable<ServiceResponse<TransfersCreateResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TransfersCreateResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TransfersCreateResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<TransfersCreateResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<TransfersCreateResponse>() { }.getType())
                .build(response);
    }

}
