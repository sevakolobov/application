package net.sevakolobov.application.controller;

import lombok.extern.slf4j.Slf4j;
import net.sevakolobov.application.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import static net.sevakolobov.application.controller.MappingController.BUYERS;
import static net.sevakolobov.application.model.Student.Gender.MALE;

/**
 * @author sevakolobov on 31.05.2022.
 */
@RestController
@Slf4j
@RequestMapping(BUYERS)
public class BuyerController {

    @GetMapping("/all")
    public List<Student> getAllStudent() {
        log.info("- Invoke");
        return  List.of(new Student(UUID.randomUUID(), "Vsevolod", "Kolobov", "vk@gmail.com", MALE));
    }
}
