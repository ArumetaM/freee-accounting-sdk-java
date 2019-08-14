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
 * The DealsCreateResponse model.
 */
public class DealsCreateResponse {
    /**
     * The deal property.
     */
    @JsonProperty(value = "deal", required = true)
    private DealsWithoutRenews deal;

    /**
     * Get the deal value.
     *
     * @return the deal value
     */
    public DealsWithoutRenews deal() {
        return this.deal;
    }

    /**
     * Set the deal value.
     *
     * @param deal the deal value to set
     * @return the DealsCreateResponse object itself.
     */
    public DealsCreateResponse withDeal(DealsWithoutRenews deal) {
        this.deal = deal;
        return this;
    }

}
