package com.preonboarding.backend.company.model.domain.vo;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class WorkLocation implements Serializable {
    @Column(nullable = false)
    private String nation;
    @Column(nullable = false)
    private String region;
}
