/*-
 * -\-\-
 * docker-client
 * --
 * Copyright (C) 2016 Spotify AB
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

package org.mandas.docker.client.messages.swarm;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

import org.mandas.docker.Nullable;


@AutoValue
@JsonAutoDetect(fieldVisibility = ANY, getterVisibility = NONE, setterVisibility = NONE)
public abstract class UpdateConfig {

  @Nullable
  @JsonProperty("Parallelism")
  public abstract Long parallelism();

  @Nullable
  @JsonProperty("Delay")
  public abstract Long delay();

  @Nullable
  @JsonProperty("FailureAction")
  public abstract String failureAction();

  @Nullable
  @JsonProperty("Order")
  public abstract String order();

  @JsonCreator
  public static UpdateConfig create(
      @JsonProperty("Parallelism") final Long parallelism,
      @JsonProperty("Delay") final Long delay,
      @JsonProperty("FailureAction") final String failureAction,
      @JsonProperty("Order") final String order) {
    return new AutoValue_UpdateConfig(parallelism, delay, failureAction, order);
  }
}