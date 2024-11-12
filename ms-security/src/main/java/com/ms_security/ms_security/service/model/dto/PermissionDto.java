package com.ms_security.ms_security.service.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PermissionDto implements Serializable {

    @NotNull(message = "The id field cannot be null", groups = Update.class)
    @Null(message = "The id field must be null", groups = Create.class)
    private Long id;

    @NotNull(message = "The name field cannot be null", groups = {Create.class})
    private String name;

    @NotNull(message = "The url field cannot be null", groups = {Create.class, Update.class})
    private String url;

    @NotNull(message = "The method field cannot be null", groups = {Create.class, Update.class})
    private String method;

    @NotNull(message = "The menuItem field cannot be null", groups = {Create.class, Update.class})
    private String menuItem;

    @NotNull(message = "The status field cannot be null", groups = {Create.class, Update.class})
    private Boolean status;

    @NotNull(message = "The createUser field cannot be null", groups = Create.class)
    @Null(message = "The createUser field must be null", groups = Update.class)
    private String createUser;

    @NotNull(message = "The updateUser field cannot be null", groups = Update.class)
    @Null(message = "The updateUser field must be null", groups = Create.class)
    private String updateUser;

    public interface Create {}
    public interface Update {}
}