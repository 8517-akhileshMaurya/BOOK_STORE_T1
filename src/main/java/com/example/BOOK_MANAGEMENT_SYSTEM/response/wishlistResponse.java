package com.example.BOOK_MANAGEMENT_SYSTEM.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class wishlistResponse {
    private Long  user_id;
    private Long  wishlist_id;
    private Long  product_id;
}
