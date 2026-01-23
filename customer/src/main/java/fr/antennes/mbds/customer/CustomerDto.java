package fr.antennes.mbds.customer;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class CustomerDto {
    private Long id;
    private String firstName;
    private String lastName;
    //private String email;
}
