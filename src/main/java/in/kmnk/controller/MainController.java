package in.kmnk.controller;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.kmnk.dto.CustomerDetails2;
import in.kmnk.service.IBookDataService;

@RestController
@RequestMapping("/api")
public class MainController {

	@Autowired
	IBookDataService booksService;
	
//	@Autowired
//	CustomerDetails 

	@GetMapping("/allproducts")
	public ResponseEntity<?> getAllBooks() {
		System.out.println("controller >> getAllBooks");
		return booksService.getAllProducts();
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody CustomerDetails2 res ){
		try {
			 // Read existing JSON file
        String existingJson = new String(Files.readAllBytes(Paths.get("src/main/resources/users.json")));

        // Convert existing JSON to User[] array
        ObjectMapper objectMapper = new ObjectMapper();
        CustomerDetails2[] users = objectMapper.readValue(existingJson, CustomerDetails2[].class);

        // Add the new user to the array
        CustomerDetails2[] newUsers = Arrays.copyOf(users, users.length + 1);
        newUsers[users.length] = res;

        // Write the updated array back to the JSON file
        FileWriter fileWriter = new FileWriter("src/main/resources/users.json");
        objectMapper.writeValue(fileWriter, newUsers);
        fileWriter.close();
        return new ResponseEntity<String>("Success", HttpStatus.OK);
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}

}
