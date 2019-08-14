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
 * The DealsDetails model.
 */
public class DealsDetails {
    /**
     * 取引行ID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * 勘定科目ID.
     */
    @JsonProperty(value = "account_item_id", required = true)
    private int accountItemId;

    /**
     * 税区分ID（廃止予定）.
     */
    @JsonProperty(value = "tax_id")
    private Integer taxId;

    /**
     * 税区分コード.
     */
    @JsonProperty(value = "tax_code", required = true)
    private int taxCode;

    /**
     * 品目ID.
     */
    @JsonProperty(value = "item_id")
    private Integer itemId;

    /**
     * 部門ID.
     */
    @JsonProperty(value = "section_id")
    private Integer sectionId;

    /**
     * メモタグID.
     */
    @JsonProperty(value = "tag_ids")
    private List<Integer> tagIds;

    /**
     * セグメント１ID.
     */
    @JsonProperty(value = "segment_1_tag_id")
    private Integer segment1TagId;

    /**
     * セグメント２ID.
     */
    @JsonProperty(value = "segment_2_tag_id")
    private Integer segment2TagId;

    /**
     * セグメント３ID.
     */
    @JsonProperty(value = "segment_3_tag_id")
    private Integer segment3TagId;

    /**
     * 取引金額.
     */
    @JsonProperty(value = "amount", required = true)
    private int amount;

    /**
     * 消費税額.
     */
    @JsonProperty(value = "vat", required = true)
    private int vat;

    /**
     * 備考.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * 貸借（貸方: credit, 借方: debit）. Possible values include: 'credit', 'debit'.
     */
    @JsonProperty(value = "entry_side", required = true)
    private String entrySide;

    /**
     * Get 取引行ID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set 取引行ID.
     *
     * @param id the id value to set
     * @return the DealsDetails object itself.
     */
    public DealsDetails withId(int id) {
        this.id = id;
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
     * @return the DealsDetails object itself.
     */
    public DealsDetails withAccountItemId(int accountItemId) {
        this.accountItemId = accountItemId;
        return this;
    }

    /**
     * Get 税区分ID（廃止予定）.
     *
     * @return the taxId value
     */
    public Integer taxId() {
        return this.taxId;
    }

    /**
     * Set 税区分ID（廃止予定）.
     *
     * @param taxId the taxId value to set
     * @return the DealsDetails object itself.
     */
    public DealsDetails withTaxId(Integer taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Get 税区分コード.
     *
     * @return the taxCode value
     */
    public int taxCode() {
        return this.taxCode;
    }

    /**
     * Set 税区分コード.
     *
     * @param taxCode the taxCode value to set
     * @return the DealsDetails object itself.
     */
    public DealsDetails withTaxCode(int taxCode) {
        this.taxCode = taxCode;
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
     * @return the DealsDetails object itself.
     */
    public DealsDetails withItemId(Integer itemId) {
        this.itemId = itemId;
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
     * @return the DealsDetails object itself.
     */
    public DealsDetails withSectionId(Integer sectionId) {
        this.sectionId = sectionId;
        return this;
    }

    /**
     * Get メモタグID.
     *
     * @return the tagIds value
     */
    public List<Integer> tagIds() {
        return this.tagIds;
    }

    /**
     * Set メモタグID.
     *
     * @param tagIds the tagIds value to set
     * @return the DealsDetails object itself.
     */
    public DealsDetails withTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
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
     * @return the DealsDetails object itself.
     */
    public DealsDetails withSegment1TagId(Integer segment1TagId) {
        this.segment1TagId = segment1TagId;
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
     * @return the DealsDetails object itself.
     */
    public DealsDetails withSegment2TagId(Integer segment2TagId) {
        this.segment2TagId = segment2TagId;
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
     * @return the DealsDetails object itself.
     */
    public DealsDetails withSegment3TagId(Integer segment3TagId) {
        this.segment3TagId = segment3TagId;
        return this;
    }

    /**
     * Get 取引金額.
     *
     * @return the amount value
     */
    public int amount() {
        return this.amount;
    }

    /**
     * Set 取引金額.
     *
     * @param amount the amount value to set
     * @return the DealsDetails object itself.
     */
    public DealsDetails withAmount(int amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get 消費税額.
     *
     * @return the vat value
     */
    public int vat() {
        return this.vat;
    }

    /**
     * Set 消費税額.
     *
     * @param vat the vat value to set
     * @return the DealsDetails object itself.
     */
    public DealsDetails withVat(int vat) {
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
     * @return the DealsDetails object itself.
     */
    public DealsDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get 貸借（貸方: credit, 借方: debit）. Possible values include: 'credit', 'debit'.
     *
     * @return the entrySide value
     */
    public String entrySide() {
        return this.entrySide;
    }

    /**
     * Set 貸借（貸方: credit, 借方: debit）. Possible values include: 'credit', 'debit'.
     *
     * @param entrySide the entrySide value to set
     * @return the DealsDetails object itself.
     */
    public DealsDetails withEntrySide(String entrySide) {
        this.entrySide = entrySide;
        return this;
    }

}
