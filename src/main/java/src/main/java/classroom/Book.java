package classroom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private String url;
  private String author;

  public Long setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public String setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public String setUrl(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }

  public String setAuthor(String author) {
    this.author = author;
  }

  public String getAuthor() {
    return author;
  }
}
