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
 * The RenewsCreateParams model.
 */
public class RenewsCreateParams {
    /**
     * 事業所ID.
     */
    @JsonProperty(value = "company_id", required = true)
    private int companyId;

    /**
     * 更新日 (yyyy-mm-dd).
     */
    @JsonProperty(value = "update_date", required = true)
    private String updateDate;

    /**
     * +更新対象行ID (details(取引の明細行), accruals(債権債務行),
     * renewsのdetails(+更新の明細行)のIDを指定).
     */
    @JsonProperty(value = "renew_target_id", required = true)
    private int renewTargetId;

    /**
     * +更新の明細行.
     */
    @JsonProperty(value = "details", required = true)
    private List<RenewsCreateDetailParams> details;

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
     * @return the RenewsCreateParams object itself.
     */
    public RenewsCreateParams withCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get 更新日 (yyyy-mm-dd).
     *
     * @return the updateDate value
     */
    public String updateDate() {
        return this.updateDate;
    }

    /**
     * Set 更新日 (yyyy-mm-dd).
     *
     * @param updateDate the updateDate value to set
     * @return the RenewsCreateParams object itself.
     */
    public RenewsCreateParams withUpdateDate(String updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * Get +更新対象行ID (details(取引の明細行), accruals(債権債務行), renewsのdetails(+更新の明細行)のIDを指定).
     *
     * @return the renewTargetId value
     */
    public int renewTargetId() {
        return this.renewTargetId;
    }

    /**
     * Set +更新対象行ID (details(取引の明細行), accruals(債権債務行), renewsのdetails(+更新の明細行)のIDを指定).
     *
     * @param renewTargetId the renewTargetId value to set
     * @return the RenewsCreateParams object itself.
     */
    public RenewsCreateParams withRenewTargetId(int renewTargetId) {
        this.renewTargetId = renewTargetId;
        return this;
    }

    /**
     * Get +更新の明細行.
     *
     * @return the details value
     */
    public List<RenewsCreateDetailParams> details() {
        return this.details;
    }

    /**
     * Set +更新の明細行.
     *
     * @param details the details value to set
     * @return the RenewsCreateParams object itself.
     */
    public RenewsCreateParams withDetails(List<RenewsCreateDetailParams> details) {
        this.details = details;
        return this;
    }

}
