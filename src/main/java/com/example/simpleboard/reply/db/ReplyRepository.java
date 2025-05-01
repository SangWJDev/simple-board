package com.example.simpleboard.reply.db;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends JpaRepository<ReplyEntity, Long> {

  // select * from reply where post_id = ?
  List<ReplyEntity> findAllByPostIdAndStatusOrderByIdDesc(Long postId, String status);

}
