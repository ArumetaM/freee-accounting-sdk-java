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
import java.util.List;
import jp.co.freee.accounting.models.JournalsEnqueueJournalsResponse;
import jp.co.freee.accounting.models.JournalsStatusResponse;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Journals.
 */
public interface Journals {
    /**
     * ダウンロード要求.
     * ユーザが所属する事業所の仕訳帳のダウンロードをリクエストします 生成されるファイルに関しては、&lt;a href="https://support.freee.co.jp/hc/ja/articles/204599604#2"&gt;ヘルプページ&lt;/a&gt;をご参照ください.
     *
     * @param downloadType ダウンロード形式. Possible values include: 'csv', 'pdf', 'yayoi', 'generic'
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JournalsEnqueueJournalsResponse object if successful.
     */
    JournalsEnqueueJournalsResponse get(String downloadType, int companyId);

    /**
     * ダウンロード要求.
     * ユーザが所属する事業所の仕訳帳のダウンロードをリクエストします 生成されるファイルに関しては、&lt;a href="https://support.freee.co.jp/hc/ja/articles/204599604#2"&gt;ヘルプページ&lt;/a&gt;をご参照ください.
     *
     * @param downloadType ダウンロード形式. Possible values include: 'csv', 'pdf', 'yayoi', 'generic'
     * @param companyId 事業所ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JournalsEnqueueJournalsResponse> getAsync(String downloadType, int companyId, final ServiceCallback<JournalsEnqueueJournalsResponse> serviceCallback);

    /**
     * ダウンロード要求.
     * ユーザが所属する事業所の仕訳帳のダウンロードをリクエストします 生成されるファイルに関しては、&lt;a href="https://support.freee.co.jp/hc/ja/articles/204599604#2"&gt;ヘルプページ&lt;/a&gt;をご参照ください.
     *
     * @param downloadType ダウンロード形式. Possible values include: 'csv', 'pdf', 'yayoi', 'generic'
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JournalsEnqueueJournalsResponse object
     */
    Observable<JournalsEnqueueJournalsResponse> getAsync(String downloadType, int companyId);

    /**
     * ダウンロード要求.
     * ユーザが所属する事業所の仕訳帳のダウンロードをリクエストします 生成されるファイルに関しては、&lt;a href="https://support.freee.co.jp/hc/ja/articles/204599604#2"&gt;ヘルプページ&lt;/a&gt;をご参照ください.
     *
     * @param downloadType ダウンロード形式. Possible values include: 'csv', 'pdf', 'yayoi', 'generic'
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JournalsEnqueueJournalsResponse object
     */
    Observable<ServiceResponse<JournalsEnqueueJournalsResponse>> getWithServiceResponseAsync(String downloadType, int companyId);
    /**
     * ダウンロード要求.
     * ユーザが所属する事業所の仕訳帳のダウンロードをリクエストします 生成されるファイルに関しては、&lt;a href="https://support.freee.co.jp/hc/ja/articles/204599604#2"&gt;ヘルプページ&lt;/a&gt;をご参照ください.
     *
     * @param downloadType ダウンロード形式. Possible values include: 'csv', 'pdf', 'yayoi', 'generic'
     * @param companyId 事業所ID
     * @param visibleTags 補助科目やコメントとして出力する項目
     * @param startDate 取得開始日 (yyyy-mm-dd)
     * @param endDate 取得終了日 (yyyy-mm-dd)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JournalsEnqueueJournalsResponse object if successful.
     */
    JournalsEnqueueJournalsResponse get(String downloadType, int companyId, List<String> visibleTags, String startDate, String endDate);

    /**
     * ダウンロード要求.
     * ユーザが所属する事業所の仕訳帳のダウンロードをリクエストします 生成されるファイルに関しては、&lt;a href="https://support.freee.co.jp/hc/ja/articles/204599604#2"&gt;ヘルプページ&lt;/a&gt;をご参照ください.
     *
     * @param downloadType ダウンロード形式. Possible values include: 'csv', 'pdf', 'yayoi', 'generic'
     * @param companyId 事業所ID
     * @param visibleTags 補助科目やコメントとして出力する項目
     * @param startDate 取得開始日 (yyyy-mm-dd)
     * @param endDate 取得終了日 (yyyy-mm-dd)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JournalsEnqueueJournalsResponse> getAsync(String downloadType, int companyId, List<String> visibleTags, String startDate, String endDate, final ServiceCallback<JournalsEnqueueJournalsResponse> serviceCallback);

    /**
     * ダウンロード要求.
     * ユーザが所属する事業所の仕訳帳のダウンロードをリクエストします 生成されるファイルに関しては、&lt;a href="https://support.freee.co.jp/hc/ja/articles/204599604#2"&gt;ヘルプページ&lt;/a&gt;をご参照ください.
     *
     * @param downloadType ダウンロード形式. Possible values include: 'csv', 'pdf', 'yayoi', 'generic'
     * @param companyId 事業所ID
     * @param visibleTags 補助科目やコメントとして出力する項目
     * @param startDate 取得開始日 (yyyy-mm-dd)
     * @param endDate 取得終了日 (yyyy-mm-dd)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JournalsEnqueueJournalsResponse object
     */
    Observable<JournalsEnqueueJournalsResponse> getAsync(String downloadType, int companyId, List<String> visibleTags, String startDate, String endDate);

    /**
     * ダウンロード要求.
     * ユーザが所属する事業所の仕訳帳のダウンロードをリクエストします 生成されるファイルに関しては、&lt;a href="https://support.freee.co.jp/hc/ja/articles/204599604#2"&gt;ヘルプページ&lt;/a&gt;をご参照ください.
     *
     * @param downloadType ダウンロード形式. Possible values include: 'csv', 'pdf', 'yayoi', 'generic'
     * @param companyId 事業所ID
     * @param visibleTags 補助科目やコメントとして出力する項目
     * @param startDate 取得開始日 (yyyy-mm-dd)
     * @param endDate 取得終了日 (yyyy-mm-dd)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JournalsEnqueueJournalsResponse object
     */
    Observable<ServiceResponse<JournalsEnqueueJournalsResponse>> getWithServiceResponseAsync(String downloadType, int companyId, List<String> visibleTags, String startDate, String endDate);

    /**
     * ステータス確認.
     * ダウンロードリクエストのステータスを確認する.
     *
     * @param companyId 事業所ID
     * @param id 受け付けID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JournalsStatusResponse object if successful.
     */
    JournalsStatusResponse getStatus(int companyId, int id);

    /**
     * ステータス確認.
     * ダウンロードリクエストのステータスを確認する.
     *
     * @param companyId 事業所ID
     * @param id 受け付けID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JournalsStatusResponse> getStatusAsync(int companyId, int id, final ServiceCallback<JournalsStatusResponse> serviceCallback);

    /**
     * ステータス確認.
     * ダウンロードリクエストのステータスを確認する.
     *
     * @param companyId 事業所ID
     * @param id 受け付けID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JournalsStatusResponse object
     */
    Observable<JournalsStatusResponse> getStatusAsync(int companyId, int id);

    /**
     * ステータス確認.
     * ダウンロードリクエストのステータスを確認する.
     *
     * @param companyId 事業所ID
     * @param id 受け付けID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JournalsStatusResponse object
     */
    Observable<ServiceResponse<JournalsStatusResponse>> getStatusWithServiceResponseAsync(int companyId, int id);
    /**
     * ステータス確認.
     * ダウンロードリクエストのステータスを確認する.
     *
     * @param companyId 事業所ID
     * @param id 受け付けID
     * @param visibleTags 補助科目やコメントとして出力する項目
     * @param startDate 取得開始日 (yyyy-mm-dd)
     * @param endDate 取得終了日 (yyyy-mm-dd)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JournalsStatusResponse object if successful.
     */
    JournalsStatusResponse getStatus(int companyId, int id, List<String> visibleTags, String startDate, String endDate);

    /**
     * ステータス確認.
     * ダウンロードリクエストのステータスを確認する.
     *
     * @param companyId 事業所ID
     * @param id 受け付けID
     * @param visibleTags 補助科目やコメントとして出力する項目
     * @param startDate 取得開始日 (yyyy-mm-dd)
     * @param endDate 取得終了日 (yyyy-mm-dd)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<JournalsStatusResponse> getStatusAsync(int companyId, int id, List<String> visibleTags, String startDate, String endDate, final ServiceCallback<JournalsStatusResponse> serviceCallback);

    /**
     * ステータス確認.
     * ダウンロードリクエストのステータスを確認する.
     *
     * @param companyId 事業所ID
     * @param id 受け付けID
     * @param visibleTags 補助科目やコメントとして出力する項目
     * @param startDate 取得開始日 (yyyy-mm-dd)
     * @param endDate 取得終了日 (yyyy-mm-dd)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JournalsStatusResponse object
     */
    Observable<JournalsStatusResponse> getStatusAsync(int companyId, int id, List<String> visibleTags, String startDate, String endDate);

    /**
     * ステータス確認.
     * ダウンロードリクエストのステータスを確認する.
     *
     * @param companyId 事業所ID
     * @param id 受け付けID
     * @param visibleTags 補助科目やコメントとして出力する項目
     * @param startDate 取得開始日 (yyyy-mm-dd)
     * @param endDate 取得終了日 (yyyy-mm-dd)
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JournalsStatusResponse object
     */
    Observable<ServiceResponse<JournalsStatusResponse>> getStatusWithServiceResponseAsync(int companyId, int id, List<String> visibleTags, String startDate, String endDate);

    /**
     * ダウンロード実行.
     * ダウンロードを実行する.
     *
     * @param id 受け付けID
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void download(int id, int companyId);

    /**
     * ダウンロード実行.
     * ダウンロードを実行する.
     *
     * @param id 受け付けID
     * @param companyId 事業所ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> downloadAsync(int id, int companyId, final ServiceCallback<Void> serviceCallback);

    /**
     * ダウンロード実行.
     * ダウンロードを実行する.
     *
     * @param id 受け付けID
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> downloadAsync(int id, int companyId);

    /**
     * ダウンロード実行.
     * ダウンロードを実行する.
     *
     * @param id 受け付けID
     * @param companyId 事業所ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> downloadWithServiceResponseAsync(int id, int companyId);

}
