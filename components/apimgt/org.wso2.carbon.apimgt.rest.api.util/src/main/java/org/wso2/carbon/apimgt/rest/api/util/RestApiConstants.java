/*
 *  Copyright WSO2 Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.carbon.apimgt.rest.api.util;

public final class RestApiConstants {

    public static final String APPLICATION_JSON = "application/json";

    public static final String API_ID_DELIMITER = "-";

    //todo better to take from cxf level
    public static final String RESOURCE_PATH_APIS = "/apis";
    public static final String RESOURCE_PATH_APPLICATIONS = "/applications";
    public static final String SERVER_URL = "/applications";
    public static final String SERVER_USER_NAME = "/applications";
    public static final String SERVER_PASSWORD = "/applications";
    public static final String RESOURCE_PATH_SUBSCRIPTIONS = "/subscriptions";
    public static final String QUERY_PARAM = "{query}";
    public static final String LIMIT_PARAM = "{limit}";
    public static final String OFFSET_PARAM = "{offset}";
    public static final String TYPE_PARAM = "{type}";
    public static final String SUBSCRIBER_PARAM = "{subscriber}";
    public static final String GROUPID_PARAM = "{groupId}";
    public static final String APIID_PARAM = "{apiId}";
    public static final String APPLICATIONID_PARAM = "{applicationId}";

    public static final int PAGINATION_LIMIT_DEFAULT = 25;
    public static final int PAGINATION_OFFSET_DEFAULT = 0;
    public static final String PAGINATION_NEXT_OFFSET = "next_offset";
    public static final String PAGINATION_NEXT_LIMIT = "next_limit";
    public static final String PAGINATION_PREVIOUS_OFFSET = "previous_offset";
    public static final String PAGINATION_PREVIOUS_LIMIT = "previous_limit";

    public static final String APIS_GET_PAGINATION_URL =
            RESOURCE_PATH_APIS + "?limit=" + LIMIT_PARAM + "&offset=" + OFFSET_PARAM + "&query=" + QUERY_PARAM
                    + "&type=" + TYPE_PARAM;

    public static final String APPLICATIONS_GET_PAGINATION_URL =
            RESOURCE_PATH_APPLICATIONS + "?limit=" + LIMIT_PARAM + "&offset=" + OFFSET_PARAM + "&subscriber="
                    + SUBSCRIBER_PARAM + "&groupId=" + GROUPID_PARAM;

    public static final String SUBSCRIPTIONS_GET_PAGINATION_URL_APIID =
            RESOURCE_PATH_APPLICATIONS + "?limit=" + LIMIT_PARAM + "&offset=" + OFFSET_PARAM + "&apiId="
                    + APIID_PARAM;

    public static final String SUBSCRIPTIONS_GET_PAGINATION_URL_APPLICATIONID =
            RESOURCE_PATH_APPLICATIONS + "?limit=" + LIMIT_PARAM + "&offset=" + OFFSET_PARAM + "&applicationId="
                    + APPLICATIONID_PARAM;

    public static final String API_VERSION_PARAM="{version}";

    public static final String STORE_LOGINURL = "StoreURL";
    public static final String ADD_NEW_APPLICATIONURL = "AddNewApplicationURL";
    public static final String ADD_NEW_SUBSCRIPTIONSURL = "SubscriptionsURL";
    public static final String CREATE_SEMIMANUAL_APPLICATIONURL ="CreateSemiManualURL";
    public static final String GET_APPLICATIONBYNAME = "GetApplicationByName";
    public static final String
            ALL_SUBSCRIPTIONS_BY_APPLICATIONNAMEURL = "GetAllSubscriptionsByApplicationNameURL";
    public static final String DCR_SCOPENAME = "DCR_Scopename";
    public static final String USER_ID = "user_id";
    public static final String TOKEN = "token";
    public static final String BASIC = "Basic";
    public static final String INTROSPECTION_URL = "IntrospectURL";
    public static final String INTROSPECTION_SECRET = "IntrospectSecret";
    public static final String OIDCDCR_ENDPOINT = "OIDCDcrEndpoint";
    public static final String RESOURCE_REGISTRATION_ENDPOINT = "ResourceRegistrationEndpoint";
    public static final String API_PROVIDER = "apiProvider";
    public static final String API_NAME = "apiName";
    public static final String API_VERSION ="apiVersion";
    public static final String SUBSCRIPTIONS ="subscriptions";
    public static final String APIS = "apis";
    public static final String CLIENT_NAME = "client_name";
    public static final String APIM_PAYLOAD = "apimPayLoad";
    public static final String USER_NAME = "userName";
    public static final String SOAP_ENV_BODY = "soapenv:Body";
    public static final String APPLICATION_TIER = "applicationTier";
    public static final String KEY_TYPE = "key_type";
    public static final String APPLICATION_DESC = "applicationDescriptions";
    public static final String APPLICATIONS = "applications";
    public static final String APPLICATION = "application";
    public static final String NAME = "name";
    public static final String DCR_FAULT = "_dcr_fault_";
    public static final String DCR_PAYLOAD = "dcr_payload";
    public static final String JSESSION_ID = "JSESSIONID";
    public static final String ACTION = "action";
    public static final String TIER = "tier";
    public static final String CALLBACK_URL = "callbackUrl";
    public static final String DESCRIPTION = "description";
    public static final String VERSION = "version";
    public static final String PROVIDER = "provider";
    public static final String APPLICATION_NAME = "applicationName";
    public static final String UTF_8 = "UTF-8";
    public static final String CLIENT_SECRET = "client_secret";
    public static final String REGISTRATION_CLIENT_URI = "registration_client_uri";
    public static final String REGISTRAION_ACCESS_TOKEN = "registration_access_token";
    public static final String COOKIE = "Cookie";
    public static final String JSON_PARAMS = "jsonParams";
    public static final String CLIENT_ID = "client_id";
    public static final String USERNAME = "username";
    public static final String AUTHORIZATION = "Authorization";
    public static final String BEARER_SPACE = "Bearer ";
    public static final String APPLICATION_JSON_CONTENT_TYPE = "application/json";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String SCOPES = "scopes";
    public static final String SCOPE = "scope";
    public static final String SPACE_CHARACTER = " ";
    public static final String URL_ENCODED_CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static final String API_ID = "apiId";
    public static final String RESOURCE_ID = "resourceId";
}
