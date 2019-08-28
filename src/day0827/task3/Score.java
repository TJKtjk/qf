package day0827.task3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tjk
 * @date 2019/8/27 21:41
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    private Integer id;
    private String sid;
    private Integer grade;
    private String course;
}
