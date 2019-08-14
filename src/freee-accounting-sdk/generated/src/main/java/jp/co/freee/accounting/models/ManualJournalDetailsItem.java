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
 * The ManualJournalDetailsItem model.
 */
public class ManualJournalDetailsItem {
    /**
     * 貸借行ID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * 貸借(貸方: credit, 借方: debit). Possible values include: 'credit', 'debit'.
     */
    @JsonProperty(value = "entry_side", required = true)
    private String entrySide;

    /**
     * 勘定科目ID.
     */
    @JsonProperty(value = "account_item_id", required = true)
    private int accountItemId;

    /**
     * 税区分ID.
     */
    @JsonProperty(value = "tax_code", required = true)
    private int taxCode;

    /**
     * 取引先ID.
     */
    @JsonProperty(value = "partner_id", required = true)
    private Integer partnerId;

    /**
     * 取引先名.
     */
    @JsonProperty(value = "partner_name", required = true)
    private String partnerName;

    /**
     * 取引先コード.
     */
    @JsonProperty(value = "partner_code")
    private String partnerCode;

    /**
     * 正式名称（255文字以内）.
     */
    @JsonProperty(value = "partner_long_name", required = true)
    private String partnerLongName;

    /**
     * 品目ID.
     */
    @JsonProperty(value = "item_id", required = true)
    private Integer itemId;

    /**
     * 品目.
     */
    @JsonProperty(value = "item_name", required = true)
    private String itemName;

    /**
     * 部門ID.
     */
    @JsonProperty(value = "section_id", required = true)
    private Integer sectionId;

    /**
     * 部門.
     */
    @JsonProperty(value = "section_name", required = true)
    private String sectionName;

    /**
     * The tagIds property.
     */
    @JsonProperty(value = "tag_ids", required = true)
    private List<Integer> tagIds;

    /**
     * The tagNames property.
     */
    @JsonProperty(value = "tag_names", required = true)
    private List<String> tagNames;

    /**
     * セグメント１ID.
     */
    @JsonProperty(value = "segment_1_tag_id")
    private Integer segment1TagId;

    /**
     * セグメント１ID.
     */
    @JsonProperty(value = "segment_1_tag_name")
    private Integer segment1TagName;

    /**
     * セグメント２ID.
     */
    @JsonProperty(value = "segment_2_tag_id")
    private Integer segment2TagId;

    /**
     * セグメント２.
     */
    @JsonProperty(value = "segment_2_tag_name")
    private Integer segment2TagName;

    /**
     * セグメント３ID.
     */
    @JsonProperty(value = "segment_3_tag_id")
    private Integer segment3TagId;

    /**
     * セグメント３.
     */
    @JsonProperty(value = "segment_3_tag_name")
    private Integer segment3TagName;

    /**
     * 金額（税込で指定してください）.
     */
    @JsonProperty(value = "amount", required = true)
    private int amount;

    /**
     * 消費税額（指定しない場合は自動で計算されます）.
     */
    @JsonProperty(value = "vat", required = true)
    private int vat;

    /**
     * 備考.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * Get 貸借行ID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set 貸借行ID.
     *
     * @param id the id value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get 貸借(貸方: credit, 借方: debit). Possible values include: 'credit', 'debit'.
     *
     * @return the entrySide value
     */
    public String entrySide() {
        return this.entrySide;
    }

    /**
     * Set 貸借(貸方: credit, 借方: debit). Possible values include: 'credit', 'debit'.
     *
     * @param entrySide the entrySide value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withEntrySide(String entrySide) {
        this.entrySide = entrySide;
        return this;
    }

    /**
     * Get 勘定科目ID.
     *
     * @return the accountItemId value
     */
    public int accountItemId() {
        return this.accountItemId;
    }

    /**
     * Set 勘定科目ID.
     *
     * @param accountItemId the accountItemId value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withAccountItemId(int accountItemId) {
        this.accountItemId = accountItemId;
        return this;
    }

    /**
     * Get 税区分ID.
     *
     * @return the taxCode value
     */
    public int taxCode() {
        return this.taxCode;
    }

    /**
     * Set 税区分ID.
     *
     * @param taxCode the taxCode value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withTaxCode(int taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    /**
     * Get 取引先ID.
     *
     * @return the partnerId value
     */
    public Integer partnerId() {
        return this.partnerId;
    }

    /**
     * Set 取引先ID.
     *
     * @param partnerId the partnerId value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    /**
     * Get 取引先名.
     *
     * @return the partnerName value
     */
    public String partnerName() {
        return this.partnerName;
    }

    /**
     * Set 取引先名.
     *
     * @param partnerName the partnerName value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withPartnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }

    /**
     * Get 取引先コード.
     *
     * @return the partnerCode value
     */
    public String partnerCode() {
        return this.partnerCode;
    }

    /**
     * Set 取引先コード.
     *
     * @param partnerCode the partnerCode value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }

    /**
     * Get 正式名称（255文字以内）.
     *
     * @return the partnerLongName value
     */
    public String partnerLongName() {
        return this.partnerLongName;
    }

    /**
     * Set 正式名称（255文字以内）.
     *
     * @param partnerLongName the partnerLongName value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withPartnerLongName(String partnerLongName) {
        this.partnerLongName = partnerLongName;
        return this;
    }

    /**
     * Get 品目ID.
     *
     * @return the itemId value
     */
    public Integer itemId() {
        return this.itemId;
    }

    /**
     * Set 品目ID.
     *
     * @param itemId the itemId value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * Get 品目.
     *
     * @return the itemName value
     */
    public String itemName() {
        return this.itemName;
    }

    /**
     * Set 品目.
     *
     * @param itemName the itemName value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    /**
     * Get 部門ID.
     *
     * @return the sectionId value
     */
    public Integer sectionId() {
        return this.sectionId;
    }

    /**
     * Set 部門ID.
     *
     * @param sectionId the sectionId value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withSectionId(Integer sectionId) {
        this.sectionId = sectionId;
        return this;
    }

    /**
     * Get 部門.
     *
     * @return the sectionName value
     */
    public String sectionName() {
        return this.sectionName;
    }

    /**
     * Set 部門.
     *
     * @param sectionName the sectionName value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withSectionName(String sectionName) {
        this.sectionName = sectionName;
        return this;
    }

    /**
     * Get the tagIds value.
     *
     * @return the tagIds value
     */
    public List<Integer> tagIds() {
        return this.tagIds;
    }

    /**
     * Set the tagIds value.
     *
     * @param tagIds the tagIds value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    /**
     * Get the tagNames value.
     *
     * @return the tagNames value
     */
    public List<String> tagNames() {
        return this.tagNames;
    }

    /**
     * Set the tagNames value.
     *
     * @param tagNames the tagNames value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
        return this;
    }

    /**
     * Get セグメント１ID.
     *
     * @return the segment1TagId value
     */
    public Integer segment1TagId() {
        return this.segment1TagId;
    }

    /**
     * Set セグメント１ID.
     *
     * @param segment1TagId the segment1TagId value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withSegment1TagId(Integer segment1TagId) {
        this.segment1TagId = segment1TagId;
        return this;
    }

    /**
     * Get セグメント１ID.
     *
     * @return the segment1TagName value
     */
    public Integer segment1TagName() {
        return this.segment1TagName;
    }

    /**
     * Set セグメント１ID.
     *
     * @param segment1TagName the segment1TagName value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withSegment1TagName(Integer segment1TagName) {
        this.segment1TagName = segment1TagName;
        return this;
    }

    /**
     * Get セグメント２ID.
     *
     * @return the segment2TagId value
     */
    public Integer segment2TagId() {
        return this.segment2TagId;
    }

    /**
     * Set セグメント２ID.
     *
     * @param segment2TagId the segment2TagId value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withSegment2TagId(Integer segment2TagId) {
        this.segment2TagId = segment2TagId;
        return this;
    }

    /**
     * Get セグメント２.
     *
     * @return the segment2TagName value
     */
    public Integer segment2TagName() {
        return this.segment2TagName;
    }

    /**
     * Set セグメント２.
     *
     * @param segment2TagName the segment2TagName value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withSegment2TagName(Integer segment2TagName) {
        this.segment2TagName = segment2TagName;
        return this;
    }

    /**
     * Get セグメント３ID.
     *
     * @return the segment3TagId value
     */
    public Integer segment3TagId() {
        return this.segment3TagId;
    }

    /**
     * Set セグメント３ID.
     *
     * @param segment3TagId the segment3TagId value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withSegment3TagId(Integer segment3TagId) {
        this.segment3TagId = segment3TagId;
        return this;
    }

    /**
     * Get セグメント３.
     *
     * @return the segment3TagName value
     */
    public Integer segment3TagName() {
        return this.segment3TagName;
    }

    /**
     * Set セグメント３.
     *
     * @param segment3TagName the segment3TagName value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withSegment3TagName(Integer segment3TagName) {
        this.segment3TagName = segment3TagName;
        return this;
    }

    /**
     * Get 金額（税込で指定してください）.
     *
     * @return the amount value
     */
    public int amount() {
        return this.amount;
    }

    /**
     * Set 金額（税込で指定してください）.
     *
     * @param amount the amount value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withAmount(int amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get 消費税額（指定しない場合は自動で計算されます）.
     *
     * @return the vat value
     */
    public int vat() {
        return this.vat;
    }

    /**
     * Set 消費税額（指定しない場合は自動で計算されます）.
     *
     * @param vat the vat value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withVat(int vat) {
        this.vat = vat;
        return this;
    }

    /**
     * Get 備考.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set 備考.
     *
     * @param description the description value to set
     * @return the ManualJournalDetailsItem object itself.
     */
    public ManualJournalDetailsItem withDescription(String description) {
        this.description = description;
        return this;
    }

}
