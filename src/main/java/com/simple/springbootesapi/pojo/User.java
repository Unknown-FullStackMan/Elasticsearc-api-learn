package com.simple.springbootesapi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Simple
 * @date 2021/4/2 13:39
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private int id;
}
