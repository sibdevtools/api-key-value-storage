package com.github.sibdevtools.session.api.dto;

import java.io.Serializable;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface ValueHolder extends Serializable {

    /**
     * Get stored value
     *
     * @return stored value
     */
    byte[] getValue();

    /**
     * Get value meta
     *
     * @return value meta
     */
    ValueMeta getMeta();
}
