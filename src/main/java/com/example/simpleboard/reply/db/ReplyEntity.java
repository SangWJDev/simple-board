package com.example.simpleboard.reply.db;

import com.example.simpleboard.post.db.PostEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity(name = "reply")
public class ReplyEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @ToString.Exclude
  @JsonIgnore
  @JoinColumn(name = "post_id")
  private PostEntity post;

  private String userName;

  private String password;

  private String status;

  private String title;

  @Column(columnDefinition = "TEXT")
  private String content;

  private LocalDateTime repliedAt;

}
