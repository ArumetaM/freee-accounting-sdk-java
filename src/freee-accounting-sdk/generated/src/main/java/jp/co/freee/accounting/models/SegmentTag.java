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
 * The SegmentTag model.
 */
public class SegmentTag {
    /**
     * セグメントタグID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * セグメントタグ.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * 備考.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /**
     * ショートカット１ (20文字以内).
     */
    @JsonProperty(value = "shortcut1", required = true)
    private String shortcut1;

    /**
     * ショートカット２ (20文字以内).
     */
    @JsonProperty(value = "shortcut2", required = true)
    private String shortcut2;

    /**
     * Get セグメントタグID.
     *
     * @return the id value
     */
    public int id() {
        return this.id;
    }

    /**
     * Set セグメントタグID.
     *
     * @param id the id value to set
     * @return the SegmentTag object itself.
     */
    public SegmentTag withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get セグメントタグ.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set セグメントタグ.
     *
     * @param name the name value to set
     * @return the SegmentTag object itself.
     */
    public SegmentTag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get 備考.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set 備考.
     *
     * @param description the description value to set
     * @return the SegmentTag object itself.
     */
    public SegmentTag withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get ショートカット１ (20文字以内).
     *
     * @return the shortcut1 value
     */
    public String shortcut1() {
        return this.shortcut1;
    }

    /**
     * Set ショートカット１ (20文字以内).
     *
     * @param shortcut1 the shortcut1 value to set
     * @return the SegmentTag object itself.
     */
    public SegmentTag withShortcut1(String shortcut1) {
        this.shortcut1 = shortcut1;
        return this;
    }

    /**
     * Get ショートカット２ (20文字以内).
     *
     * @return the shortcut2 value
     */
    public String shortcut2() {
        return this.shortcut2;
    }

    /**
     * Set ショートカット２ (20文字以内).
     *
     * @param shortcut2 the shortcut2 value to set
     * @return the SegmentTag object itself.
     */
    public SegmentTag withShortcut2(String shortcut2) {
        this.shortcut2 = shortcut2;
        return this;
    }

}
