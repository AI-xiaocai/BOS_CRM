package zhan.service;

import java.util.List;
import javax.jws.WebService;
import zhan.domain.Customer;

@WebService
public interface ICustomerService {
	public List<Customer> findAll();
	
	//查询未关联定区的客户
	public List<Customer> findListNotAssocation();
	
	//查询已关联定区的客户
	public List<Customer> findListHasAssocation(String decidedzone_id);
	
	//关联定区和客户
	public void assigncustomerstodecidedzone(String decidedzone_id, List<Integer> customerIds);
	
	//根据手机号查询客户信息
	public Customer findCustByTelephone(String telephone);
	
	//根据地址查询定区Id
	public String findDecidedzoneidByAddress(String address);
}
