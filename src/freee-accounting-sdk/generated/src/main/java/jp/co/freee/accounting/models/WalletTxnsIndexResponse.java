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
 * The WalletTxnsIndexResponse model.
 */
public class WalletTxnsIndexResponse {
    /**
     * The walletTxns property.
     */
    @JsonProperty(value = "wallet_txns", required = true)
    private List<WalletTxns> walletTxns;

    /**
     * Get the walletTxns value.
     *
     * @return the walletTxns value
     */
    public List<WalletTxns> walletTxns() {
        return this.walletTxns;
    }

    /**
     * Set the walletTxns value.
     *
     * @param walletTxns the walletTxns value to set
     * @return the WalletTxnsIndexResponse object itself.
     */
    public WalletTxnsIndexResponse withWalletTxns(List<WalletTxns> walletTxns) {
        this.walletTxns = walletTxns;
        return this;
    }

}
