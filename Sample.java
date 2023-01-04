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

    public List<Testcase> find(User user) {
        return UserDataSampler.fetchTestData(user.getId());
    }

    public User saveUser(User user){
        if(user.isAdmin){
            user.setRole(UserRole.ADMIN);
        }
        return UserRepositoryMock.save(user);
    }

    public List<Privilege> getPriviledges(Group group) {
        List<Privilege> privileges = GroupDataSampler.getGroup(group.getId()).getUser().getRole().getPrivileges();
        return privileges;
    }

    public void saveIfUserUnder18() {
        // Do process here...
    };
}
