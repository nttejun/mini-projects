package jpa.shop.domain.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import jpa.shop.domain.Item;

@Entity
@DiscriminatorValue("A")
public class Album extends Item {

  private String artist;
  private String etc;

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getEtc() {
    return etc;
  }

  public void setEtc(String etc) {
    this.etc = etc;
  }
}
