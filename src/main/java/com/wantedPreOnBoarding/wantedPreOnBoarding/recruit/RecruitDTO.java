package com.wantedPreOnBoarding.wantedPreOnBoarding.recruit;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RecruitDTO {

  private Integer id;
  private String name;
  private String position;
  private Integer award;
  private String content;
  private String technique;
  private String another;

  public static RecruitDTO toRecruitDto(RecruitEntity recruitEntity) {
    RecruitDTO recruitDto = new RecruitDTO();

    recruitDto.setId(recruitEntity.getId());
    recruitDto.setName(recruitDto.getName());
    recruitDto.setPosition(recruitEntity.getPosition());
    recruitDto.setAward(recruitEntity.getAward());
    recruitDto.setContent(recruitEntity.getContent());
    recruitDto.setTechnique(recruitEntity.getTechnique());
    recruitDto.setAnother(recruitEntity.getAnother());

    return recruitDto;
  }
}

