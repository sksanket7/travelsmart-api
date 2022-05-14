package com.st.travelsmartapi.repository;

import com.st.travelsmartapi.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserData, String> {
    UserData findByUsername(String username);

}
