package com.wonjun.board;

import com.wonjun.board.domain.Board;
import com.wonjun.board.repository.BoardRepository;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardApplication implements CommandLineRunner {

  @Autowired
  private BoardRepository boardRepository;

  @Override
  public void run(String... args) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
    boardRepository.save(new Board("title1", "explain1", "creator1", LocalDate.of(2020, 6, 1),
        LocalDate.of(2020, 12, 1), 10000000, 10, 10000, true, "open"));
  }

  public static void main(String[] args) {
    SpringApplication.run(BoardApplication.class, args);
  }

}
