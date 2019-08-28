package day0827.task1;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author tjk
 * @date 2019/8/27 10:44
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private String password;
    private String address;

    // 通过 @Data ,可以不用写setter getter  hashCode  equals（）

}
