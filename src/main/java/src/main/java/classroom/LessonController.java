package classroom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// this is called annotation
public class LessonController {

  @GetMapping("/")
  public String getIndex() {
    return "GET to index route";
  }
}
