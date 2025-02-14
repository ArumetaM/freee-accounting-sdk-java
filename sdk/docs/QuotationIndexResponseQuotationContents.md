

# QuotationIndexResponseQuotationContents


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountItemId** | **Integer** | 勘定科目ID | 
**accountItemName** | **String** | 勘定科目名 | 
**amount** | **Integer** | 内税/外税の判別とamountの税込み、税抜きについて &lt;ul&gt; &lt;li&gt;tax_entry_methodがexclusive (外税)の場合&lt;/li&gt; &lt;ul&gt; &lt;li&gt;amount: 消費税抜きの金額&lt;/li&gt; &lt;li&gt;vat: 消費税の金額&lt;/li&gt; &lt;/ul&gt; &lt;li&gt;tax_entry_methodがinclusive (内税)の場合&lt;/li&gt; &lt;ul&gt; &lt;li&gt;amount: 消費税込みの金額&lt;/li&gt; &lt;li&gt;vat: 消費税の金額&lt;/li&gt; &lt;/ul&gt; &lt;/ul&gt;  | 
**description** | **String** | 備考 | 
**id** | **Integer** | 見積内容ID | 
**itemId** | **Integer** | 品目ID | 
**itemName** | **String** | 品目 | 
**order** | **Integer** | 順序 | 
**qty** | **BigDecimal** | 数量 | 
**reducedVat** | **Boolean** | 軽減税率税区分（true: 対象、false: 対象外） | 
**sectionId** | **Integer** | 部門ID | 
**sectionName** | **String** | 部門 | 
**segment1TagId** | **Long** | セグメント１ID |  [optional]
**segment1TagName** | **String** | セグメント１ID |  [optional]
**segment2TagId** | **Long** | セグメント２ID |  [optional]
**segment2TagName** | **String** | セグメント２ |  [optional]
**segment3TagId** | **Long** | セグメント３ID |  [optional]
**segment3TagName** | **String** | セグメント３ |  [optional]
**tagIds** | **List&lt;Integer&gt;** |  | 
**tagNames** | **List&lt;String&gt;** |  | 
**taxCode** | **Integer** | 税区分コード | 
**type** | [**TypeEnum**](#TypeEnum) | 行の種類 | 
**unit** | **String** | 単位 | 
**unitPrice** | **BigDecimal** | 単価 | 
**vat** | **Integer** | 消費税額 | 



## Enum: TypeEnum

Name | Value
---- | -----
NORMAL | &quot;normal&quot;
DISCOUNT | &quot;discount&quot;
TEXT | &quot;text&quot;



