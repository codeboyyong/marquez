/*
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
 */

package marquez.api.models;

import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public final class JobResponse {
  @Getter @NonNull private final String name;
  @Getter private final String createdAt;
  @Getter @NonNull private final List<String> inputDatasetUrns;
  @Getter @NonNull private final List<String> outputDatasetUrns;
  @Getter @NonNull private final String location;
  @Nullable private final String description;

  public Optional<String> getDescription() {
    return Optional.ofNullable(description);
  }
}
