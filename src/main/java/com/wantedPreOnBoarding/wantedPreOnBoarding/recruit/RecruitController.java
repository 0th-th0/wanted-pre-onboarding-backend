package com.wantedPreOnBoarding.wantedPreOnBoarding.recruit;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class RecruitController {

  @Autowired
  private RecruitService recruitService;

  @GetMapping("/recruit")
  public String recruitList() {
    return "recruit";
  }

  @GetMapping("/recruit/board")
  public String insertBoard() {
    return "board";
  }

  @PostMapping("/recruit/board")
  public String insert(@ModelAttribute RecruitDTO recruitDto) {
    System.out.println("recruitDto = " + recruitDto);
    recruitService.save(recruitDto);
    return "list";
  }

  @GetMapping("/recruit/list")
  public String findAll(Model model) {
    List<RecruitDTO> recruitDTOList = recruitService.findAll();
    model.addAttribute("recruitList", recruitDTOList);
    return "list";
  }

  @GetMapping("/recruit/detail")
  public String findById(@PathVariable Integer id, Model model) {
    RecruitDTO recruitDTO = recruitService.findById(id);
    model.addAttribute("recruit", recruitDTO);

    return "detail";
  }

  @GetMapping("recruit/delete/{id}")
  public String deleteById(@PathVariable Integer id){
    recruitService.deleteById(id);

    return "redirect:/recruit/";
  }


}
