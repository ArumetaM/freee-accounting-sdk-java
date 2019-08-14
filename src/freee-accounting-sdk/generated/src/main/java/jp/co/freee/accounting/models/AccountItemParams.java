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
 * The AccountItemParams model.
 */
public class AccountItemParams {
    /**
     * 事業所ID.
     */
    @JsonProperty(value = "company_id", required = true)
    private int companyId;

    /**
     * The accountItem property.
     */
    @JsonProperty(value = "account_item", required = true)
    private AccountItemParamsAccountItem accountItem;

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
     * @return the AccountItemParams object itself.
     */
    public AccountItemParams withCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get the accountItem value.
     *
     * @return the accountItem value
     */
    public AccountItemParamsAccountItem accountItem() {
        return this.accountItem;
    }

    /**
     * Set the accountItem value.
     *
     * @param accountItem the accountItem value to set
     * @return the AccountItemParams object itself.
     */
    public AccountItemParams withAccountItem(AccountItemParamsAccountItem accountItem) {
        this.accountItem = accountItem;
        return this;
    }

}
