package Demo;

/**
 * @author wl
 * @Data 2020-07-17 18:09
 */
public class Dog {
    private String name;
    private String varieties;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVarieties() {
        return varieties;
    }

    public void setVarieties(String varieties) {
        this.varieties = varieties;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", varieties='" + varieties + '\'' +
                ", age=" + age +
                '}';
    }
}
