package si.kavica.database;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by Gregor on 23. 11. 2016.
 */
@Entity
public class Settings {

    @Id
    private Long id;

    @Generated(hash = 474517080)
    public Settings(Long id) {
        this.id = id;
    }

    @Generated(hash = 456090543)
    public Settings() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
