package cinema.service.impl;

import cinema.dao.RoleDao;
import cinema.model.Role;
import cinema.model.RoleName;
import cinema.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao dao;

    @Autowired
    public RoleServiceImpl(RoleDao dao) {
        this.dao = dao;
    }

    @Override
    public Role add(Role role) {
        return dao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return dao.getByName(RoleName.valueOf(roleName));
    }
}
