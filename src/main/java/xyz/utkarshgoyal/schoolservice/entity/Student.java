package xyz.utkarshgoyal.schoolservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {

    private Long id;
    private String studentName;
    private Long schoolId;
}
