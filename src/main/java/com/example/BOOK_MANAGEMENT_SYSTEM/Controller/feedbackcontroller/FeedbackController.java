package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.feedbackcontroller;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.feedbackService.FeedbackService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping
    public Feedback submitFeedback(@RequestParam Long userId, @RequestParam Long productId,
                                   @RequestParam Integer rating, @RequestParam String comment) {
        return feedbackService.submitFeedback(userId, productId, rating, comment);
    }

    @GetMapping("/product/{productId}")
    public List<Feedback> getFeedbackByProductId(@PathVariable Long productId) {
        return feedbackService.getFeedbackByProductId(productId);
    }
}
