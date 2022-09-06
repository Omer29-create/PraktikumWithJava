package com.deneme.BosturDeneyebilirsin.dto;

import com.deneme.BosturDeneyebilirsin.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookRequest {

    private User user;
}
