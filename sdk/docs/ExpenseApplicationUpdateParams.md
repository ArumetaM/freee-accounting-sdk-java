

# ExpenseApplicationUpdateParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approvalFlowRouteId** | **Integer** | 申請経路ID&lt;br&gt; &lt;ul&gt;     &lt;li&gt;経費申請のステータスを申請中として作成する場合は、必ず指定してください。&lt;/li&gt;     &lt;li&gt;指定する申請経路IDは、申請経路APIを利用して取得してください。&lt;/li&gt;     &lt;li&gt;         未指定の場合は、基本経路を設定している事業所では基本経路が、基本経路を設定していない事業所では利用可能な申請経路の中から最初の申請経路が自動的に使用されます。         &lt;ul&gt;           &lt;li&gt;意図しない申請経路を持った経費申請の作成を防ぐために、使用する申請経路IDを指定することを推奨します。&lt;/li&gt;         &lt;/ul&gt;     &lt;/li&gt;     &lt;li&gt;         ベーシックプランの事業所では以下のデフォルトで用意された申請経路のみ指定できます         &lt;ul&gt;         &lt;li&gt;指定なし&lt;/li&gt;         &lt;li&gt;承認者を指定&lt;/li&gt;         &lt;/ul&gt;     &lt;/li&gt; &lt;/ul&gt;  |  [optional]
**approverId** | **Integer** | 承認者のユーザーID&lt;br&gt; 指定する承認者のユーザーIDは、申請経路APIを利用して取得してください。  |  [optional]
**companyId** | **Integer** | 事業所ID | 
**description** | **String** | 備考 (10000文字以内) |  [optional]
**draft** | **Boolean** | 経費申請のステータス&lt;br&gt; falseを指定した時は申請中（in_progress）で経費申請を更新します。&lt;br&gt; trueを指定した時は下書き（draft）で経費申請を更新します。&lt;br&gt; 未指定の時は下書きとみなして経費申請を更新します。  |  [optional]
**expenseApplicationLines** | [**List&lt;ExpenseApplicationUpdateParamsExpenseApplicationLines&gt;**](ExpenseApplicationUpdateParamsExpenseApplicationLines.md) |  | 
**issueDate** | **String** | 申請日 (yyyy-mm-dd)&lt;br&gt; 指定しない場合は当日の日付が登録されます。  |  [optional]
**sectionId** | **Integer** | 部門ID |  [optional]
**segment1TagId** | **Long** | セグメント１ID(法人向けプロフェッショナル, 法人向けエンタープライズプラン)&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt;  |  [optional]
**segment2TagId** | **Long** | セグメント２ID(法人向け エンタープライズプラン)&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt;  |  [optional]
**segment3TagId** | **Long** | セグメント３ID(法人向け エンタープライズプラン)&lt;br&gt; セグメントタグ一覧APIを利用して取得してください。&lt;br&gt; &lt;a href&#x3D;\&quot;https://support.freee.co.jp/hc/ja/articles/360020679611\&quot; target&#x3D;\&quot;_blank\&quot;&gt;セグメント（分析用タグ）の設定&lt;/a&gt;&lt;br&gt;  |  [optional]
**tagIds** | **List&lt;Integer&gt;** | メモタグID |  [optional]
**title** | **String** | 申請タイトル (250文字以内) | 



