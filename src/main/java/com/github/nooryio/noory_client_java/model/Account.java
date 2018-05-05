package com.github.nooryio.noory_client_java.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.nooryio.noory_client_java.model.AccountVerification;
import com.github.nooryio.noory_client_java.model.PayoutSchedule;
import com.github.nooryio.noory_client_java.model.Source;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents merchant Noory accounts
 */
@ApiModel(description = "Represents merchant Noory accounts")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-05T23:14:41.376Z")
public class Account {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("businessName")
  private String businessName = null;

  @JsonProperty("businessEmail")
  private String businessEmail = null;

  @JsonProperty("businessPhone")
  private String businessPhone = null;

  @JsonProperty("businessAddress")
  private String businessAddress = null;

  @JsonProperty("businessUrl")
  private String businessUrl = null;

  @JsonProperty("businessLogo")
  private String businessLogo = null;

  /**
   * Two letter ISO country code of the country that the account is allowed to operate in e.g SL.
   */
  public enum CountryEnum {
    SL("SL");

    private String value;

    CountryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CountryEnum fromValue(String text) {
      for (CountryEnum b : CountryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("country")
  private CountryEnum country = null;

  /**
   * Three-letter ISO code for the default currency to associate with this Account. If charges or payments requests are created and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory
   */
  public enum DefaultCurrencyEnum {
    SLL("SLL");

    private String value;

    DefaultCurrencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DefaultCurrencyEnum fromValue(String text) {
      for (DefaultCurrencyEnum b : DefaultCurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("defaultCurrency")
  private DefaultCurrencyEnum defaultCurrency = null;

  @JsonProperty("sources")
  private List<Source> sources = null;

  @JsonProperty("timezone")
  private String timezone = null;

  @JsonProperty("hookEndpoint")
  private String hookEndpoint = null;

  @JsonProperty("hookEndpointSecret")
  private String hookEndpointSecret = null;

  /**
   * Medium via which events are sent to account
   */
  public enum HookDeliveryMediumEnum {
    SMS("sms"),
    
    WEBHOOK("webhook"),
    
    EMAIL("email");

    private String value;

    HookDeliveryMediumEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HookDeliveryMediumEnum fromValue(String text) {
      for (HookDeliveryMediumEnum b : HookDeliveryMediumEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("hookDeliveryMedium")
  private HookDeliveryMediumEnum hookDeliveryMedium = null;

  /**
   * Event Type
   */
  public enum EventsEnum {
    TRANSACTION_RECEIVED("transaction.received"),
    
    CHARGE_SUCCEEDED("charge.succeeded"),
    
    CHARGE_SUCCEEDED_PARTIAL("charge.succeeded.partial"),
    
    CHARGE_FAILED("charge.failed"),
    
    CHARGE_CANCELED("charge.canceled"),
    
    CHARGE_CREATED("charge.created"),
    
    CHARGE_REQUEUE("charge.requeue"),
    
    CHARGE_REQUESTED("charge.requested"),
    
    CHARGE_REFUNDED("charge.refunded"),
    
    CUSTOMER_CREATED("customer.created"),
    
    CUSTOMER_DELETED("customer.deleted"),
    
    CUSTOMER_UPDATED("customer.updated"),
    
    CUSTOMER_SUBSCRIPTION_CREATED("customer.subscription.created"),
    
    CUSTOMER_SUBSCRIPTION_DELETED("customer.subscription.deleted"),
    
    CUSTOMER_SUBSCRIPTION_CHARGED("customer.subscription.charged"),
    
    CUSTOMER_SUBSCRIPTION_UPDATED("customer.subscription.updated"),
    
    CUSTOMER_SUBSCRIPTION_ENDED("customer.subscription.ended"),
    
    PAYOUT_CANCELED("payout.canceled"),
    
    PAYOUT_CREATED("payout.created"),
    
    PAYOUT_FAILED("payout.failed"),
    
    PAYOUT_PAID("payout.paid"),
    
    PAYMENT_UPDATED("payment.updated"),
    
    PAYMENT_CANCELED("payment.canceled"),
    
    PAYMENT_CREATED("payment.created"),
    
    PAYMENT_FAILED("payment.failed"),
    
    PAYMENT_SUCCEEDED("payment.succeeded"),
    
    ACCOUNT_CASHIN("account.cashin"),
    
    ACCOUNT_CASHOUT("account.cashout"),
    
    ACCOUNT_DEACTIVATED("account.deactivated"),
    
    ACCOUNT_ACTIVATED("account.activated");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventsEnum fromValue(String text) {
      for (EventsEnum b : EventsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("events")
  private List<EventsEnum> events = null;

  @JsonProperty("verification")
  private AccountVerification verification = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("payoutSchedule")
  private PayoutSchedule payoutSchedule = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("deleted")
  private Boolean deleted = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("modified")
  private String modified = null;

  public Account id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of Account
   * @return id
  **/
  @ApiModelProperty(value = "ID of Account")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name of an account. Is expected to be unique across Noory and URL Safe so can not contain spaces or any other characters not suitable in URLS. This value is not only required but has to be lot less than 3 chars in length and not more than 10. 
   * @return name
  **/
  @ApiModelProperty(example = "IDTLABS", value = "Display name of an account. Is expected to be unique across Noory and URL Safe so can not contain spaces or any other characters not suitable in URLS. This value is not only required but has to be lot less than 3 chars in length and not more than 10. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * The publicly visible, human readable name of the business running this account.
   * @return businessName
  **/
  @ApiModelProperty(example = "iDT Labs Limited", value = "The publicly visible, human readable name of the business running this account.")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Account businessEmail(String businessEmail) {
    this.businessEmail = businessEmail;
    return this;
  }

   /**
   * Business Email address.
   * @return businessEmail
  **/
  @ApiModelProperty(example = "info@idtlabs.xyz", value = "Business Email address.")
  public String getBusinessEmail() {
    return businessEmail;
  }

  public void setBusinessEmail(String businessEmail) {
    this.businessEmail = businessEmail;
  }

  public Account businessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
    return this;
  }

   /**
   * Business phone number.
   * @return businessPhone
  **/
  @ApiModelProperty(example = "23277772772", value = "Business phone number.")
  public String getBusinessPhone() {
    return businessPhone;
  }

  public void setBusinessPhone(String businessPhone) {
    this.businessPhone = businessPhone;
  }

  public Account businessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
    return this;
  }

   /**
   * Business Address
   * @return businessAddress
  **/
  @ApiModelProperty(example = "5 Foday Drive, Hill Station, Freetown, Sierra Leone", value = "Business Address")
  public String getBusinessAddress() {
    return businessAddress;
  }

  public void setBusinessAddress(String businessAddress) {
    this.businessAddress = businessAddress;
  }

  public Account businessUrl(String businessUrl) {
    this.businessUrl = businessUrl;
    return this;
  }

   /**
   * Website of the business running the account if available
   * @return businessUrl
  **/
  @ApiModelProperty(example = "https://idtlabs.xyz", value = "Website of the business running the account if available")
  public String getBusinessUrl() {
    return businessUrl;
  }

  public void setBusinessUrl(String businessUrl) {
    this.businessUrl = businessUrl;
  }

  public Account businessLogo(String businessLogo) {
    this.businessLogo = businessLogo;
    return this;
  }

   /**
   * Base64 encoded logo of the business if available
   * @return businessLogo
  **/
  @ApiModelProperty(value = "Base64 encoded logo of the business if available")
  public String getBusinessLogo() {
    return businessLogo;
  }

  public void setBusinessLogo(String businessLogo) {
    this.businessLogo = businessLogo;
  }

  public Account country(CountryEnum country) {
    this.country = country;
    return this;
  }

   /**
   * Two letter ISO country code of the country that the account is allowed to operate in e.g SL.
   * @return country
  **/
  @ApiModelProperty(example = "SL", value = "Two letter ISO country code of the country that the account is allowed to operate in e.g SL.")
  public CountryEnum getCountry() {
    return country;
  }

  public void setCountry(CountryEnum country) {
    this.country = country;
  }

  public Account defaultCurrency(DefaultCurrencyEnum defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Three-letter ISO code for the default currency to associate with this Account. If charges or payments requests are created and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory
   * @return defaultCurrency
  **/
  @ApiModelProperty(example = "SLL", value = "Three-letter ISO code for the default currency to associate with this Account. If charges or payments requests are created and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory")
  public DefaultCurrencyEnum getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(DefaultCurrencyEnum defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public Account sources(List<Source> sources) {
    this.sources = sources;
    return this;
  }

  public Account addSourcesItem(Source sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Payment sources, banks/mobile money, associated with this account. Used to push payouts to account.
   * @return sources
  **/
  @ApiModelProperty(value = "Payment sources, banks/mobile money, associated with this account. Used to push payouts to account.")
  public List<Source> getSources() {
    return sources;
  }

  public void setSources(List<Source> sources) {
    this.sources = sources;
  }

  public Account timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone associated with account.
   * @return timezone
  **/
  @ApiModelProperty(example = "Africa/Freetown", value = "Timezone associated with account.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public Account hookEndpoint(String hookEndpoint) {
    this.hookEndpoint = hookEndpoint;
    return this;
  }

   /**
   * Endpoint to which to send event notifications.  Depending on the value of hookDeliveryMediumcan be either a valid phone identifier, https url, or email address 
   * @return hookEndpoint
  **/
  @ApiModelProperty(example = "https://integration.idtlabs.xyz", value = "Endpoint to which to send event notifications.  Depending on the value of hookDeliveryMediumcan be either a valid phone identifier, https url, or email address ")
  public String getHookEndpoint() {
    return hookEndpoint;
  }

  public void setHookEndpoint(String hookEndpoint) {
    this.hookEndpoint = hookEndpoint;
  }

  public Account hookEndpointSecret(String hookEndpointSecret) {
    this.hookEndpointSecret = hookEndpointSecret;
    return this;
  }

   /**
   * Authorization token included as the Authorization Header if delivery medium is URL
   * @return hookEndpointSecret
  **/
  @ApiModelProperty(value = "Authorization token included as the Authorization Header if delivery medium is URL")
  public String getHookEndpointSecret() {
    return hookEndpointSecret;
  }

  public void setHookEndpointSecret(String hookEndpointSecret) {
    this.hookEndpointSecret = hookEndpointSecret;
  }

  public Account hookDeliveryMedium(HookDeliveryMediumEnum hookDeliveryMedium) {
    this.hookDeliveryMedium = hookDeliveryMedium;
    return this;
  }

   /**
   * Medium via which events are sent to account
   * @return hookDeliveryMedium
  **/
  @ApiModelProperty(value = "Medium via which events are sent to account")
  public HookDeliveryMediumEnum getHookDeliveryMedium() {
    return hookDeliveryMedium;
  }

  public void setHookDeliveryMedium(HookDeliveryMediumEnum hookDeliveryMedium) {
    this.hookDeliveryMedium = hookDeliveryMedium;
  }

  public Account events(List<EventsEnum> events) {
    this.events = events;
    return this;
  }

  public Account addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Event types that user wishes to be notified of. For a list of valid values call GET /events/types 
   * @return events
  **/
  @ApiModelProperty(example = "\"charge.created\"", value = "Event types that user wishes to be notified of. For a list of valid values call GET /events/types ")
  public List<EventsEnum> getEvents() {
    return events;
  }

  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }

  public Account verification(AccountVerification verification) {
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @ApiModelProperty(value = "")
  public AccountVerification getVerification() {
    return verification;
  }

  public void setVerification(AccountVerification verification) {
    this.verification = verification;
  }

  public Account locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Locale for the account, important for providing information in the local language of the account.
   * @return locale
  **/
  @ApiModelProperty(example = "en_GB", value = "Locale for the account, important for providing information in the local language of the account.")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Account payoutSchedule(PayoutSchedule payoutSchedule) {
    this.payoutSchedule = payoutSchedule;
    return this;
  }

   /**
   * Get payoutSchedule
   * @return payoutSchedule
  **/
  @ApiModelProperty(value = "")
  public PayoutSchedule getPayoutSchedule() {
    return payoutSchedule;
  }

  public void setPayoutSchedule(PayoutSchedule payoutSchedule) {
    this.payoutSchedule = payoutSchedule;
  }

  public Account metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Used to store Arbitrary data
   * @return metadata
  **/
  @ApiModelProperty(value = "Used to store Arbitrary data")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public Account active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Account is active
   * @return active
  **/
  @ApiModelProperty(value = "Account is active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Account deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Account record has been soft deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "Account record has been soft deleted")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Account created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Date on which account was created
   * @return created
  **/
  @ApiModelProperty(example = "2018-01-01T12:34:03.000Z", value = "Date on which account was created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Account modified(String modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Date on which account was modified
   * @return modified
  **/
  @ApiModelProperty(example = "2018-01-01T12:34:03.000Z", value = "Date on which account was modified")
  public String getModified() {
    return modified;
  }

  public void setModified(String modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.businessName, account.businessName) &&
        Objects.equals(this.businessEmail, account.businessEmail) &&
        Objects.equals(this.businessPhone, account.businessPhone) &&
        Objects.equals(this.businessAddress, account.businessAddress) &&
        Objects.equals(this.businessUrl, account.businessUrl) &&
        Objects.equals(this.businessLogo, account.businessLogo) &&
        Objects.equals(this.country, account.country) &&
        Objects.equals(this.defaultCurrency, account.defaultCurrency) &&
        Objects.equals(this.sources, account.sources) &&
        Objects.equals(this.timezone, account.timezone) &&
        Objects.equals(this.hookEndpoint, account.hookEndpoint) &&
        Objects.equals(this.hookEndpointSecret, account.hookEndpointSecret) &&
        Objects.equals(this.hookDeliveryMedium, account.hookDeliveryMedium) &&
        Objects.equals(this.events, account.events) &&
        Objects.equals(this.verification, account.verification) &&
        Objects.equals(this.locale, account.locale) &&
        Objects.equals(this.payoutSchedule, account.payoutSchedule) &&
        Objects.equals(this.metadata, account.metadata) &&
        Objects.equals(this.active, account.active) &&
        Objects.equals(this.deleted, account.deleted) &&
        Objects.equals(this.created, account.created) &&
        Objects.equals(this.modified, account.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, businessName, businessEmail, businessPhone, businessAddress, businessUrl, businessLogo, country, defaultCurrency, sources, timezone, hookEndpoint, hookEndpointSecret, hookDeliveryMedium, events, verification, locale, payoutSchedule, metadata, active, deleted, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessEmail: ").append(toIndentedString(businessEmail)).append("\n");
    sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    businessUrl: ").append(toIndentedString(businessUrl)).append("\n");
    sb.append("    businessLogo: ").append(toIndentedString(businessLogo)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    hookEndpoint: ").append(toIndentedString(hookEndpoint)).append("\n");
    sb.append("    hookEndpointSecret: ").append(toIndentedString(hookEndpointSecret)).append("\n");
    sb.append("    hookDeliveryMedium: ").append(toIndentedString(hookDeliveryMedium)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    payoutSchedule: ").append(toIndentedString(payoutSchedule)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

