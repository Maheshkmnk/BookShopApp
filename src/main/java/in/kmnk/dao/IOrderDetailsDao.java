package in.kmnk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kmnk.dto.OrderDetails;

public interface IOrderDetailsDao extends JpaRepository<OrderDetails, Long>  {

}
