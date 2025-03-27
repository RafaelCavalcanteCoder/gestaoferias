package gestao.ferias.com.pm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import gestao.ferias.com.pm.entity.User;
import gestao.ferias.com.pm.repository.UserRepository;

@Service
public class AdminService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void createAdminUser() {
        if (!userRepository.existsByUsername("adm")) {
            User admin = new User();
            admin.setUsername("adm");
            admin.setPassword(passwordEncoder.encode("123"));
            admin.setRole("ADMIN");
            userRepository.save(admin);
        }
    }
}
