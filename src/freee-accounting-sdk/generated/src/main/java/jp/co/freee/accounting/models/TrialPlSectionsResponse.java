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
 * The TrialPlSectionsResponse model.
 */
public class TrialPlSectionsResponse {
    /**
     * The trialPlSections property.
     */
    @JsonProperty(value = "trial_pl_sections", required = true)
    private TrialPlSectionsResponseTrialPlSections trialPlSections;

    /**
     * Get the trialPlSections value.
     *
     * @return the trialPlSections value
     */
    public TrialPlSectionsResponseTrialPlSections trialPlSections() {
        return this.trialPlSections;
    }

    /**
     * Set the trialPlSections value.
     *
     * @param trialPlSections the trialPlSections value to set
     * @return the TrialPlSectionsResponse object itself.
     */
    public TrialPlSectionsResponse withTrialPlSections(TrialPlSectionsResponseTrialPlSections trialPlSections) {
        this.trialPlSections = trialPlSections;
        return this;
    }

}
