package com.example.UC4_AddressBookApp.repository;


import com.example.UC4_AddressBookApp.models.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook, Long> {
}
