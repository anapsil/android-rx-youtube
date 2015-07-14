package net.anapsil.easyyoutubelibrary.api.model;

import java.util.List;

/**
 * Created by ana.silva on 14/07/15.
 */
public class ErrorResponse {
    private List<Error> errors;
    private int code;
    private String message;

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
