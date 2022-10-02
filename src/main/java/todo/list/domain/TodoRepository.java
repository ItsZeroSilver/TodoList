package todo.list.domain;

import org.springframework.data.jpa.repository.JpaRepository;
//Long - Rapping Class
//Null값을 받을 수가 없어서..... NullException을 막기 위해서....
//ObjectType이기 때문에 상속받을 수 있어서
public interface TodoRepository extends JpaRepository<Todo, Long>{
}
