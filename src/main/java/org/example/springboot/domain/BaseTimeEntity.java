package org.example.springboot.domain;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;


// 개체의 생성일와 수정일 관리
@Getter
@MappedSuperclass                               // JPA Entity가 해당 클래스를 상속받을 경우 필드들을 컬럼으로 인식하도록 한다.
@EntityListeners(AuditingEntityListener.class)  // Auditing 기능을 포함시킨다.
public class BaseTimeEntity {

    // Entity가 생성된 시간 자동 저장
    @CreatedDate
    private LocalDateTime createdDate;

    // Entity가 변경된 시간 자동 저장
    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
