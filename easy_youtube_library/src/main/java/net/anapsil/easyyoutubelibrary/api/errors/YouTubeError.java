package net.anapsil.easyyoutubelibrary.api.errors;

/**
 * Created by ana.silva on 02/07/15.
 */
public class YouTubeError extends RuntimeException {
    public YouTubeError(String message, Throwable exception) {
        super(message, exception);
    }
}
