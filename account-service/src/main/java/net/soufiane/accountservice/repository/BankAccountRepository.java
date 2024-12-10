package net.soufiane.accountservice.repository;

import net.soufiane.accountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount , String> {

}