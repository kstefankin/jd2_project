package by.academy.box.dao;

import by.academy.box.pojos.Message;
import by.academy.box.pojos.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
