package hello.service;

/**
 * @author lx
 * @create_TIME 2020-02-29-20:17
 */
public class User {
    Integer id;
    String  name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
