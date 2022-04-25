package com.ariel.ApiHexagonalExample.Infrastructure.db.springdata.repository;

import com.ariel.ApiHexagonalExample.Infrastructure.db.springdata.dbo.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataUserRepository extends JpaRepository<UserEntity, Long> {
}
