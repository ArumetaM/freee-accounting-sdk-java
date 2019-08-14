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
 * The ItemsCreateResponse model.
 */
public class ItemsCreateResponse {
    /**
     * The item property.
     */
    @JsonProperty(value = "item", required = true)
    private ItemsCreateResponseItem item;

    /**
     * Get the item value.
     *
     * @return the item value
     */
    public ItemsCreateResponseItem item() {
        return this.item;
    }

    /**
     * Set the item value.
     *
     * @param item the item value to set
     * @return the ItemsCreateResponse object itself.
     */
    public ItemsCreateResponse withItem(ItemsCreateResponseItem item) {
        this.item = item;
        return this;
    }

}
