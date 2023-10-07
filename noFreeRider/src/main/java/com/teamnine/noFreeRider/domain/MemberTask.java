package com.teamnine.noFreeRider.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "members_tasks")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class MemberTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_no", referencedColumnName = "member_no", updatable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "task_no", referencedColumnName = "task_no", updatable = false)
    private Task task;
}
