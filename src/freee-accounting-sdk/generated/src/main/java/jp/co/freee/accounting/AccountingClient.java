/**
 * Copyright (c) freee K.K. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package jp.co.freee.accounting;

import com.microsoft.rest.RestClient;

/**
 * The interface for AccountingClient class.
 */
public interface AccountingClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://api.freee.co.jp/api/1";

    /**
     * Gets the Partners object to access its operations.
     * @return the Partners object.
     */
    Partners partners();

    /**
     * Gets the Selectables object to access its operations.
     * @return the Selectables object.
     */
    Selectables selectables();

    /**
     * Gets the AccountItems object to access its operations.
     * @return the AccountItems object.
     */
    AccountItems accountItems();

    /**
     * Gets the Tags object to access its operations.
     * @return the Tags object.
     */
    Tags tags();

    /**
     * Gets the Sections object to access its operations.
     * @return the Sections object.
     */
    Sections sections();

    /**
     * Gets the Invoices object to access its operations.
     * @return the Invoices object.
     */
    Invoices invoices();

    /**
     * Gets the Deals object to access its operations.
     * @return the Deals object.
     */
    Deals deals();

    /**
     * Gets the Renews object to access its operations.
     * @return the Renews object.
     */
    Renews renews();

    /**
     * Gets the Payments object to access its operations.
     * @return the Payments object.
     */
    Payments payments();

    /**
     * Gets the ManualJournals object to access its operations.
     * @return the ManualJournals object.
     */
    ManualJournals manualJournals();

    /**
     * Gets the Users object to access its operations.
     * @return the Users object.
     */
    Users users();

    /**
     * Gets the Companies object to access its operations.
     * @return the Companies object.
     */
    Companies companies();

    /**
     * Gets the Items object to access its operations.
     * @return the Items object.
     */
    Items items();

    /**
     * Gets the Taxes object to access its operations.
     * @return the Taxes object.
     */
    Taxes taxes();

    /**
     * Gets the Walletables object to access its operations.
     * @return the Walletables object.
     */
    Walletables walletables();

    /**
     * Gets the Banks object to access its operations.
     * @return the Banks object.
     */
    Banks banks();

    /**
     * Gets the Transfers object to access its operations.
     * @return the Transfers object.
     */
    Transfers transfers();

    /**
     * Gets the WalletTxns object to access its operations.
     * @return the WalletTxns object.
     */
    WalletTxns walletTxns();

    /**
     * Gets the Journals object to access its operations.
     * @return the Journals object.
     */
    Journals journals();

    /**
     * Gets the TrialBalances object to access its operations.
     * @return the TrialBalances object.
     */
    TrialBalances trialBalances();

    /**
     * Gets the Receipts object to access its operations.
     * @return the Receipts object.
     */
    Receipts receipts();

    /**
     * Gets the ExpenseApplications object to access its operations.
     * @return the ExpenseApplications object.
     */
    ExpenseApplications expenseApplications();

    /**
     * Gets the ExpenseApplicationLineTemplates object to access its operations.
     * @return the ExpenseApplicationLineTemplates object.
     */
    ExpenseApplicationLineTemplates expenseApplicationLineTemplates();

    /**
     * Gets the SegmentTags object to access its operations.
     * @return the SegmentTags object.
     */
    SegmentTags segmentTags();

}
