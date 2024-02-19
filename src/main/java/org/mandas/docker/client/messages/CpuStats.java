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

import java.util.List;

import org.immutables.value.Value.Enclosing;
import org.immutables.value.Value.Immutable;
import org.mandas.docker.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = ImmutableCpuStats.Builder.class)
@Immutable
@Enclosing
public interface CpuStats {

  @JsonProperty("cpu_usage")
  CpuUsage cpuUsage();

  @Nullable
  @JsonProperty("system_cpu_usage")
  Long systemCpuUsage();

  @JsonProperty("throttling_data")
  ThrottlingData throttlingData();

  @JsonDeserialize(builder = ImmutableCpuStats.CpuUsage.Builder.class)
  @Immutable
  public interface CpuUsage {

    @JsonProperty("total_usage")
    Long totalUsage();

    @Nullable
    @JsonProperty("percpu_usage")
    List<Long> percpuUsage();

    @JsonProperty("usage_in_kernelmode")
    Long usageInKernelmode();

    @JsonProperty("usage_in_usermode")
    Long usageInUsermode();
  }

  @JsonDeserialize(builder = ImmutableCpuStats.ThrottlingData.Builder.class)
  @Immutable
  public interface ThrottlingData {

    @JsonProperty("periods")
    Long periods();

    @JsonProperty("throttled_periods")
    Long throttledPeriods();

    @JsonProperty("throttled_time")
    Long throttledTime();
  }
}
