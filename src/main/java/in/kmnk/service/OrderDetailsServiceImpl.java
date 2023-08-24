package in.kmnk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kmnk.dao.IOrderDetailsDao;
import in.kmnk.dto.OrderDetails;

@Service
public class OrderDetailsServiceImpl implements IOrderDetailsService{
	
	@Autowired
	IOrderDetailsDao orderDao; 
	
	@Override
	public OrderDetails getOrderDetails() {
		
		return null;
	}
}
