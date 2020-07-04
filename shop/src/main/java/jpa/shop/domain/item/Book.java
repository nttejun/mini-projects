package jpa.shop.domain.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import jpa.shop.domain.Item;

@Entity
@DiscriminatorValue("B")
public class Book extends Item {

  private String author;
  private String isbn;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}
