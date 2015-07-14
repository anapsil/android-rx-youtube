package net.anapsil.easyyoutubelibrary.api.errors;

/**
 * Created by ana.silva on 14/07/15.
 */
public class BadRequestError extends YouTubeError {
    public BadRequestError(String message, Throwable exception) {
        super(message, exception);
    }
}
