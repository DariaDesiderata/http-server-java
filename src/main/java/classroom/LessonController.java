package classroom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/lessons") // this is called annotation
public class LessonController {

  private final LessonRepository repository;

  public LessonController(LessonRepository repository) {
    this.repository = repository;
  }

  @GetMapping("")
  public Iterable<Lesson> all() {
    return this.repository.findAll();
  }

  @GetMapping("/{id}")
    public Lesson getOneLesson(@PathVariable String id) {
      Long lessonId = Long.parseLong(id);
      return this.repository.findOne(lessonId);
    }

  @PostMapping("")
    public Lesson createNewLesson(@RequestBody Lesson lesson) {
      return this.repository.save(lesson);
    }

  @DeleteMapping("/{id}")
      public void deleteLesson(@PathVariable String id) {
        Long lessonId = Long.parseLong(id);
        this.repository.delete(lessonId);
      }


}
