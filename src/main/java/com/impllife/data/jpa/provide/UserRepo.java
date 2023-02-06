package com.impllife.data.jpa.provide;

import com.impllife.data.jpa.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Account, Long> {
}
