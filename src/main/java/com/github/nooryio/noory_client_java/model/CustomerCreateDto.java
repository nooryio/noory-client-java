package com.github.nooryio.noory_client_java.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomerCreateDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-05T23:14:41.376Z")
public class CustomerCreateDto {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("externalID")
  private String externalID = null;

  /**
   * Three-letter ISO code for the default currency to associate with this customer. If charges or payments requests are created from this customer and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory
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
  private DefaultCurrencyEnum defaultCurrency = DefaultCurrencyEnum.SLL;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("autoSource")
  private Boolean autoSource = false;

  @JsonProperty("metadata")
  private Object metadata = null;

  public CustomerCreateDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Customer
   * @return name
  **/
  @ApiModelProperty(example = "Salton Massally", required = true, value = "Name of Customer")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerCreateDto externalID(String externalID) {
    this.externalID = externalID;
    return this;
  }

   /**
   * External ID of the customer. THis allows applications to associate their own ID with the customer record
   * @return externalID
  **/
  @ApiModelProperty(example = "1", value = "External ID of the customer. THis allows applications to associate their own ID with the customer record")
  public String getExternalID() {
    return externalID;
  }

  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }

  public CustomerCreateDto defaultCurrency(DefaultCurrencyEnum defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Three-letter ISO code for the default currency to associate with this customer. If charges or payments requests are created from this customer and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory
   * @return defaultCurrency
  **/
  @ApiModelProperty(example = "SLL", value = "Three-letter ISO code for the default currency to associate with this customer. If charges or payments requests are created from this customer and no currency specified, this default currency is used. Should be a currency supported by noory. See {link} for a list of currencies supported by Noory")
  public DefaultCurrencyEnum getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(DefaultCurrencyEnum defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public CustomerCreateDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the customer
   * @return email
  **/
  @ApiModelProperty(example = "smassally@idtlabs.xyz", value = "Email of the customer")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CustomerCreateDto phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone Number of the customer
   * @return phone
  **/
  @ApiModelProperty(example = "23277772772", value = "Phone Number of the customer")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CustomerCreateDto address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Customer&#39;s address
   * @return address
  **/
  @ApiModelProperty(value = "Customer's address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CustomerCreateDto locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Locale of the customer. Allows us to present content in the user&#39;s local language
   * @return locale
  **/
  @ApiModelProperty(example = "en_GB", value = "Locale of the customer. Allows us to present content in the user's local language")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public CustomerCreateDto account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Account ID that this customer record belongs to. Only admin can specify this
   * @return account
  **/
  @ApiModelProperty(value = "Account ID that this customer record belongs to. Only admin can specify this")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public CustomerCreateDto autoSource(Boolean autoSource) {
    this.autoSource = autoSource;
    return this;
  }

   /**
   * Automatically creates a source from the phone number of customer
   * @return autoSource
  **/
  @ApiModelProperty(value = "Automatically creates a source from the phone number of customer")
  public Boolean isAutoSource() {
    return autoSource;
  }

  public void setAutoSource(Boolean autoSource) {
    this.autoSource = autoSource;
  }

  public CustomerCreateDto metadata(Object metadata) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCreateDto customerCreateDto = (CustomerCreateDto) o;
    return Objects.equals(this.name, customerCreateDto.name) &&
        Objects.equals(this.externalID, customerCreateDto.externalID) &&
        Objects.equals(this.defaultCurrency, customerCreateDto.defaultCurrency) &&
        Objects.equals(this.email, customerCreateDto.email) &&
        Objects.equals(this.phone, customerCreateDto.phone) &&
        Objects.equals(this.address, customerCreateDto.address) &&
        Objects.equals(this.locale, customerCreateDto.locale) &&
        Objects.equals(this.account, customerCreateDto.account) &&
        Objects.equals(this.autoSource, customerCreateDto.autoSource) &&
        Objects.equals(this.metadata, customerCreateDto.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, externalID, defaultCurrency, email, phone, address, locale, account, autoSource, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCreateDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    autoSource: ").append(toIndentedString(autoSource)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

