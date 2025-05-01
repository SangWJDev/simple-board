package com.example.simpleboard.post.model;

import com.example.simpleboard.post.db.PostEntity;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
public class PostDto {

  private Long id;

  private Long boardId;

  private String userName;

  private String password;

  private String status;

  private String title;

  private String content;

  private String email;

  private LocalDateTime postedAt;

  private List<PostEntity> postList = List.of();

}
