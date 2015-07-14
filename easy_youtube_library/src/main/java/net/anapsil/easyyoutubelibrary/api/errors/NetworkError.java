package net.anapsil.easyyoutubelibrary.api.errors;

/**
 * Created by vilmar.filho on 17/03/15.
 */
public class NetworkError extends YouTubeError {

    public NetworkError(String message, Throwable exception) {
        super(message, exception);
    }
}
