package ds.test.junit;

public class Man {
    private String sex="男";
    public String getName(int id){
        String name="name_"+id;
        return name;
    }
    public void setSex(String s){
        this.sex=s;
    }
    public String getSex() {
        return sex;
    }
}
