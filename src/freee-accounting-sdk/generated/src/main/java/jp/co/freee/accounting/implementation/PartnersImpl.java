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
import jp.co.freee.accounting.Partners;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import jp.co.freee.accounting.models.PartnerCodeParams;
import jp.co.freee.accounting.models.PartnerCreateParams;
import jp.co.freee.accounting.models.PartnersIndexResponse;
import jp.co.freee.accounting.models.PartnersResponse;
import jp.co.freee.accounting.models.PartnerUpdateParams;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Partners.
 */
public class PartnersImpl implements Partners {
    /** The Retrofit service to perform REST calls. */
    private PartnersService service;
    /** The service client containing this operation class. */
    private AccountingClientImpl client;

    /**
     * Initializes an instance of Partners.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PartnersImpl(Retrofit retrofit, AccountingClientImpl client) {
        this.service = retrofit.create(PartnersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Partners to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PartnersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Partners list" })
        @GET("partners")
        Observable<Response<ResponseBody>> list(@Query("company_id") int companyId, @Query("offset") Integer offset, @Query("limit") Integer limit, @Query("keyword") String keyword);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Partners create" })
        @POST("partners")
        Observable<Response<ResponseBody>> create(@Body PartnerCreateParams parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Partners update" })
        @PUT("partners/{id}")
        Observable<Response<ResponseBody>> update(@Path("id") int id, @Body PartnerUpdateParams parameters);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: jp.co.freee.accounting.Partners updateByCode" })
        @PUT("partners/code/{code}")
        Observable<Response<ResponseBody>> updateByCode(@Path("code") String code, @Body PartnerCodeParams parameters);

    }

    /**
     * 取引先一覧の取得.
     * 指定した事業所の取引先一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnersIndexResponse object if successful.
     */
    public PartnersIndexResponse list(int companyId) {
        return listWithServiceResponseAsync(companyId).toBlocking().single().body();
    }

    /**
     * 取引先一覧の取得.
     * 指定した事業所の取引先一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PartnersIndexResponse> listAsync(int companyId, final ServiceCallback<PartnersIndexResponse> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(companyId), serviceCallback);
    }

    /**
     * 取引先一覧の取得.
     * 指定した事業所の取引先一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnersIndexResponse object
     */
    public Observable<PartnersIndexResponse> listAsync(int companyId) {
        return listWithServiceResponseAsync(companyId).map(new Func1<ServiceResponse<PartnersIndexResponse>, PartnersIndexResponse>() {
            @Override
            public PartnersIndexResponse call(ServiceResponse<PartnersIndexResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引先一覧の取得.
     * 指定した事業所の取引先一覧を取得する.
     *
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnersIndexResponse object
     */
    public Observable<ServiceResponse<PartnersIndexResponse>> listWithServiceResponseAsync(int companyId) {
        final Integer offset = null;
        final Integer limit = null;
        final String keyword = null;
        return service.list(companyId, offset, limit, keyword)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PartnersIndexResponse>>>() {
                @Override
                public Observable<ServiceResponse<PartnersIndexResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PartnersIndexResponse> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * 取引先一覧の取得.
     * 指定した事業所の取引先一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 50, 最大: 3000)
     * @param keyword 検索キーワード：取引先名・正式名称・カナ名称に対するあいまい検索で一致、またはショートカットキー1・2のいずれかに完全一致
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnersIndexResponse object if successful.
     */
    public PartnersIndexResponse list(int companyId, Integer offset, Integer limit, String keyword) {
        return listWithServiceResponseAsync(companyId, offset, limit, keyword).toBlocking().single().body();
    }

    /**
     * 取引先一覧の取得.
     * 指定した事業所の取引先一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 50, 最大: 3000)
     * @param keyword 検索キーワード：取引先名・正式名称・カナ名称に対するあいまい検索で一致、またはショートカットキー1・2のいずれかに完全一致
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PartnersIndexResponse> listAsync(int companyId, Integer offset, Integer limit, String keyword, final ServiceCallback<PartnersIndexResponse> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(companyId, offset, limit, keyword), serviceCallback);
    }

    /**
     * 取引先一覧の取得.
     * 指定した事業所の取引先一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 50, 最大: 3000)
     * @param keyword 検索キーワード：取引先名・正式名称・カナ名称に対するあいまい検索で一致、またはショートカットキー1・2のいずれかに完全一致
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnersIndexResponse object
     */
    public Observable<PartnersIndexResponse> listAsync(int companyId, Integer offset, Integer limit, String keyword) {
        return listWithServiceResponseAsync(companyId, offset, limit, keyword).map(new Func1<ServiceResponse<PartnersIndexResponse>, PartnersIndexResponse>() {
            @Override
            public PartnersIndexResponse call(ServiceResponse<PartnersIndexResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引先一覧の取得.
     * 指定した事業所の取引先一覧を取得する.
     *
     * @param companyId 事業所ID
     * @param offset 取得レコードのオフセット (デフォルト: 0)
     * @param limit 取得レコードの件数 (デフォルト: 50, 最大: 3000)
     * @param keyword 検索キーワード：取引先名・正式名称・カナ名称に対するあいまい検索で一致、またはショートカットキー1・2のいずれかに完全一致
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnersIndexResponse object
     */
    public Observable<ServiceResponse<PartnersIndexResponse>> listWithServiceResponseAsync(int companyId, Integer offset, Integer limit, String keyword) {
        return service.list(companyId, offset, limit, keyword)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PartnersIndexResponse>>>() {
                @Override
                public Observable<ServiceResponse<PartnersIndexResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PartnersIndexResponse> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PartnersIndexResponse> listDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<PartnersIndexResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PartnersIndexResponse>() { }.getType())
                .build(response);
    }

    /**
     * 取引先の作成.
     * 指定した事業所の取引先を作成する.
     *
     * @param parameters 取引先の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnersResponse object if successful.
     */
    public PartnersResponse create(PartnerCreateParams parameters) {
        return createWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * 取引先の作成.
     * 指定した事業所の取引先を作成する.
     *
     * @param parameters 取引先の作成
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PartnersResponse> createAsync(PartnerCreateParams parameters, final ServiceCallback<PartnersResponse> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * 取引先の作成.
     * 指定した事業所の取引先を作成する.
     *
     * @param parameters 取引先の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnersResponse object
     */
    public Observable<PartnersResponse> createAsync(PartnerCreateParams parameters) {
        return createWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<PartnersResponse>, PartnersResponse>() {
            @Override
            public PartnersResponse call(ServiceResponse<PartnersResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引先の作成.
     * 指定した事業所の取引先を作成する.
     *
     * @param parameters 取引先の作成
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnersResponse object
     */
    public Observable<ServiceResponse<PartnersResponse>> createWithServiceResponseAsync(PartnerCreateParams parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.create(parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PartnersResponse>>>() {
                @Override
                public Observable<ServiceResponse<PartnersResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PartnersResponse> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PartnersResponse> createDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PartnersResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<PartnersResponse>() { }.getType())
                .build(response);
    }

    /**
     * 取引先の更新.
     * 指定した取引先の情報を更新する.
     *
     * @param id 取引先ID
     * @param parameters 取引先の更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnersResponse object if successful.
     */
    public PartnersResponse update(int id, PartnerUpdateParams parameters) {
        return updateWithServiceResponseAsync(id, parameters).toBlocking().single().body();
    }

    /**
     * 取引先の更新.
     * 指定した取引先の情報を更新する.
     *
     * @param id 取引先ID
     * @param parameters 取引先の更新
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PartnersResponse> updateAsync(int id, PartnerUpdateParams parameters, final ServiceCallback<PartnersResponse> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(id, parameters), serviceCallback);
    }

    /**
     * 取引先の更新.
     * 指定した取引先の情報を更新する.
     *
     * @param id 取引先ID
     * @param parameters 取引先の更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnersResponse object
     */
    public Observable<PartnersResponse> updateAsync(int id, PartnerUpdateParams parameters) {
        return updateWithServiceResponseAsync(id, parameters).map(new Func1<ServiceResponse<PartnersResponse>, PartnersResponse>() {
            @Override
            public PartnersResponse call(ServiceResponse<PartnersResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引先の更新.
     * 指定した取引先の情報を更新する.
     *
     * @param id 取引先ID
     * @param parameters 取引先の更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnersResponse object
     */
    public Observable<ServiceResponse<PartnersResponse>> updateWithServiceResponseAsync(int id, PartnerUpdateParams parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.update(id, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PartnersResponse>>>() {
                @Override
                public Observable<ServiceResponse<PartnersResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PartnersResponse> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PartnersResponse> updateDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PartnersResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PartnersResponse>() { }.getType())
                .build(response);
    }

    /**
     * 取引先の更新.
     * 取引先コードをキーに、指定した取引先の情報を更新する.
     *
     * @param code 取引先コード
     * @param parameters 取引先の更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnersResponse object if successful.
     */
    public PartnersResponse updateByCode(String code, PartnerCodeParams parameters) {
        return updateByCodeWithServiceResponseAsync(code, parameters).toBlocking().single().body();
    }

    /**
     * 取引先の更新.
     * 取引先コードをキーに、指定した取引先の情報を更新する.
     *
     * @param code 取引先コード
     * @param parameters 取引先の更新
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PartnersResponse> updateByCodeAsync(String code, PartnerCodeParams parameters, final ServiceCallback<PartnersResponse> serviceCallback) {
        return ServiceFuture.fromResponse(updateByCodeWithServiceResponseAsync(code, parameters), serviceCallback);
    }

    /**
     * 取引先の更新.
     * 取引先コードをキーに、指定した取引先の情報を更新する.
     *
     * @param code 取引先コード
     * @param parameters 取引先の更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnersResponse object
     */
    public Observable<PartnersResponse> updateByCodeAsync(String code, PartnerCodeParams parameters) {
        return updateByCodeWithServiceResponseAsync(code, parameters).map(new Func1<ServiceResponse<PartnersResponse>, PartnersResponse>() {
            @Override
            public PartnersResponse call(ServiceResponse<PartnersResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * 取引先の更新.
     * 取引先コードをキーに、指定した取引先の情報を更新する.
     *
     * @param code 取引先コード
     * @param parameters 取引先の更新
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnersResponse object
     */
    public Observable<ServiceResponse<PartnersResponse>> updateByCodeWithServiceResponseAsync(String code, PartnerCodeParams parameters) {
        if (code == null) {
            throw new IllegalArgumentException("Parameter code is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.updateByCode(code, parameters)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PartnersResponse>>>() {
                @Override
                public Observable<ServiceResponse<PartnersResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PartnersResponse> clientResponse = updateByCodeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PartnersResponse> updateByCodeDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PartnersResponse, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PartnersResponse>() { }.getType())
                .build(response);
    }

}
