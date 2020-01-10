package ferdis.personal.project.tool.ppm_tool.services;

import ferdis.personal.project.tool.ppm_tool.domain.User;
import ferdis.personal.project.tool.ppm_tool.exceptions.UserNameAlreadyExistsException;
import ferdis.personal.project.tool.ppm_tool.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User saveUser (User newUser){

        try{
            newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
            newUser.setUserName(newUser.getUsername());
            newUser.setConfirmPassword("");
            return (User) userRepository.save(newUser);
        }catch (Exception ex){
            throw new UserNameAlreadyExistsException("UserName " + newUser.getUsername()+ "already exists");
        }
    }
}
