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
 * The AccountItemParamsAccountItemItemsItem model.
 */
public class AccountItemParamsAccountItemItemsItem {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the AccountItemParamsAccountItemItemsItem object itself.
     */
    public AccountItemParamsAccountItemItemsItem withId(Integer id) {
        this.id = id;
        return this;
    }

}
