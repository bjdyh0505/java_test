/**
 * Created by yuanhai.dong on 2017/9/19.
 */
public class Develop {

    private String name;
    private String age;
    private String job;//工作职位

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() { return age; }

    public void setAge(String age) { this.age = age; }

    public String getJob() { return job; }

    public void setJob(String job) { this.job = job; }

    public void say() {
        System.out.println("这是一个say方法");
    }
}
