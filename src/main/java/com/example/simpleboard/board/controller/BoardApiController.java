package com.example.simpleboard.board.controller;

import com.example.simpleboard.board.db.BoardEntity;
import com.example.simpleboard.board.db.BoardRepository;
import com.example.simpleboard.board.model.BoardDto;
import com.example.simpleboard.board.model.BoardRequest;
import com.example.simpleboard.board.service.BoardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/boards")
public class BoardApiController {

  private final BoardService boardService;
  private final BoardRepository boardRepository;

  @PostMapping
  public BoardDto create(
      @Valid @RequestBody BoardRequest boardRequest
  ) {
    return boardService.create(boardRequest);
  }

  @GetMapping("/id/{id}")
  public BoardDto view(@PathVariable(name = "id") Long id) {
    return boardService.view(id);
  }
}
