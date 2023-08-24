package in.kmnk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kmnk.dao.IAddressDao;
import in.kmnk.dto.OrderDetails;

@Service
public class AddressServiceImpl implements IAddressService{

	@Autowired
	IAddressDao addressDao;

	@Override
	public OrderDetails getOrderDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
