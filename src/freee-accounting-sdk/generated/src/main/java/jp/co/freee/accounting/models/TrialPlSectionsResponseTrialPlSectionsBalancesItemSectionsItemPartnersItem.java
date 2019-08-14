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
 * The
 * TrialPlSectionsResponseTrialPlSectionsBalancesItemSectionsItemPartnersItem
 * model.
 */
public class TrialPlSectionsResponseTrialPlSectionsBalancesItemSectionsItemPartnersItem {
    /**
     * 取引先ID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * 取引先名.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 期末残高.
     */
    @JsonProperty(value = "closing_balance")
    private Integer closingBalance;

    /**
     * Get 取引先ID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set 取引先ID.
     *
     * @param id the id value to set
     * @return the TrialPlSectionsResponseTrialPlSectionsBalancesItemSectionsItemPartnersItem object itself.
     */
    public TrialPlSectionsResponseTrialPlSectionsBalancesItemSectionsItemPartnersItem withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get 取引先名.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 取引先名.
     *
     * @param name the name value to set
     * @return the TrialPlSectionsResponseTrialPlSectionsBalancesItemSectionsItemPartnersItem object itself.
     */
    public TrialPlSectionsResponseTrialPlSectionsBalancesItemSectionsItemPartnersItem withName(String name) {
        this.name = name;
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
     * @return the TrialPlSectionsResponseTrialPlSectionsBalancesItemSectionsItemPartnersItem object itself.
     */
    public TrialPlSectionsResponseTrialPlSectionsBalancesItemSectionsItemPartnersItem withClosingBalance(Integer closingBalance) {
        this.closingBalance = closingBalance;
        return this;
    }

}
