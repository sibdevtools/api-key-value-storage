package com.github.sibdevtools.session.api.dto;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface ValueMeta extends Serializable {

    /**
     * @return date time of record creation
     */
    ZonedDateTime getCreatedAt();

    /**
     * @return date time of record last modification
     */
    ZonedDateTime getModifiedAt();

    /**
     * @return date time of record expiration
     */
    ZonedDateTime getExpiredAt();

    /**
     * @return index of modification
     */
    long getVersion();
}
