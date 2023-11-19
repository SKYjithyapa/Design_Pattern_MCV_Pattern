public class StudentController {

    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollnumber(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollnumber();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollnumber());
    }



}
