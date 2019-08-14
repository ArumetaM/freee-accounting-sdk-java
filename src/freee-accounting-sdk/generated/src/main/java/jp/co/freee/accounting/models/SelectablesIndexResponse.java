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
 * The SelectablesIndexResponse model.
 */
public class SelectablesIndexResponse {
    /**
     * The accountCategories property.
     */
    @JsonProperty(value = "account_categories")
    private List<SelectablesIndexResponseAccountCategoriesItem> accountCategories;

    /**
     * 決算書表示名（小カテゴリー）.
     */
    @JsonProperty(value = "account_groups")
    private List<SelectablesIndexResponseAccountGroupsItem> accountGroups;

    /**
     * Get the accountCategories value.
     *
     * @return the accountCategories value
     */
    public List<SelectablesIndexResponseAccountCategoriesItem> accountCategories() {
        return this.accountCategories;
    }

    /**
     * Set the accountCategories value.
     *
     * @param accountCategories the accountCategories value to set
     * @return the SelectablesIndexResponse object itself.
     */
    public SelectablesIndexResponse withAccountCategories(List<SelectablesIndexResponseAccountCategoriesItem> accountCategories) {
        this.accountCategories = accountCategories;
        return this;
    }

    /**
     * Get 決算書表示名（小カテゴリー）.
     *
     * @return the accountGroups value
     */
    public List<SelectablesIndexResponseAccountGroupsItem> accountGroups() {
        return this.accountGroups;
    }

    /**
     * Set 決算書表示名（小カテゴリー）.
     *
     * @param accountGroups the accountGroups value to set
     * @return the SelectablesIndexResponse object itself.
     */
    public SelectablesIndexResponse withAccountGroups(List<SelectablesIndexResponseAccountGroupsItem> accountGroups) {
        this.accountGroups = accountGroups;
        return this;
    }

}
