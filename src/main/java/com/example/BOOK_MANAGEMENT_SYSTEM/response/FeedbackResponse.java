package com.example.BOOK_MANAGEMENT_SYSTEM.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackResponse {
    private Long user_id;
    private Long product_id;
    private String feedback;
}
