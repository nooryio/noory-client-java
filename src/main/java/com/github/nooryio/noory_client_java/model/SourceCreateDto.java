package com.github.nooryio.noory_client_java.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Source objects allow you to accept a variety of payment methods. They represent a customer&#39;s payment instrument and can be used with the Noory API just like a card object once chargeable, they can be charged, or attached to customers. 
 */
@ApiModel(description = "Source objects allow you to accept a variety of payment methods. They represent a customer's payment instrument and can be used with the Noory API just like a card object once chargeable, they can be charged, or attached to customers. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-05T23:14:41.376Z")
public class SourceCreateDto {
  @JsonProperty("name")
  private String name = null;

  /**
   * Three-letter ISO code for the currency of this payment Source
   */
  public enum CurrencyEnum {
    SLL("SLL");

    private String value;

    CurrencyEnum(String value) {
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
    public static CurrencyEnum fromValue(String text) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("currency")
  private CurrencyEnum currency = null;

  /**
   * Nature of the source. Can be either of Card, Bank Account, Mobile Money
   */
  public enum TypeEnum {
    CARD("card"),
    
    NOORY("noory"),
    
    BANK_ACCOUNT("bank_account"),
    
    MOBILE_MONEY("mobile_money");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  /**
   * Issuer that supports/issued this payment source.
   */
  public enum IssuerEnum {
    AFRIMONEY("afrimoney"),
    
    ORANGEMONEY("orangeMoney"),
    
    NOORY("noory");

    private String value;

    IssuerEnum(String value) {
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
    public static IssuerEnum fromValue(String text) {
      for (IssuerEnum b : IssuerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("issuer")
  private IssuerEnum issuer = null;

  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  public SourceCreateDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Human readble name of Source
   * @return name
  **/
  @ApiModelProperty(example = "Salton Massally, AfriMoney Wallet", required = true, value = "Human readble name of Source")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SourceCreateDto currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Three-letter ISO code for the currency of this payment Source
   * @return currency
  **/
  @ApiModelProperty(example = "SLL", value = "Three-letter ISO code for the currency of this payment Source")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public SourceCreateDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Nature of the source. Can be either of Card, Bank Account, Mobile Money
   * @return type
  **/
  @ApiModelProperty(example = "mobile_money", required = true, value = "Nature of the source. Can be either of Card, Bank Account, Mobile Money")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SourceCreateDto issuer(IssuerEnum issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Issuer that supports/issued this payment source.
   * @return issuer
  **/
  @ApiModelProperty(example = "afrimoney", required = true, value = "Issuer that supports/issued this payment source.")
  public IssuerEnum getIssuer() {
    return issuer;
  }

  public void setIssuer(IssuerEnum issuer) {
    this.issuer = issuer;
  }

  public SourceCreateDto identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Primary account number for source. For mobile money this will be a phone number and for banks an account number 
   * @return identifier
  **/
  @ApiModelProperty(example = "23277772772", required = true, value = "Primary account number for source. For mobile money this will be a phone number and for banks an account number ")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public SourceCreateDto metadata(Object metadata) {
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
    SourceCreateDto sourceCreateDto = (SourceCreateDto) o;
    return Objects.equals(this.name, sourceCreateDto.name) &&
        Objects.equals(this.currency, sourceCreateDto.currency) &&
        Objects.equals(this.type, sourceCreateDto.type) &&
        Objects.equals(this.issuer, sourceCreateDto.issuer) &&
        Objects.equals(this.identifier, sourceCreateDto.identifier) &&
        Objects.equals(this.metadata, sourceCreateDto.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, currency, type, issuer, identifier, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceCreateDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

