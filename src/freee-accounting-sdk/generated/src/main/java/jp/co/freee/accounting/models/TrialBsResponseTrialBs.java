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
 * The TrialBsResponseTrialBs model.
 */
public class TrialBsResponseTrialBs {
    /**
     * 事業所ID.
     */
    @JsonProperty(value = "company_id", required = true)
    private int companyId;

    /**
     * 会計年度(条件に指定した時、または条件に月、日条件がない時のみ含まれる）.
     */
    @JsonProperty(value = "fiscal_year")
    private Integer fiscalYear;

    /**
     * 発生月で絞込：開始会計月(mm)(条件に指定した時のみ含まれる）.
     */
    @JsonProperty(value = "start_month")
    private Integer startMonth;

    /**
     * 発生月で絞込：終了会計月(mm)(条件に指定した時のみ含まれる）.
     */
    @JsonProperty(value = "end_month")
    private Integer endMonth;

    /**
     * 発生日で絞込：開始日(yyyy-mm-dd)(条件に指定した時のみ含まれる）.
     */
    @JsonProperty(value = "start_date")
    private String startDate;

    /**
     * 発生日で絞込：終了日(yyyy-mm-dd)(条件に指定した時のみ含まれる）.
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 勘定科目の表示（勘定科目: account_item, 決算書表示:group）(条件に指定した時のみ含まれる）. Possible
     * values include: 'account_item', 'group'.
     */
    @JsonProperty(value = "account_item_display_type")
    private String accountItemDisplayType;

    /**
     * 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item）(条件に指定した時のみ含まれる）.
     * Possible values include: 'partner', 'item', 'account_item'.
     */
    @JsonProperty(value = "breakdown_display_type")
    private String breakdownDisplayType;

    /**
     * 取引先ID(条件に指定した時のみ含まれる）.
     */
    @JsonProperty(value = "partner_id")
    private Integer partnerId;

    /**
     * 取引先コード(条件に指定した時のみ含まれる）.
     */
    @JsonProperty(value = "partner_code")
    private String partnerCode;

    /**
     * 品目ID(条件に指定した時のみ含まれる）.
     */
    @JsonProperty(value = "item_id")
    private Integer itemId;

    /**
     * 決算整理仕訳のみ: only, 決算整理仕訳以外: without(条件に指定した時のみ含まれる）. Possible values
     * include: 'only', 'without'.
     */
    @JsonProperty(value = "adjustment")
    private String adjustment;

    /**
     * 作成日時.
     */
    @JsonProperty(value = "created_at")
    private String createdAt;

    /**
     * The balances property.
     */
    @JsonProperty(value = "balances", required = true)
    private List<TrialBsResponseTrialBsBalancesItem> balances;

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
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get 会計年度(条件に指定した時、または条件に月、日条件がない時のみ含まれる）.
     *
     * @return the fiscalYear value
     */
    public Integer fiscalYear() {
        return this.fiscalYear;
    }

    /**
     * Set 会計年度(条件に指定した時、または条件に月、日条件がない時のみ含まれる）.
     *
     * @param fiscalYear the fiscalYear value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withFiscalYear(Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
        return this;
    }

    /**
     * Get 発生月で絞込：開始会計月(mm)(条件に指定した時のみ含まれる）.
     *
     * @return the startMonth value
     */
    public Integer startMonth() {
        return this.startMonth;
    }

    /**
     * Set 発生月で絞込：開始会計月(mm)(条件に指定した時のみ含まれる）.
     *
     * @param startMonth the startMonth value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withStartMonth(Integer startMonth) {
        this.startMonth = startMonth;
        return this;
    }

    /**
     * Get 発生月で絞込：終了会計月(mm)(条件に指定した時のみ含まれる）.
     *
     * @return the endMonth value
     */
    public Integer endMonth() {
        return this.endMonth;
    }

    /**
     * Set 発生月で絞込：終了会計月(mm)(条件に指定した時のみ含まれる）.
     *
     * @param endMonth the endMonth value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withEndMonth(Integer endMonth) {
        this.endMonth = endMonth;
        return this;
    }

    /**
     * Get 発生日で絞込：開始日(yyyy-mm-dd)(条件に指定した時のみ含まれる）.
     *
     * @return the startDate value
     */
    public String startDate() {
        return this.startDate;
    }

    /**
     * Set 発生日で絞込：開始日(yyyy-mm-dd)(条件に指定した時のみ含まれる）.
     *
     * @param startDate the startDate value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get 発生日で絞込：終了日(yyyy-mm-dd)(条件に指定した時のみ含まれる）.
     *
     * @return the endDate value
     */
    public String endDate() {
        return this.endDate;
    }

    /**
     * Set 発生日で絞込：終了日(yyyy-mm-dd)(条件に指定した時のみ含まれる）.
     *
     * @param endDate the endDate value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get 勘定科目の表示（勘定科目: account_item, 決算書表示:group）(条件に指定した時のみ含まれる）. Possible values include: 'account_item', 'group'.
     *
     * @return the accountItemDisplayType value
     */
    public String accountItemDisplayType() {
        return this.accountItemDisplayType;
    }

    /**
     * Set 勘定科目の表示（勘定科目: account_item, 決算書表示:group）(条件に指定した時のみ含まれる）. Possible values include: 'account_item', 'group'.
     *
     * @param accountItemDisplayType the accountItemDisplayType value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withAccountItemDisplayType(String accountItemDisplayType) {
        this.accountItemDisplayType = accountItemDisplayType;
        return this;
    }

    /**
     * Get 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item）(条件に指定した時のみ含まれる）. Possible values include: 'partner', 'item', 'account_item'.
     *
     * @return the breakdownDisplayType value
     */
    public String breakdownDisplayType() {
        return this.breakdownDisplayType;
    }

    /**
     * Set 内訳の表示（取引先: partner, 品目: item, 勘定科目: account_item）(条件に指定した時のみ含まれる）. Possible values include: 'partner', 'item', 'account_item'.
     *
     * @param breakdownDisplayType the breakdownDisplayType value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withBreakdownDisplayType(String breakdownDisplayType) {
        this.breakdownDisplayType = breakdownDisplayType;
        return this;
    }

    /**
     * Get 取引先ID(条件に指定した時のみ含まれる）.
     *
     * @return the partnerId value
     */
    public Integer partnerId() {
        return this.partnerId;
    }

    /**
     * Set 取引先ID(条件に指定した時のみ含まれる）.
     *
     * @param partnerId the partnerId value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    /**
     * Get 取引先コード(条件に指定した時のみ含まれる）.
     *
     * @return the partnerCode value
     */
    public String partnerCode() {
        return this.partnerCode;
    }

    /**
     * Set 取引先コード(条件に指定した時のみ含まれる）.
     *
     * @param partnerCode the partnerCode value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }

    /**
     * Get 品目ID(条件に指定した時のみ含まれる）.
     *
     * @return the itemId value
     */
    public Integer itemId() {
        return this.itemId;
    }

    /**
     * Set 品目ID(条件に指定した時のみ含まれる）.
     *
     * @param itemId the itemId value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * Get 決算整理仕訳のみ: only, 決算整理仕訳以外: without(条件に指定した時のみ含まれる）. Possible values include: 'only', 'without'.
     *
     * @return the adjustment value
     */
    public String adjustment() {
        return this.adjustment;
    }

    /**
     * Set 決算整理仕訳のみ: only, 決算整理仕訳以外: without(条件に指定した時のみ含まれる）. Possible values include: 'only', 'without'.
     *
     * @param adjustment the adjustment value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withAdjustment(String adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    /**
     * Get 作成日時.
     *
     * @return the createdAt value
     */
    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Set 作成日時.
     *
     * @param createdAt the createdAt value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the balances value.
     *
     * @return the balances value
     */
    public List<TrialBsResponseTrialBsBalancesItem> balances() {
        return this.balances;
    }

    /**
     * Set the balances value.
     *
     * @param balances the balances value to set
     * @return the TrialBsResponseTrialBs object itself.
     */
    public TrialBsResponseTrialBs withBalances(List<TrialBsResponseTrialBsBalancesItem> balances) {
        this.balances = balances;
        return this;
    }

}
