/*-
 * -\-\-
 * docker-client
 * --
 * Copyright (C) 2016 Spotify AB
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

import org.immutables.value.Value.Immutable;
import org.mandas.docker.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = ImmutableVersion.Builder.class)
@Immutable
public interface Version {

  @JsonProperty("ApiVersion")
  String apiVersion();

  @JsonProperty("Arch")
  String arch();

  @Nullable
  @JsonProperty("BuildTime")
  String buildTime();

  @JsonProperty("GitCommit")
  String gitCommit();

  @JsonProperty("GoVersion")
  String goVersion();

  @JsonProperty("KernelVersion")
  String kernelVersion();

  @JsonProperty("Os")
  String os();

  @JsonProperty("Version")
  String version();
}
