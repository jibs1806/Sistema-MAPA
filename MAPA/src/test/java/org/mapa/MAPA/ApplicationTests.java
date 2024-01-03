package org.mapa.MAPA;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapa.MAPA.domain.people.SystemRole;
import org.mapa.MAPA.domain.people.user.User;
import org.mapa.MAPA.services.people.UserService;
import org.mapa.MAPA.web.application.configuration.TestConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = TestConfiguration.class)
@Transactional
class ApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	void contextLoads() {
		assertNotNull(userService);
	}

	@Test
	@DisplayName("checking user persistence")
	void checkingUserPersistence(){
		User user = new User("Lucho", "Gina0802", "a@e.com", SystemRole.EMPLOYEE);
		userService.save(user);

		List<User> users = userService.findAll();
		User userTest = users.stream().filter(u -> u.getUsername().equals(user.getUsername())).findFirst().get();

		assertEquals(userTest.getUsername(), user.getUsername());

	}
}
