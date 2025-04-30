package com.example.simpleboard.post.db;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {

  public Optional<PostEntity> findFirstByIdAndStatusOrderByIdDesc(Long id, String status);

}
