package com.github.sibdevtools.session.api.rq;

import lombok.*;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetValueRq implements Serializable {
    private String space;
    private String key;
    private byte[] value;
    private ZonedDateTime expiredAt;
}
