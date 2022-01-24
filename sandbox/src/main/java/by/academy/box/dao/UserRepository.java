package by.academy.box.dao;

import by.academy.box.pojos.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

    public User getByLogin(String login);

}
