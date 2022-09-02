package com.user.user_service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Contact {
    private Long cId;
    private String email;
    private String contactName;
    private Long userId;
}
