package com.wantedPreOnBoarding.wantedPreOnBoarding.recruit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecruitEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String position;

  @Column(nullable = false)
  private Integer award;

  @Column(nullable = false)
  private String content;

  @Column(nullable = false)
  private String technique;

  private String another;

  public static RecruitEntity toRecruitEntity(RecruitDTO recruitDTO){
    RecruitEntity recruitEntity = new RecruitEntity();

    recruitEntity.setId(recruitDTO.getId());
    recruitEntity.setName(recruitDTO.getName());
    recruitEntity.setPosition(recruitDTO.getPosition());
    recruitEntity.setAward(recruitDTO.getAward());
    recruitEntity.setTechnique(recruitDTO.getTechnique());

    return recruitEntity;
  }
}
