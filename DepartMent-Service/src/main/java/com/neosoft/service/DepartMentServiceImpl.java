package com.neosoft.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.neosoft.dto.Book;
import com.neosoft.dto.MyDeotUserDetail;
import com.neosoft.dto.MyDepartMentBook;
import com.neosoft.dto.User;
import com.neosoft.entity.DepartMent;
import com.neosoft.repo.DepartMentRepo;

@Service
public class DepartMentServiceImpl implements DepartMentService {

	@Autowired
	private DepartMentRepo repo;
	@Autowired
	private RestTemplate template;
	
	@Override
	public DepartMent insert(DepartMent dept) {
		return repo.save(dept);
	}

	@Override
	public MyDeotUserDetail findById(Integer cid) {
		Optional<DepartMent> dept=repo.findById(cid);
		int id=dept.get().getUid();
		
		User u=	template.getForObject("http://USER-SERVICE/user/"+id,User.class);
		MyDeotUserDetail m=new MyDeotUserDetail();
		m.setDepartment(dept.get());
		m.setUser(u);
		return m;
	}

	@Override
	public MyDepartMentBook findAllBookDetailsBasedonDpt(String dpt) {
		List<DepartMent> dept=repo.findAll()
		.stream().filter(d ->d.getDepName().equals(dpt)).collect(Collectors.toList());
	List<Book> book=	template.getForObject("http://library-service/book/find/"+dpt,List.class);
	MyDepartMentBook m=new MyDepartMentBook();
	m.setDept(dept);
	m.setBook(book);
	return null;
	}

	

}
