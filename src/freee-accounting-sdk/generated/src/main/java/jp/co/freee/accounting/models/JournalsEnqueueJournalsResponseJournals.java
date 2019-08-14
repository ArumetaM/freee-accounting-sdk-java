/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JournalsEnqueueJournalsResponseJournals model.
 */
public class JournalsEnqueueJournalsResponseJournals {
    /**
     * 受け付けID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * 受け付けメッセージ.
     */
    @JsonProperty(value = "messages")
    private String messages;

    /**
     * 事業所ID.
     */
    @JsonProperty(value = "company_id", required = true)
    private int companyId;

    /**
     * ダウンロード形式. Possible values include: 'csv', 'generic', 'pdf'.
     */
    @JsonProperty(value = "download_type")
    private String downloadType;

    /**
     * 取得開始日 (yyyy-mm-dd).
     */
    @JsonProperty(value = "start_date")
    private String startDate;

    /**
     * 取得終了日 (yyyy-mm-dd).
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * The visibleTags property.
     */
    @JsonProperty(value = "visible_tags")
    private List<String> visibleTags;

    /**
     * ステータス確認用URL.
     */
    @JsonProperty(value = "status_url")
    private String statusUrl;

    /**
     * Get 受け付けID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set 受け付けID.
     *
     * @param id the id value to set
     * @return the JournalsEnqueueJournalsResponseJournals object itself.
     */
    public JournalsEnqueueJournalsResponseJournals withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get 受け付けメッセージ.
     *
     * @return the messages value
     */
    public String messages() {
        return this.messages;
    }

    /**
     * Set 受け付けメッセージ.
     *
     * @param messages the messages value to set
     * @return the JournalsEnqueueJournalsResponseJournals object itself.
     */
    public JournalsEnqueueJournalsResponseJournals withMessages(String messages) {
        this.messages = messages;
        return this;
    }

    /**
     * Get 事業所ID.
     *
     * @return the companyId value
     */
    public int companyId() {
        return this.companyId;
    }

    /**
     * Set 事業所ID.
     *
     * @param companyId the companyId value to set
     * @return the JournalsEnqueueJournalsResponseJournals object itself.
     */
    public JournalsEnqueueJournalsResponseJournals withCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get ダウンロード形式. Possible values include: 'csv', 'generic', 'pdf'.
     *
     * @return the downloadType value
     */
    public String downloadType() {
        return this.downloadType;
    }

    /**
     * Set ダウンロード形式. Possible values include: 'csv', 'generic', 'pdf'.
     *
     * @param downloadType the downloadType value to set
     * @return the JournalsEnqueueJournalsResponseJournals object itself.
     */
    public JournalsEnqueueJournalsResponseJournals withDownloadType(String downloadType) {
        this.downloadType = downloadType;
        return this;
    }

    /**
     * Get 取得開始日 (yyyy-mm-dd).
     *
     * @return the startDate value
     */
    public String startDate() {
        return this.startDate;
    }

    /**
     * Set 取得開始日 (yyyy-mm-dd).
     *
     * @param startDate the startDate value to set
     * @return the JournalsEnqueueJournalsResponseJournals object itself.
     */
    public JournalsEnqueueJournalsResponseJournals withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get 取得終了日 (yyyy-mm-dd).
     *
     * @return the endDate value
     */
    public String endDate() {
        return this.endDate;
    }

    /**
     * Set 取得終了日 (yyyy-mm-dd).
     *
     * @param endDate the endDate value to set
     * @return the JournalsEnqueueJournalsResponseJournals object itself.
     */
    public JournalsEnqueueJournalsResponseJournals withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the visibleTags value.
     *
     * @return the visibleTags value
     */
    public List<String> visibleTags() {
        return this.visibleTags;
    }

    /**
     * Set the visibleTags value.
     *
     * @param visibleTags the visibleTags value to set
     * @return the JournalsEnqueueJournalsResponseJournals object itself.
     */
    public JournalsEnqueueJournalsResponseJournals withVisibleTags(List<String> visibleTags) {
        this.visibleTags = visibleTags;
        return this;
    }

    /**
     * Get ステータス確認用URL.
     *
     * @return the statusUrl value
     */
    public String statusUrl() {
        return this.statusUrl;
    }

    /**
     * Set ステータス確認用URL.
     *
     * @param statusUrl the statusUrl value to set
     * @return the JournalsEnqueueJournalsResponseJournals object itself.
     */
    public JournalsEnqueueJournalsResponseJournals withStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
        return this;
    }

}
