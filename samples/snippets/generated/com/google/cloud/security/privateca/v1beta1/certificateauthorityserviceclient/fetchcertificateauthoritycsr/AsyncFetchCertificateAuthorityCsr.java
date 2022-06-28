/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.security.privateca.v1beta1.samples;

// [START
// privateca_v1beta1_generated_certificateauthorityserviceclient_fetchcertificateauthoritycsr_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.security.privateca.v1beta1.CertificateAuthorityName;
import com.google.cloud.security.privateca.v1beta1.CertificateAuthorityServiceClient;
import com.google.cloud.security.privateca.v1beta1.FetchCertificateAuthorityCsrRequest;
import com.google.cloud.security.privateca.v1beta1.FetchCertificateAuthorityCsrResponse;

public class AsyncFetchCertificateAuthorityCsr {

  public static void main(String[] args) throws Exception {
    asyncFetchCertificateAuthorityCsr();
  }

  public static void asyncFetchCertificateAuthorityCsr() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CertificateAuthorityServiceClient certificateAuthorityServiceClient =
        CertificateAuthorityServiceClient.create()) {
      FetchCertificateAuthorityCsrRequest request =
          FetchCertificateAuthorityCsrRequest.newBuilder()
              .setName(
                  CertificateAuthorityName.of("[PROJECT]", "[LOCATION]", "[CERTIFICATE_AUTHORITY]")
                      .toString())
              .build();
      ApiFuture<FetchCertificateAuthorityCsrResponse> future =
          certificateAuthorityServiceClient
              .fetchCertificateAuthorityCsrCallable()
              .futureCall(request);
      // Do something.
      FetchCertificateAuthorityCsrResponse response = future.get();
    }
  }
}
// [END
// privateca_v1beta1_generated_certificateauthorityserviceclient_fetchcertificateauthoritycsr_async]