package ashish.springframework.msscbrewery.web.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTO {
    UUID id;
    String name;
}
