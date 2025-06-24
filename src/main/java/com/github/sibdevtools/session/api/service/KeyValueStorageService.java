package com.github.sibdevtools.session.api.service;

import com.github.sibdevtools.session.api.rq.SetValueRq;
import com.github.sibdevtools.session.api.rs.GetValueRs;
import com.github.sibdevtools.session.api.rs.SetValueRs;
import jakarta.annotation.Nonnull;

import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.Set;

/**
 * Key-value storage service, provide ability to get and set values.
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface KeyValueStorageService {

    /**
     * Get set of all sections
     *
     * @return set of sections
     */
    @Nonnull
    Set<String> getSpaces();

    /**
     * Get set of all keys in space
     *
     * @return set of keys
     */
    @Nonnull
    Set<String> getKeys(@Nonnull String space);

    /**
     * Delete space.<br/>
     *
     * @param space storage space identifier
     */
    void delete(
            @Nonnull String space
    );

    /**
     * Get stored value.<br/>
     *
     * @param space storage space identifier
     * @param key   data identifier
     * @return storage content or empty
     */
    @Nonnull
    Optional<GetValueRs> get(
            @Nonnull String space,
            @Nonnull String key
    );

    /**
     * Set stored value<br/>
     *
     * @param rq request
     * @return meta information of stored value
     */
    @Nonnull
    SetValueRs set(@Nonnull SetValueRq rq);

    /**
     * Set stored value<br/>
     *
     * @param space     storage space identifier
     * @param key       data identifier
     * @param expiredAt new expiration date
     * @return meta information of stored value
     */
    @Nonnull
    SetValueRs prolongate(
            @Nonnull String space,
            @Nonnull String key,
            @Nonnull ZonedDateTime expiredAt
    );

    /**
     * Delete stored value.<br/>
     *
     * @param space storage space identifier
     * @param key   data identifier
     */
    void delete(
            @Nonnull String space,
            @Nonnull String key
    );

}
