package day0827.task3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tjk
 * @date 2019/8/27 19:48
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Integer id;
    private String tid;
    private String tname;
}
