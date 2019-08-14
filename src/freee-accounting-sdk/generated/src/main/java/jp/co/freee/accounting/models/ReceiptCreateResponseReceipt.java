/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ReceiptCreateResponseReceipt model.
 */
public class ReceiptCreateResponseReceipt {
    /**
     * 証憑ID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * ステータス. Possible values include: 'unconfirmed', 'confirmed', 'deleted',
     * 'ignored'.
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /**
     * メモ.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * MIMEタイプ.
     */
    @JsonProperty(value = "mime_type", required = true)
    private String mimeType;

    /**
     * 発生日.
     */
    @JsonProperty(value = "issue_date")
    private String issueDate;

    /**
     * アップロード元種別. Possible values include: 'unknown', 'web', 'mobile_camera',
     * 'mobile_album', 'scansnap', 'scannable', 'dropbox', 'mail',
     * 'safety_contact_file', 'public_api'.
     */
    @JsonProperty(value = "origin", required = true)
    private String origin;

    /**
     * 作成日時（ISO8601形式）.
     */
    @JsonProperty(value = "created_at", required = true)
    private String createdAt;

    /**
     * The user property.
     */
    @JsonProperty(value = "user", required = true)
    private ReceiptCreateResponseReceiptUser user;

    /**
     * Get 証憑ID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set 証憑ID.
     *
     * @param id the id value to set
     * @return the ReceiptCreateResponseReceipt object itself.
     */
    public ReceiptCreateResponseReceipt withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get ステータス. Possible values include: 'unconfirmed', 'confirmed', 'deleted', 'ignored'.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set ステータス. Possible values include: 'unconfirmed', 'confirmed', 'deleted', 'ignored'.
     *
     * @param status the status value to set
     * @return the ReceiptCreateResponseReceipt object itself.
     */
    public ReceiptCreateResponseReceipt withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get メモ.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set メモ.
     *
     * @param description the description value to set
     * @return the ReceiptCreateResponseReceipt object itself.
     */
    public ReceiptCreateResponseReceipt withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get mIMEタイプ.
     *
     * @return the mimeType value
     */
    public String mimeType() {
        return this.mimeType;
    }

    /**
     * Set mIMEタイプ.
     *
     * @param mimeType the mimeType value to set
     * @return the ReceiptCreateResponseReceipt object itself.
     */
    public ReceiptCreateResponseReceipt withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * Get 発生日.
     *
     * @return the issueDate value
     */
    public String issueDate() {
        return this.issueDate;
    }

    /**
     * Set 発生日.
     *
     * @param issueDate the issueDate value to set
     * @return the ReceiptCreateResponseReceipt object itself.
     */
    public ReceiptCreateResponseReceipt withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Get アップロード元種別. Possible values include: 'unknown', 'web', 'mobile_camera', 'mobile_album', 'scansnap', 'scannable', 'dropbox', 'mail', 'safety_contact_file', 'public_api'.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set アップロード元種別. Possible values include: 'unknown', 'web', 'mobile_camera', 'mobile_album', 'scansnap', 'scannable', 'dropbox', 'mail', 'safety_contact_file', 'public_api'.
     *
     * @param origin the origin value to set
     * @return the ReceiptCreateResponseReceipt object itself.
     */
    public ReceiptCreateResponseReceipt withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get 作成日時（ISO8601形式）.
     *
     * @return the createdAt value
     */
    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Set 作成日時（ISO8601形式）.
     *
     * @param createdAt the createdAt value to set
     * @return the ReceiptCreateResponseReceipt object itself.
     */
    public ReceiptCreateResponseReceipt withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the user value.
     *
     * @return the user value
     */
    public ReceiptCreateResponseReceiptUser user() {
        return this.user;
    }

    /**
     * Set the user value.
     *
     * @param user the user value to set
     * @return the ReceiptCreateResponseReceipt object itself.
     */
    public ReceiptCreateResponseReceipt withUser(ReceiptCreateResponseReceiptUser user) {
        this.user = user;
        return this;
    }

}
