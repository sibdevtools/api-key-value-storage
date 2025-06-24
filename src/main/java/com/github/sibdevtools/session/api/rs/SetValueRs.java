package com.github.sibdevtools.session.api.rs;

import com.github.sibdevtools.common.api.dto.ErrorRsDto;
import com.github.sibdevtools.common.api.rs.StandardBodyRs;
import com.github.sibdevtools.session.api.dto.ValueMeta;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public class SetValueRs extends StandardBodyRs<ValueMeta> {
    /**
     * Construct set value response
     *
     * @param valueMeta value instance
     */
    public SetValueRs(@Nullable ValueMeta valueMeta) {
        super(valueMeta);
    }

    /**
     * Construct set value response with error
     *
     * @param error happened error
     */
    public SetValueRs(@Nonnull ErrorRsDto error) {
        super(error);
    }

}
