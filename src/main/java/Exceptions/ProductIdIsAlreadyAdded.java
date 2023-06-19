package Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProductIdIsAlreadyAdded extends RuntimeException{
    public ProductIdIsAlreadyAdded(String message) {
        super(message);
    }

    public ProductIdIsAlreadyAdded(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductIdIsAlreadyAdded(Throwable cause) {
        super(cause);
    }

    public ProductIdIsAlreadyAdded(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ProductIdIsAlreadyAdded() {
    }
}
