/*-
 * -\-\-
 * docker-client
 * --
 * Copyright (C) 2016 - 2017 Spotify AB
 * Copyright (C) 9/2019 - now Dimitris Mandalidis
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */

package org.mandas.docker.client.messages;

import static org.mandas.docker.FixtureUtil.fixture;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.mandas.docker.client.ObjectMapperProvider;

import org.junit.Test;

public class NetworkTest {

  private final ObjectMapper objectMapper = ObjectMapperProvider.objectMapper();

  @Test
  public void test1_23() throws Exception {
    objectMapper.readValue(fixture("fixtures/1.23/network1.json"), Network.class);
    objectMapper.readValue(fixture("fixtures/1.23/network2.json"), Network.class);
  }

  @Test
  public void test1_26() throws Exception {
    objectMapper.readValue(fixture("fixtures/1.26/network1.json"), Network.class);
    objectMapper.readValue(fixture("fixtures/1.26/network2.json"), Network.class);
  }

  @Test
  public void test1_30() throws Exception {
    objectMapper.readValue(fixture("fixtures/1.30/network1.json"), Network.class);
    objectMapper.readValue(fixture("fixtures/1.30/network2.json"), Network.class);
  }
}