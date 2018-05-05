package com.github.nooryio.noory_client_java.api;

import com.github.nooryio.noory_client_java.invoker.ApiException;
import com.github.nooryio.noory_client_java.invoker.ApiClient;
import com.github.nooryio.noory_client_java.invoker.Configuration;
import com.github.nooryio.noory_client_java.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.github.nooryio.noory_client_java.model.Customer;
import com.github.nooryio.noory_client_java.model.CustomerCreateDto;
import com.github.nooryio.noory_client_java.model.CustomerUpdateDto;
import com.github.nooryio.noory_client_java.model.InlineResponse400;
import com.github.nooryio.noory_client_java.model.SourceCreateDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-05T23:14:41.376Z")
public class DevelopersApi {
  private ApiClient apiClient;

  public DevelopersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DevelopersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * adds a customer
   * Adds a customer
   * @param customerCreateDto Customer record to add (optional)
   * @return Customer
   * @throws ApiException if fails to make API call
   */
  public Customer addCustomer(CustomerCreateDto customerCreateDto) throws ApiException {
    Object localVarPostBody = customerCreateDto;
    
    // create path and map variables
    String localVarPath = "/customers";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Customer> localVarReturnType = new GenericType<Customer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a single customer record.
   * Delete a single customer record. Deletion does not remove the record from the database but soft deletes it by setting the deleted attribute to true. You can still access the customer record but it won&#39;t show up in listings 
   * @param id Unique ID of customer (required)
   * @return Customer
   * @throws ApiException if fails to make API call
   */
  public Customer deleteCustomer(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteCustomer");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Customer> localVarReturnType = new GenericType<Customer>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * GETs a single customer its external ID
   * GETs a single customer its external ID
   * @param externalId Unique externalId of customer (required)
   * @return Customer
   * @throws ApiException if fails to make API call
   */
  public Customer getByExternalID(String externalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'externalId' is set
    if (externalId == null) {
      throw new ApiException(400, "Missing the required parameter 'externalId' when calling getByExternalID");
    }
    
    // create path and map variables
    String localVarPath = "/customers/byExternalId/{externalId}"
      .replaceAll("\\{" + "externalId" + "\\}", apiClient.escapeString(externalId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Customer> localVarReturnType = new GenericType<Customer>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a single customer
   * Gets a single customer
   * @param id Unique ID of customer (required)
   * @return Customer
   * @throws ApiException if fails to make API call
   */
  public Customer getCustomer(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCustomer");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Customer> localVarReturnType = new GenericType<Customer>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a list of customers
   * Gets a list of customers; supports filtering, size, page by 
   * @param search pass an optional RSQL search string for looking up inventory (optional)
   * @param page page for pagination (optional)
   * @param size maximum number of records to return (optional)
   * @return List&lt;Customer&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Customer> listCustomers(String search, Integer page, Integer size) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/customers";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<Customer>> localVarReturnType = new GenericType<List<Customer>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Marks a customer payment source as default
   * Marks a customer payment source as default 
   * @param id Unique ID of customer (required)
   * @param sid ID of source we wish to make default (required)
   * @return Customer
   * @throws ApiException if fails to make API call
   */
  public Customer markCustomerSourceDefault(String id, String sid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling markCustomerSourceDefault");
    }
    
    // verify the required parameter 'sid' is set
    if (sid == null) {
      throw new ApiException(400, "Missing the required parameter 'sid' when calling markCustomerSourceDefault");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}/sources/{sid}/default"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "sid" + "\\}", apiClient.escapeString(sid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Customer> localVarReturnType = new GenericType<Customer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a customer
   * Update a customer&#39;s record 
   * @param id Unique ID of customer (required)
   * @param customerUpdateDto Customer record to update (optional)
   * @return Customer
   * @throws ApiException if fails to make API call
   */
  public Customer updateCustomer(String id, CustomerUpdateDto customerUpdateDto) throws ApiException {
    Object localVarPostBody = customerUpdateDto;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCustomer");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Customer> localVarReturnType = new GenericType<Customer>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Adds a payment source to customer
   * Adds a payment source to customer 
   * @param id Unique ID of customer (required)
   * @param sourceCreateDto Soruce record to create (optional)
   * @return Customer
   * @throws ApiException if fails to make API call
   */
  public Customer updateCustomerSources(String id, SourceCreateDto sourceCreateDto) throws ApiException {
    Object localVarPostBody = sourceCreateDto;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateCustomerSources");
    }
    
    // create path and map variables
    String localVarPath = "/customers/{id}/sources"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Customer> localVarReturnType = new GenericType<Customer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
