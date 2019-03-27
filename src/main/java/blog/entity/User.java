package blog.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * @author: wyf
 * @date: Created on 2019/3/26
 * @description:
 */
@Data
@Entity
@Table(name = "user")
public class User {
    private Long id;
    private String name;
    private String password;
    private Set<Spittle> spittleSet;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    public Set<Spittle> getSpittleSet() {
        return spittleSet;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }


}
