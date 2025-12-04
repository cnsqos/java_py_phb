package generics;

import java.util.Optional;

//공통 로직을 하나의 타입으로 일반화 하면서 타입 안정성을 유도할 때
//DB연결
public interface CrudRepository<T,ID> {
	T save(T entity);
	Optional<T> findById(ID id);
	void delete(T entity);
}







