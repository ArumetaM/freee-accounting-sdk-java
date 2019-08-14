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
 * The Tag model.
 */
public class Tag {
    /**
     * タグID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * 事業所ID.
     */
    @JsonProperty(value = "company_id", required = true)
    private int companyId;

    /**
     * 名前(30文字以内).
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * ショートカット1 (255文字以内).
     */
    @JsonProperty(value = "shortcut1")
    private String shortcut1;

    /**
     * ショートカット2 (255文字以内).
     */
    @JsonProperty(value = "shortcut2")
    private String shortcut2;

    /**
     * Get タグID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set タグID.
     *
     * @param id the id value to set
     * @return the Tag object itself.
     */
    public Tag withId(int id) {
        this.id = id;
        return this;
    }

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
     * @return the Tag object itself.
     */
    public Tag withCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * Get 名前(30文字以内).
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set 名前(30文字以内).
     *
     * @param name the name value to set
     * @return the Tag object itself.
     */
    public Tag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get ショートカット1 (255文字以内).
     *
     * @return the shortcut1 value
     */
    public String shortcut1() {
        return this.shortcut1;
    }

    /**
     * Set ショートカット1 (255文字以内).
     *
     * @param shortcut1 the shortcut1 value to set
     * @return the Tag object itself.
     */
    public Tag withShortcut1(String shortcut1) {
        this.shortcut1 = shortcut1;
        return this;
    }

    /**
     * Get ショートカット2 (255文字以内).
     *
     * @return the shortcut2 value
     */
    public String shortcut2() {
        return this.shortcut2;
    }

    /**
     * Set ショートカット2 (255文字以内).
     *
     * @param shortcut2 the shortcut2 value to set
     * @return the Tag object itself.
     */
    public Tag withShortcut2(String shortcut2) {
        this.shortcut2 = shortcut2;
        return this;
    }

}
