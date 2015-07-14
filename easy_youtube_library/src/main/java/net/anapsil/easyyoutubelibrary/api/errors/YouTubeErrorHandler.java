package net.anapsil.easyyoutubelibrary.api.errors;

import retrofit.ErrorHandler;
import retrofit.RetrofitError;

/**
 * Created by ana.silva on 02/07/15.
 */
public class YouTubeErrorHandler implements ErrorHandler {
    @Override
    public Throwable handleError(RetrofitError cause) {
        if (cause.getKind() == RetrofitError.Kind.NETWORK) {
            return new NetworkError(cause.getMessage(), cause.getCause());
        } else {
            return new YouTubeError(cause.getMessage(), cause.getCause());
        }
    }
}
