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
 * The DealsIndexResponse model.
 */
public class DealsIndexResponse {
    /**
     * The deals property.
     */
    @JsonProperty(value = "deals", required = true)
    private List<Deals> deals;

    /**
     * The meta property.
     */
    @JsonProperty(value = "meta", required = true)
    private DealsIndexResponseMeta meta;

    /**
     * Get the deals value.
     *
     * @return the deals value
     */
    public List<Deals> deals() {
        return this.deals;
    }

    /**
     * Set the deals value.
     *
     * @param deals the deals value to set
     * @return the DealsIndexResponse object itself.
     */
    public DealsIndexResponse withDeals(List<Deals> deals) {
        this.deals = deals;
        return this;
    }

    /**
     * Get the meta value.
     *
     * @return the meta value
     */
    public DealsIndexResponseMeta meta() {
        return this.meta;
    }

    /**
     * Set the meta value.
     *
     * @param meta the meta value to set
     * @return the DealsIndexResponse object itself.
     */
    public DealsIndexResponse withMeta(DealsIndexResponseMeta meta) {
        this.meta = meta;
        return this;
    }

}
