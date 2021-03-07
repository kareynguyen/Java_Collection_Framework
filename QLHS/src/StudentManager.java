import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> list = new ArrayList<>();

    void add(Student student){
        list.add(student);
    }

    void edit(int id, Student student){
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()){
                list.get(i).setId(student.getId());
                list.get(i).setName(student.getName());
                list.get(i).setAge(student.getAge());
                list.get(i).setClassName(student.getClassName());
            }else {
                System.out.println("Not exist");
            }
        }
    }

    void delete(int id){
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()){
                list.remove(i);
            }

        }
    }
    void show(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    void search(int id){
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()){
                System.out.println(list.get(i));
            }else {
                System.out.println("Not exist");
            }
        }
    }
}
