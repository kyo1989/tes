package javaHonkaku;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class p68 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Point point1 = new Point(3,2);
//		Point point2 = new Point(3,2);
//		Employee emp = new Employee(1,"sakai");
//		System.out.println(point1+":"+point2+":"+emp);
//		System.out.println(point1.hashCode()+":"+point2.hashCode()+":"+emp.hashCode());
//
//		Task task = new Task(Tasktype.PRIVATE,"buy milk");
//		Tasktype type = task.getType();
//		System.out.println(Tasktype.PRIVATE.equals(type));
//		System.out.println(HttpStatus.OK.getValue()+":"+HttpStatus.OK.getNum());
//
//		List list = new ArrayList();
//		list.add("java");
//		String elem = (String)list.get(0);
//
//		GenericStack<String> genStack = new GenericStack<>();
//		genStack.push("true");

		int[] array;
		array = new int[3];


	}
}
class GenericStack<E>{
	private List<E> taskList;

	public GenericStack(){
		taskList = new ArrayList<>();

	}
	public boolean push(E task){
		return taskList.add(task);
	}

	public E pop(){
		if(taskList.isEmpty()){
			return null;
		}
		return taskList.remove(taskList.size()-1);
	}
}
enum Tasktype{
	PRIVATE,
	WORK
}

enum HttpStatus{
	OK(200,100),NOT_FOUND(404,304),INTERNAL_SERVER_ERROR(500,400);
	private final int value;
	private final int num;
	private HttpStatus(int value,int num){
		this.value = value;
		this.num = num;
	}

	public int getValue(){
		return value;
	}

	public int getNum(){
		return num;
	}
}

class Task{
	private String id;
	private Tasktype type;
	private String body;

	public Task(Tasktype type,String body){
		this.id=UUID.randomUUID().toString();
		this.type = type;


	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Tasktype getType() {
		return type;
	}

	public void setType(Tasktype type) {
		this.type = type;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}



class Point{
	private final int x;
	private final int y;

	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString(){
		return "aaa";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}

class Employee{
	private int employeeNo;
	private String employeeName;

	public Employee(int employee,String employeeName){
		this.employeeNo = employee;
		this.employeeName = employeeName;
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}

		if(obj == null){
			return false;
		}

		if(getClass() != obj.getClass()){
			return false;
		}

		Employee other = (Employee)obj;
		if(this.employeeNo != other.employeeNo){
			return false;

		}

		if(employeeName == null){
			if(other.employeeName != null){
				return false;
			}
		}else if(!employeeName.equals(other.employeeName)){
			return false;
		}

		return true;
	}
}