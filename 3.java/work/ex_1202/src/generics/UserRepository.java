package generics;

import java.util.Optional;

public class UserRepository implements CrudRepository<User, Long>{

	@Override
	public User save(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}
	

}
