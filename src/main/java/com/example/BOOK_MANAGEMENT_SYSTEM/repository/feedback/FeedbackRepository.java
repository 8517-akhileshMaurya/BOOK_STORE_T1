package com.example.BOOK_MANAGEMENT_SYSTEM.repository.feedback;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByProductId(Long productId);
}

