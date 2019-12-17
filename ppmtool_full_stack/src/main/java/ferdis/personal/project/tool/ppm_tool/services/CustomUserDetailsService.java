package ferdis.personal.project.tool.ppm_tool.services;

import ferdis.personal.project.tool.ppm_tool.domain.User;
import ferdis.personal.project.tool.ppm_tool.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(userName);
        if(user == null)
            new UsernameNotFoundException("User not found");
        return user;
    }

    public User loadUserById(Long id){
        User user = userRepository.getById(id);
        if(user == null)
            new UsernameNotFoundException("User not found");
        return user;
    }
}
