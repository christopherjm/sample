import service.*;

import java.net.URL;
import java.util.Date;
import java.util.List;

public class Sample {

    public Date d;
    public Account[] AccountList;
    public URL r;
    public int daysInYear = 360;
    public int hoursInWeek = 168;

    // Getter setters here..

    public List<Testcase> find(User user) {
        return UserRepo.getUser(user.getId());
    }

    public User saveUser(User user){
        if(user.isAdmin){
            user.setRole(UserRole.ADMIN);
        }
        return UserRepo.save(user);
    }

    public List<Privilege> getPriviledges(Group group) {
        List<Privilege> privileges = GroupDataSampler.getGroup(group.getId()).getPrivileges();
        return privileges;
    }
}
