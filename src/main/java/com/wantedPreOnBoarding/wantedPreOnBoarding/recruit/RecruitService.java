package com.wantedPreOnBoarding.wantedPreOnBoarding.recruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecruitService {

  @Autowired
  private RecruitRepository recruitRepository;

  public void save(RecruitDTO recruitDto) {
    RecruitEntity recruitEntity = RecruitEntity.toRecruitEntity(recruitDto);
    recruitRepository.save(recruitEntity);
  }

  public List<RecruitDTO> findAll() {
    List<RecruitEntity> recruitEntityList = recruitRepository.findAll();
    List<RecruitDTO> recruitDTOList = new ArrayList<>();
    for (RecruitEntity recruitEntity : recruitEntityList) {
      recruitDTOList.add(RecruitDTO.toRecruitDto(recruitEntity));
    }
    return recruitDTOList;
  }

  public RecruitDTO findById(Integer id) {
    Optional<RecruitEntity> optionalRecruitEntity = recruitRepository.findById(id);
    if (optionalRecruitEntity.isPresent()) {
      return RecruitDTO.toRecruitDto(optionalRecruitEntity.get());
    } else {
      return null;
    }
  }

  public void deleteById(Integer id) {
    recruitRepository.deleteById(id);
  }


}
