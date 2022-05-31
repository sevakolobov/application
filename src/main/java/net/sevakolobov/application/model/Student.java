package net.sevakolobov.application.model;

import java.util.UUID;

/**
 * @author sevakolobov on 31.05.2022.
 */
public record Student(
        UUID studentId,
        String firstName,
        String lastName,
        String email,
        Gender gender) {

    public enum Gender {
        MALE, FEMALE
    }
}
