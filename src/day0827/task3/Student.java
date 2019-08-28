package day0827.task3;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tjk
 * @date 2019/8/27 10:44
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    private Integer id;
    private String  sid;

    private String name;
    private Integer age;
    private String banji;



}
