package by.academy.box.dao;

import by.academy.box.pojos.Message;
import by.academy.box.pojos.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    public List<Message> findBySurnameTo(String surname);
}
