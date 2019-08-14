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
 * The WalletTxnsCreateResponse model.
 */
public class WalletTxnsCreateResponse {
    /**
     * The walletTxn property.
     */
    @JsonProperty(value = "wallet_txn", required = true)
    private WalletTxns walletTxn;

    /**
     * Get the walletTxn value.
     *
     * @return the walletTxn value
     */
    public WalletTxns walletTxn() {
        return this.walletTxn;
    }

    /**
     * Set the walletTxn value.
     *
     * @param walletTxn the walletTxn value to set
     * @return the WalletTxnsCreateResponse object itself.
     */
    public WalletTxnsCreateResponse withWalletTxn(WalletTxns walletTxn) {
        this.walletTxn = walletTxn;
        return this;
    }

}
