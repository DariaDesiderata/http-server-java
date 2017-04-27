package classroom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// this is called annotation
public class LessonController {

  @GetMapping("/lessons")
  public String getLessons() {
    return "List of lessons will be displayed here";
  }
  
}
