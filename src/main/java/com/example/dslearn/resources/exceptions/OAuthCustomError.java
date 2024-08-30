package com.example.dslearn.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OAuthCustomError implements Serializable {
    private static final long serialVersionUID = 1L;
    private String error;
    @JsonProperty("error_description")
    private String errorDescription;
}
