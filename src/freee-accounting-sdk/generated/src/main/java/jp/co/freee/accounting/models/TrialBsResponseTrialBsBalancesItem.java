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
 * The TrialBsResponseTrialBsBalancesItem model.
 */
public class TrialBsResponseTrialBsBalancesItem {
    /**
     * 勘定科目ID(勘定科目の時のみ含まれる).
     */
    @JsonProperty(value = "account_item_id")
    private Integer accountItemId;

    /**
     * 勘定科目名(勘定科目の時のみ含まれる).
     */
    @JsonProperty(value = "account_item_name")
    private String accountItemName;

    /**
     * breakdown_display_type:partner,
     * account_item_display_type:account_item指定時のみ含まれる.
     */
    @JsonProperty(value = "partners")
    private List<TrialBsResponseTrialBsBalancesItemPartnersItem> partners;

    /**
     * breakdown_display_type:item,
     * account_item_display_type:account_item指定時のみ含まれる.
     */
    @JsonProperty(value = "items")
    private List<TrialBsResponseTrialBsBalancesItemItemsItem> items;

    /**
     * 勘定科目カテゴリーID(勘定科目カテゴリーの時のみ含まれる).
     */
    @JsonProperty(value = "account_category_id")
    private Integer accountCategoryId;

    /**
     * 勘定科目カテゴリー名(勘定科目カテゴリーの時のみ含まれる).
     */
    @JsonProperty(value = "account_category_name")
    private String accountCategoryName;

    /**
     * 合計行(勘定科目カテゴリー名の時のみ含まれる).
     */
    @JsonProperty(value = "total_line")
    private Boolean totalLine;

    /**
     * 階層レベル.
     */
    @JsonProperty(value = "hierarchy_level")
    private Integer hierarchyLevel;

    /**
     * 上位科目カテゴリーID(上層が存在する場合含まれる).
     */
    @JsonProperty(value = "parent_account_category_id")
    private Integer parentAccountCategoryId;

    /**
     * 上位勘定科目カテゴリー名(上層が存在する場合含まれる).
     */
    @JsonProperty(value = "parent_account_category_name")
    private String parentAccountCategoryName;

    /**
     * 期首残高.
     */
    @JsonProperty(value = "opening_balance")
    private Integer openingBalance;

    /**
     * 借方金額.
     */
    @JsonProperty(value = "debit_amount")
    private Integer debitAmount;

    /**
     * 貸方金額.
     */
    @JsonProperty(value = "credit_amount")
    private Integer creditAmount;

    /**
     * 期末残高.
     */
    @JsonProperty(value = "closing_balance")
    private Integer closingBalance;

    /**
     * 構成比.
     */
    @JsonProperty(value = "composition_ratio")
    private Double compositionRatio;

    /**
     * Get 勘定科目ID(勘定科目の時のみ含まれる).
     *
     * @return the accountItemId value
     */
    public Integer accountItemId() {
        return this.accountItemId;
    }

    /**
     * Set 勘定科目ID(勘定科目の時のみ含まれる).
     *
     * @param accountItemId the accountItemId value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withAccountItemId(Integer accountItemId) {
        this.accountItemId = accountItemId;
        return this;
    }

    /**
     * Get 勘定科目名(勘定科目の時のみ含まれる).
     *
     * @return the accountItemName value
     */
    public String accountItemName() {
        return this.accountItemName;
    }

    /**
     * Set 勘定科目名(勘定科目の時のみ含まれる).
     *
     * @param accountItemName the accountItemName value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withAccountItemName(String accountItemName) {
        this.accountItemName = accountItemName;
        return this;
    }

    /**
     * Get breakdown_display_type:partner, account_item_display_type:account_item指定時のみ含まれる.
     *
     * @return the partners value
     */
    public List<TrialBsResponseTrialBsBalancesItemPartnersItem> partners() {
        return this.partners;
    }

    /**
     * Set breakdown_display_type:partner, account_item_display_type:account_item指定時のみ含まれる.
     *
     * @param partners the partners value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withPartners(List<TrialBsResponseTrialBsBalancesItemPartnersItem> partners) {
        this.partners = partners;
        return this;
    }

    /**
     * Get breakdown_display_type:item, account_item_display_type:account_item指定時のみ含まれる.
     *
     * @return the items value
     */
    public List<TrialBsResponseTrialBsBalancesItemItemsItem> items() {
        return this.items;
    }

    /**
     * Set breakdown_display_type:item, account_item_display_type:account_item指定時のみ含まれる.
     *
     * @param items the items value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withItems(List<TrialBsResponseTrialBsBalancesItemItemsItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Get 勘定科目カテゴリーID(勘定科目カテゴリーの時のみ含まれる).
     *
     * @return the accountCategoryId value
     */
    public Integer accountCategoryId() {
        return this.accountCategoryId;
    }

    /**
     * Set 勘定科目カテゴリーID(勘定科目カテゴリーの時のみ含まれる).
     *
     * @param accountCategoryId the accountCategoryId value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withAccountCategoryId(Integer accountCategoryId) {
        this.accountCategoryId = accountCategoryId;
        return this;
    }

    /**
     * Get 勘定科目カテゴリー名(勘定科目カテゴリーの時のみ含まれる).
     *
     * @return the accountCategoryName value
     */
    public String accountCategoryName() {
        return this.accountCategoryName;
    }

    /**
     * Set 勘定科目カテゴリー名(勘定科目カテゴリーの時のみ含まれる).
     *
     * @param accountCategoryName the accountCategoryName value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withAccountCategoryName(String accountCategoryName) {
        this.accountCategoryName = accountCategoryName;
        return this;
    }

    /**
     * Get 合計行(勘定科目カテゴリー名の時のみ含まれる).
     *
     * @return the totalLine value
     */
    public Boolean totalLine() {
        return this.totalLine;
    }

    /**
     * Set 合計行(勘定科目カテゴリー名の時のみ含まれる).
     *
     * @param totalLine the totalLine value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withTotalLine(Boolean totalLine) {
        this.totalLine = totalLine;
        return this;
    }

    /**
     * Get 階層レベル.
     *
     * @return the hierarchyLevel value
     */
    public Integer hierarchyLevel() {
        return this.hierarchyLevel;
    }

    /**
     * Set 階層レベル.
     *
     * @param hierarchyLevel the hierarchyLevel value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withHierarchyLevel(Integer hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
        return this;
    }

    /**
     * Get 上位科目カテゴリーID(上層が存在する場合含まれる).
     *
     * @return the parentAccountCategoryId value
     */
    public Integer parentAccountCategoryId() {
        return this.parentAccountCategoryId;
    }

    /**
     * Set 上位科目カテゴリーID(上層が存在する場合含まれる).
     *
     * @param parentAccountCategoryId the parentAccountCategoryId value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withParentAccountCategoryId(Integer parentAccountCategoryId) {
        this.parentAccountCategoryId = parentAccountCategoryId;
        return this;
    }

    /**
     * Get 上位勘定科目カテゴリー名(上層が存在する場合含まれる).
     *
     * @return the parentAccountCategoryName value
     */
    public String parentAccountCategoryName() {
        return this.parentAccountCategoryName;
    }

    /**
     * Set 上位勘定科目カテゴリー名(上層が存在する場合含まれる).
     *
     * @param parentAccountCategoryName the parentAccountCategoryName value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withParentAccountCategoryName(String parentAccountCategoryName) {
        this.parentAccountCategoryName = parentAccountCategoryName;
        return this;
    }

    /**
     * Get 期首残高.
     *
     * @return the openingBalance value
     */
    public Integer openingBalance() {
        return this.openingBalance;
    }

    /**
     * Set 期首残高.
     *
     * @param openingBalance the openingBalance value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withOpeningBalance(Integer openingBalance) {
        this.openingBalance = openingBalance;
        return this;
    }

    /**
     * Get 借方金額.
     *
     * @return the debitAmount value
     */
    public Integer debitAmount() {
        return this.debitAmount;
    }

    /**
     * Set 借方金額.
     *
     * @param debitAmount the debitAmount value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withDebitAmount(Integer debitAmount) {
        this.debitAmount = debitAmount;
        return this;
    }

    /**
     * Get 貸方金額.
     *
     * @return the creditAmount value
     */
    public Integer creditAmount() {
        return this.creditAmount;
    }

    /**
     * Set 貸方金額.
     *
     * @param creditAmount the creditAmount value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    /**
     * Get 期末残高.
     *
     * @return the closingBalance value
     */
    public Integer closingBalance() {
        return this.closingBalance;
    }

    /**
     * Set 期末残高.
     *
     * @param closingBalance the closingBalance value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withClosingBalance(Integer closingBalance) {
        this.closingBalance = closingBalance;
        return this;
    }

    /**
     * Get 構成比.
     *
     * @return the compositionRatio value
     */
    public Double compositionRatio() {
        return this.compositionRatio;
    }

    /**
     * Set 構成比.
     *
     * @param compositionRatio the compositionRatio value to set
     * @return the TrialBsResponseTrialBsBalancesItem object itself.
     */
    public TrialBsResponseTrialBsBalancesItem withCompositionRatio(Double compositionRatio) {
        this.compositionRatio = compositionRatio;
        return this;
    }

}
