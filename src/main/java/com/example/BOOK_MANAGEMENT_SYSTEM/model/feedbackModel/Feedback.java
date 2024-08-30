package com.example.BOOK_MANAGEMENT_SYSTEM.model.feedbackModel;/*
package com.example.BOOK_MANAGEMENT_SYSTEM.model.feedbackModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedback_id;

    private Long user_id;
    private Long product_id;
    private int rating;
    private String comment;

    @Column(name = "created_at")
    private LocalDateTime created_at  = LocalDateTime.now();

}
*/
