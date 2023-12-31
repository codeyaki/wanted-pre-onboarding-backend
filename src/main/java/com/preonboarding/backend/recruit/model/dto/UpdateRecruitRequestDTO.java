package com.preonboarding.backend.recruit.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UpdateRecruitRequestDTO {
    private String position;
    private Integer bounty;
    private String details;
    private String skill;
}
