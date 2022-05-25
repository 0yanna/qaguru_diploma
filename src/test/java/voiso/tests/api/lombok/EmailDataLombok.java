package voiso.tests.api.lombok;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown=true)
@Data
public class EmailDataLombok {

    private String email;
    private String password;
}
