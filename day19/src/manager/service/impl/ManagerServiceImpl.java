package manager.service.impl;

import manager.entity.Student;
import manager.repository.Repository;
import manager.service.ManagerService;
//import manager.Repository;
import manager.repository.impl.DBRepository;

import java.util.List;

public class ManagerServiceImpl implements ManagerService {

	private  final Repository repository = new DBRepository();
	
	
    @Override
    public Student registerStudent(Student student) throws Exception {
    	
    	Student resultStudent = null;
    	
    	if(repository.registStudent(student)){
    		resultStudent = repository.lastInsertedStudent();
    	}
    	
    }
        return resultStudent;
    

    @Override
    public Student modifyStudent(Student student) throws Exception {
    	
    	//student.getStdNo();굳이 인자로 넘기지 않아도 되지만
    	//repository 표준에 updateStudent(int,Student)
    	int affectefRows =repository.updateStudent(student.getStdNo(),student); 
    	if (affectefRows > 0) {
    		return student;		
    	} else {
    		
    	}return null;

    }

    @Override
    public List<Student> searchStudents(Student student) throws Exception {
    	
    
    	List <Student> list = null;
    	
    	if (student == null) {
    	
    	//조건 1. 전체를 조회한다 
    	 list = repository.selectStudents();
    }else if (student .getName() ! = null) {
    	
    	//2.학생 이름을 검색어로 조회한다
    	list = repository.selectStudent(student.getName());
        return list;
    }else {
    	
    	//조건, 학생번호로 조회
    	
    	list = List.of(repository.selectStudent(student.getStdNo()));
    	}	

    	return list;
    }
    @Override
    public boolean deleteStudent(int stdNo) throws Exception {
    	
    	return repository.deleteStudent(stdNo);
    }

    @Override
    public void closeService() throws Exception {
    	repository.closeRepository();
    }
}
