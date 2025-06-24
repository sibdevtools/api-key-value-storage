package com.github.sibdevtools.session.api.rs;

import com.github.sibdevtools.common.api.dto.ErrorRsDto;
import com.github.sibdevtools.common.api.rs.StandardBodyRs;
import com.github.sibdevtools.session.api.dto.ValueHolder;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public class GetValueRs extends StandardBodyRs<ValueHolder> {
    /**
     * Construct get value response
     *
     * @param valueHolder value instance
     */
    public GetValueRs(@Nullable ValueHolder valueHolder) {
        super(valueHolder);
    }

    /**
     * Construct get value response with error
     *
     * @param error happened error
     */
    public GetValueRs(@Nonnull ErrorRsDto error) {
        super(error);
    }

}
