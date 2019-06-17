package cn.itheima.Entity;

/**
 * @Description
 * @Author yangjie
 * @Create 2019-06-17 09:46
 */
public class DemoEntity {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
