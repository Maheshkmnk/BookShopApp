package in.kmnk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.kmnk.dao.ICustomerDetailsDao;
import in.kmnk.dto.CustomerDetails;
import in.kmnk.globalException.CustomException;

@Service
public class CustomerDetailsServiceImpl implements ICustomerDetailsService {

	@Autowired
	ICustomerDetailsDao userRepo;

	@Override
	public ResponseEntity<?> createUser(CustomerDetails userDetails) {

		if (userRepo != null) {
			CustomerDetails save = userRepo.save(userDetails);
			if (save != null) {
				return new ResponseEntity<>("Successfull", HttpStatus.OK);
			}
		}
		return new ResponseEntity<>("Fail", HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<?> validateUser(String uemail, String upassword) {
		String userPasswordByEmail = null;
		if (userRepo != null) userPasswordByEmail = userRepo.getUserPasswordByEmail(uemail);

		if (!userPasswordByEmail.isEmpty() && userPasswordByEmail.equals(upassword))
			return new ResponseEntity<>(true, HttpStatus.OK);
		else
			throw new CustomException("Email id or password wrong");
	}

	@Override
	public ResponseEntity<?> getUserDetailsByEmail(String uemail) {
		return new ResponseEntity<>(userRepo.getUserDetailsByEmail(uemail), HttpStatus.OK);
	}

	

}
