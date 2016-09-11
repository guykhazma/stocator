/**
 * (C) Copyright IBM Corp. 2015, 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.ibm.stocator.fs.swift.http;

public class ConnectionConfiguration {

  public static final int DEFAULT_MAX_PER_ROUTE = 50;
  public static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 50;
  public static final int DEFAULT_SOCKET_TIMEOUT = 1000;
  public static final int DEFAULT_EXECUTION_RETRY = 100;
  public static final int DEFAULT_REQUEST_CONNECT_TIMEOUT = 5000;
  public static final int DEFAULT_REQUEST_CONNECTION_TIMEOUT = 5000;
  public static final int DEFAULT_REQUEST_SOCKET_TIMEOUT = 5000;

  private int maxPerRoute;
  private int maxTotal;
  private int soTimeout;
  private int executionCount;
  private int reqConnectTimeout;
  private int reqConnectionRequestTimeout;
  private int reqSocketTimeout;

  public ConnectionConfiguration() {
  }

  public int getMaxPerRoute() {
    return maxPerRoute;
  }

  public void setMaxPerRoute(int maxPerRouteT) {
    maxPerRoute = maxPerRouteT;
  }

  public int getMaxTotal() {
    return maxTotal;
  }

  public void setMaxTotal(int maxTotalT) {
    maxTotal = maxTotalT;
  }

  public int getSoTimeout() {
    return soTimeout;
  }

  public void setSoTimeout(int soTimeoutT) {
    soTimeout = soTimeoutT;
  }

  public int getExecutionCount() {
    return executionCount;
  }

  public void setExecutionCount(int executionCountT) {
    executionCount = executionCountT;
  }

  public int getReqConnectTimeout() {
    return reqConnectTimeout;
  }

  public void setReqConnectTimeout(int reqConnectTimeoutT) {
    reqConnectTimeout = reqConnectTimeoutT;
  }

  public int getReqConnectionRequestTimeout() {
    return reqConnectionRequestTimeout;
  }

  public void setReqConnectionRequestTimeout(int reqConnectionRequestTimeoutT) {
    reqConnectionRequestTimeout = reqConnectionRequestTimeoutT;
  }

  public int getReqSocketTimeout() {
    return reqSocketTimeout;
  }

  public void setReqSocketTimeout(int reqSocketTimeoutT) {
    reqSocketTimeout = reqSocketTimeoutT;
  }
}