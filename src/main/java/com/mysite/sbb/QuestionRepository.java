package com.mysite.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository에는 CRUD 작업을 처리할 수 있는 메서드들이 내장되어 있어 작업에 편리성이 높아진다.
public interface QuestionRepository extends JpaRepository<Question, Integer>{

}
