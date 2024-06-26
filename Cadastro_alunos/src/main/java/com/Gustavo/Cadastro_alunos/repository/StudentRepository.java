package com.Gustavo.Cadastro_alunos.repository;

import com.Gustavo.Cadastro_alunos.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
