package com.tools.apirestredis.model;

import java.io.Serializable;
import org.springframework.data.redis.core.RedisHash;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
@RedisHash("Student")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private @NonNull String id;
    private @NonNull String firstName;
    private @NonNull String lastName;
    private @NonNull String email;
}
