package com.example.BOOK_MANAGEMENT_SYSTEM.Service.feedbackService;

import com.example.BOOK_MANAGEMENT_SYSTEM.model.Feedback;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.Users;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.feedback.FeedbackRepository;
import com.example.BOOK_MANAGEMENT_SYSTEM.repository.feedback.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private UserRepository userRepository;

    public Feedback submitFeedback(Long userId, Long productId, Integer rating, String comment) {
        Users user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Feedback feedback = new Feedback();
        feedback.setUser(user);
        feedback.setProductId(productId);
        feedback.setRating(rating);
        feedback.setComment(comment);
        feedback.setCreatedAt(LocalDateTime.now());
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> getFeedbackByProductId(Long productId) {
        return feedbackRepository.findByProductId(productId);
    }
}
