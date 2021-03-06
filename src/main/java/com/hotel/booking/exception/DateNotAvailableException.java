package com.hotel.booking.exception;

import java.io.Serial;

public class DateNotAvailableException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DateNotAvailableException(String msg) {
        super(msg);
    }
}
