package com.example.student.Model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(length = 200)
    private String name ;

    @ManyToOne
    @JoinColumn(
            name="group_id"
    )
    private Group group;
}
