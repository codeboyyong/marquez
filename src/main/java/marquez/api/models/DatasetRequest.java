package marquez.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Optional;
import javax.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

@AllArgsConstructor(onConstructor = @__(@JsonCreator))
@EqualsAndHashCode
@ToString
public final class DatasetRequest {
  @Getter @NotBlank private final String name;
  @Getter @NotBlank private final String datasourceUrn;
  @Nullable private String description;

  public Optional<String> getDescription() {
    return Optional.ofNullable(description);
  }
}