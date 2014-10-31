import com.mhalgosolinc.raygate.Role
import com.mhalgosolinc.raygate.User
import com.mhalgosolinc.raygate.UserRole

class BootStrap {

    def init = { servletContext ->
        def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
        def userRole  = new Role(authority: 'ROLE_USER').save(flush: true)
        
        def adminUser = new User(username: 'admin', password: 'admin')
        def mh        = new User(username: 'mh', password: 'mh')
        adminUser.save(flush: true)
        mh.save(flush: true)

        UserRole.create adminUser, adminRole, true
        UserRole.create mh, userRole, true

        assert User.count() == 2
        assert Role.count() == 2
        assert UserRole.count() == 2
    }

    def destroy = {
    }
}