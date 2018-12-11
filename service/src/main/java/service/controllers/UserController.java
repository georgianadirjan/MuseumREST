package service.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dataacces.UserDAO;
import model.User;

@RestController
@RequestMapping("/rest")
public class UserController {

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable("id") int id) {
		try {
			User user = new UserDAO().getUserById(id);
			if (user == null) {
				System.out.println("shit");
				return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}
	}

}
