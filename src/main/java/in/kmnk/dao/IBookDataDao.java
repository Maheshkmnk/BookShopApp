package in.kmnk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kmnk.dto.BookData;

public interface IBookDataDao extends JpaRepository<BookData, Long> {

}
