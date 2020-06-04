package com.wonjun.board.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Board {

  @Id
  @GeneratedValue
  private Long projectId;

  private String title;
  private String explain;
  private String creatorId;
  private LocalDate startDttm;
  private LocalDate endDttm;
  private int targetAmount;
  private int supportCnt;
  private int supportAmount;
  private boolean isOpen;
  private String status;

  public Board(String title, String explain, String creatorId, LocalDate startDttm,
      LocalDate endDttm, int targetAmount, int supportCnt, int supportAmount, boolean isOpen,
      String status) {
    this.title = title;
    this.explain = explain;
    this.creatorId = creatorId;
    this.startDttm = startDttm;
    this.endDttm = endDttm;
    this.targetAmount = targetAmount;
    this.supportCnt = supportCnt;
    this.supportAmount = supportAmount;
    this.isOpen = isOpen;
    this.status = status;
  }
}
