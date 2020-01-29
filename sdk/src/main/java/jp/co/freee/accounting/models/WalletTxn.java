/*
 * freee API
 *  <h1 id=\"freee_api\">freee API</h1> <hr /> <h2 id=\"\">スタートガイド</h2> <p>1. セットアップ</p> <ol> <ul><li><a href=\"https://support.freee.co.jp/hc/ja/articles/202847230\" class=\"external-link\" rel=\"nofollow\">freeeアカウント（無料）</a>を<a href=\"https://secure.freee.co.jp/users/sign_up\" class=\"external-link\" rel=\"nofollow\">作成</a>します（すでにお持ちの場合は次へ）</li><li><a href=\"https://app.secure.freee.co.jp/developers/demo_companies/description\" class=\"external-link\" rel=\"nofollow\">開発者向け事業所・環境を作成</a>します</li><li><span><a href=\"https://app.secure.freee.co.jp/developers/applications\" class=\"external-link\" rel=\"nofollow\">前のステップで作成した事業所を選択してfreeeアプリを追加</a>します</span></li><li>Client IDをCopyしておきます</li> </ul> </ol>  <p>2. 実際にAPIを叩いてみる（ブラウザからAPIのレスポンスを確認する）</p> <ol> <ul><li><span><span>以下のURLの●をclient_idに入れ替えて<a href=\"https://app.secure.freee.co.jp/developers/tutorials/3-%E3%82%A2%E3%82%AF%E3%82%BB%E3%82%B9%E3%83%88%E3%83%BC%E3%82%AF%E3%83%B3%E3%82%92%E5%8F%96%E5%BE%97%E3%81%99%E3%82%8B#%E8%AA%8D%E5%8F%AF%E3%82%B3%E3%83%BC%E3%83%89%E3%82%92%E5%8F%96%E5%BE%97%E3%81%99%E3%82%8B\" class=\"external-link\" rel=\"nofollow\">アクセストークンを取得</a>します</span></span><ul><li><span><span><pre><code>https://accounts.secure.freee.co.jp/public_api/authorize?client_id=●&amp;redirect_uri=urn%3Aietf%3Awg%3Aoauth%3A2.0%3Aoob&amp;response_type=token</a></code></pre></span></span></li></ul></li><li><span><a href=\"https://developer.freee.co.jp/docs/accounting/reference#/%E9%80%A3%E7%B5%A1%E5%85%88\" class=\"external-link\" rel=\"nofollow\">APIリファレンス</a>で<code>Authorize</code>を押下します</span></li><li><span>アクセストークン<span><span>を入力して</span></span>&nbsp;もう一度<span><code>Authorize</code>を押下して<code>Close</code>を押下します</span></span></li><li>リファレンス内のCompanies（事業所）に移動し、<code>Try it out</code>を押下し、<code>Execute</code>を押下します</li><li>Response bodyを参照し、事業所ID(id属性)を活用して、Companies以外のエンドポイントでどのようなデータのやりとりできるのか確認します</li></ul> </ol> <p>3. 連携を実装する</p> <ol> <ul><li><a href=\"https://developer.freee.co.jp/tips\" class=\"external-link\" rel=\"nofollow\">API TIPS</a>を参考に、ユースケースごとの連携の概要を学びます。<span>例えば</span><span>&nbsp;</span><a href=\"https://developer.freee.co.jp/tips/how-to-cooperate-salesmanegement-system\" class=\"external-link\" rel=\"nofollow\">SFA、CRM、販売管理システムから会計freeeへの連携</a>や<a href=\"https://developer.freee.co.jp/tips/how-to-cooperate-excel-and-spreadsheet\" class=\"external-link\" rel=\"nofollow\">エクセルやgoogle spreadsheetからの連携</a>です</li><li>実利用向け事業所がすでにある場合は利用、ない場合は作成します（セットアップで作成したのは開発者向け環境のため活用不可）</li><li><a href=\"https://developer.freee.co.jp/docs/accounting/reference\" class=\"external-link\" rel=\"nofollow\">API documentation</a><span>&nbsp;を参照し、躓いた場合は</span><span>&nbsp;</span><a href=\"https://developer.freee.co.jp/community/forum/community\" class=\"external-link\" rel=\"nofollow\">Community</a><span>&nbsp;で質問してみましょう</span></li></ul> </ol> <p>アプリケーションの登録方法や認証方法、またはAPIの活用方法でご不明な点がある場合は<a href=\"https://support.freee.co.jp/hc/ja/sections/115000030743\">ヘルプセンター</a>もご確認ください</p> <hr /> <h2 id=\"_2\">仕様</h2>  <h3 id=\"api\">APIエンドポイント</h3>  <p>https://api.freee.co.jp/ (httpsのみ)</p>  <h3 id=\"_3\">認証方式</h3>  <p><a href=\"http://tools.ietf.org/html/rfc6749\">OAuth2</a>に対応</p>  <ul> <li>Authorization Code Flow (Webアプリ向け)</li>  <li>Implicit Flow (Mobileアプリ向け)</li> </ul>  <h3 id=\"_4\">認証エンドポイント</h3>  <p>https://accounts.secure.freee.co.jp/</p>  <ul> <li>authorize : https://accounts.secure.freee.co.jp/public_api/authorize</li>  <li>token : https://accounts.secure.freee.co.jp/public_api/token</li> </ul>  <h3 id=\"_5\">アクセストークンのリフレッシュ</h3>  <p>認証時に得たrefresh_token を使ってtoken の期限をリフレッシュして新規に発行することが出来ます。</p>  <p>grant_type=refresh_token で https://accounts.secure.freee.co.jp/public_api/token にアクセスすればリフレッシュされます。</p>  <p>e.g.)</p>  <p>POST: https://accounts.secure.freee.co.jp/public_api/token</p>  <p>params: grant_type=refresh_token&amp;client_id=UID&amp;client_secret=SECRET&amp;refresh_token=REFRESH_TOKEN</p>  <p>詳細は<a href=\"https://github.com/applicake/doorkeeper/wiki/Enable-Refresh-Token-Credentials#flow\">refresh_token</a>を参照下さい。</p>  <h3 id=\"_6\">アクセストークンの破棄</h3>  <p>認証時に得たaccess_tokenまたはrefresh_tokenを使って、tokenを破棄することができます。 token=access_tokenまたはtoken=refresh_tokenでhttps://accounts.secure.freee.co.jp/public_api/revokeにアクセスすると破棄されます。token_type_hintでaccess_tokenまたはrefresh_tokenを陽に指定できます。</p>  <p>e.g.)</p>  <p>POST: https://accounts.secure.freee.co.jp/public_api/revoke</p>  <p>params: token=ACCESS_TOKEN</p>  <p>または</p>  <p>params: token=REFRESH_TOKEN</p>  <p>または</p>  <p>params: token=ACCESS_TOKEN&amp;token_type_hint=access_token</p>  <p>または</p>  <p>params: token=REFRESH_TOKEN&amp;token_type_hint=refresh_token</p>  <p>詳細は <a href=\"https://tools.ietf.org/html/rfc7009\">OAuth 2.0 Token revocation</a> をご参照ください。</p>  <h3 id=\"_7\">データフォーマット</h3>  <p>リクエスト、レスポンスともにJSON形式をサポート</p>  <h3 id=\"_8\">共通レスポンスヘッダー</h3>  <p>すべてのAPIのレスポンスには以下のHTTPヘッダーが含まれます。</p>  <ul> <li> <p>X-Freee-Request-ID</p> <ul> <li>各リクエスト毎に発行されるID</li> </ul> </li> </ul>  <h3 id=\"_9\">共通エラーレスポンス</h3>  <ul> <li> <p>ステータスコードはレスポンス内のJSONに含まれる他、HTTPヘッダにも含まれる</p> </li>  <li> <p>type</p>  <ul> <li>status : HTTPステータスコードの説明</li>  <li>validation : エラーの詳細の説明（開発者向け）</li> </ul> </li> </ul>  <p>レスポンスの例</p>  <pre><code>  {     &quot;status_code&quot; : 400,     &quot;errors&quot; : [       {         &quot;type&quot; : &quot;status&quot;,         &quot;messages&quot; : [&quot;不正なリクエストです。&quot;]       },       {         &quot;type&quot; : &quot;validation&quot;,         &quot;messages&quot; : [&quot;Date は不正な日付フォーマットです。入力例：2013-01-01&quot;]       }     ]   }</code></pre> <hr /> <h2 id=\"_10\">連絡先</h2>  <p>ご不明点、ご要望等は <a href=\"https://support.freee.co.jp/hc/ja/requests/new\">freee サポートデスクへのお問い合わせフォーム</a> からご連絡ください。</p> <hr />&copy; Since 2013 freee K.K.
 *
 * The version of the OpenAPI document: v1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.freee.accounting.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WalletTxn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:09:26.385+09:00[Asia/Tokyo]")
public class WalletTxn {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DUE_AMOUNT = "due_amount";
  @SerializedName(SERIALIZED_NAME_DUE_AMOUNT)
  private Integer dueAmount;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  /**
   * 入金／出金 (入金: income, 出金: expense)
   */
  @JsonAdapter(EntrySideEnum.Adapter.class)
  public enum EntrySideEnum {
    INCOME("income"),
    
    EXPENSE("expense");

    private String value;

    EntrySideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntrySideEnum fromValue(String value) {
      for (EntrySideEnum b : EntrySideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntrySideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntrySideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntrySideEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntrySideEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTRY_SIDE = "entry_side";
  @SerializedName(SERIALIZED_NAME_ENTRY_SIDE)
  private EntrySideEnum entrySide;

  /**
   * 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet)
   */
  @JsonAdapter(WalletableTypeEnum.Adapter.class)
  public enum WalletableTypeEnum {
    BANK_ACCOUNT("bank_account"),
    
    CREDIT_CARD("credit_card"),
    
    WALLET("wallet");

    private String value;

    WalletableTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WalletableTypeEnum fromValue(String value) {
      for (WalletableTypeEnum b : WalletableTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WalletableTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WalletableTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WalletableTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WalletableTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WALLETABLE_TYPE = "walletable_type";
  @SerializedName(SERIALIZED_NAME_WALLETABLE_TYPE)
  private WalletableTypeEnum walletableType;

  public static final String SERIALIZED_NAME_WALLETABLE_ID = "walletable_id";
  @SerializedName(SERIALIZED_NAME_WALLETABLE_ID)
  private Integer walletableId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;


  public WalletTxn id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 明細ID
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "明細ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WalletTxn companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 事業所ID
   * minimum: 1
   * maximum: 999999999999
   * @return companyId
  **/
  @ApiModelProperty(example = "1", required = true, value = "事業所ID")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public WalletTxn date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 取引日(yyyy-mm-dd)
   * @return date
  **/
  @ApiModelProperty(example = "2018-01-01", required = true, value = "取引日(yyyy-mm-dd)")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public WalletTxn amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 取引金額
   * @return amount
  **/
  @ApiModelProperty(example = "5000", required = true, value = "取引金額")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public WalletTxn dueAmount(Integer dueAmount) {
    
    this.dueAmount = dueAmount;
    return this;
  }

   /**
   * 未決済金額
   * @return dueAmount
  **/
  @ApiModelProperty(example = "0", required = true, value = "未決済金額")

  public Integer getDueAmount() {
    return dueAmount;
  }


  public void setDueAmount(Integer dueAmount) {
    this.dueAmount = dueAmount;
  }


  public WalletTxn balance(Integer balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 残高(銀行口座等)
   * @return balance
  **/
  @ApiModelProperty(example = "10000", required = true, value = "残高(銀行口座等)")

  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public WalletTxn entrySide(EntrySideEnum entrySide) {
    
    this.entrySide = entrySide;
    return this;
  }

   /**
   * 入金／出金 (入金: income, 出金: expense)
   * @return entrySide
  **/
  @ApiModelProperty(example = "income", required = true, value = "入金／出金 (入金: income, 出金: expense)")

  public EntrySideEnum getEntrySide() {
    return entrySide;
  }


  public void setEntrySide(EntrySideEnum entrySide) {
    this.entrySide = entrySide;
  }


  public WalletTxn walletableType(WalletableTypeEnum walletableType) {
    
    this.walletableType = walletableType;
    return this;
  }

   /**
   * 口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet)
   * @return walletableType
  **/
  @ApiModelProperty(example = "bank_account", required = true, value = "口座区分 (銀行口座: bank_account, クレジットカード: credit_card, 現金: wallet)")

  public WalletableTypeEnum getWalletableType() {
    return walletableType;
  }


  public void setWalletableType(WalletableTypeEnum walletableType) {
    this.walletableType = walletableType;
  }


  public WalletTxn walletableId(Integer walletableId) {
    
    this.walletableId = walletableId;
    return this;
  }

   /**
   * 口座ID
   * @return walletableId
  **/
  @ApiModelProperty(example = "1", required = true, value = "口座ID")

  public Integer getWalletableId() {
    return walletableId;
  }


  public void setWalletableId(Integer walletableId) {
    this.walletableId = walletableId;
  }


  public WalletTxn description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 備考
   * @return description
  **/
  @ApiModelProperty(example = "振込 カ）ABC", required = true, value = "備考")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WalletTxn status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * 明細のステータス（消込待ち: 1, 消込済み: 2, 無視: 3, 消込中: 4）
   * @return status
  **/
  @ApiModelProperty(required = true, value = "明細のステータス（消込待ち: 1, 消込済み: 2, 無視: 3, 消込中: 4）")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTxn walletTxn = (WalletTxn) o;
    return Objects.equals(this.id, walletTxn.id) &&
        Objects.equals(this.companyId, walletTxn.companyId) &&
        Objects.equals(this.date, walletTxn.date) &&
        Objects.equals(this.amount, walletTxn.amount) &&
        Objects.equals(this.dueAmount, walletTxn.dueAmount) &&
        Objects.equals(this.balance, walletTxn.balance) &&
        Objects.equals(this.entrySide, walletTxn.entrySide) &&
        Objects.equals(this.walletableType, walletTxn.walletableType) &&
        Objects.equals(this.walletableId, walletTxn.walletableId) &&
        Objects.equals(this.description, walletTxn.description) &&
        Objects.equals(this.status, walletTxn.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, date, amount, dueAmount, balance, entrySide, walletableType, walletableId, description, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTxn {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dueAmount: ").append(toIndentedString(dueAmount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    entrySide: ").append(toIndentedString(entrySide)).append("\n");
    sb.append("    walletableType: ").append(toIndentedString(walletableType)).append("\n");
    sb.append("    walletableId: ").append(toIndentedString(walletableId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

