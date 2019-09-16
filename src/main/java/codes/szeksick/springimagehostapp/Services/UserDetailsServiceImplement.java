package codes.szeksick.springimagehostapp.Services;

import codes.szeksick.springimagehostapp.Repositories.AplicationUserRepository;
import codes.szeksick.springimagehostapp.model.AplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImplement implements UserDetailsService {

    private AplicationUserRepository aplicationUserRepository;

    @Autowired
    public UserDetailsServiceImplement(AplicationUserRepository aplicationUserRepository) {
        this.aplicationUserRepository = aplicationUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
         return this.aplicationUserRepository.findUserByname(s);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void createUser(){
        AplicationUser aplicationUser = new AplicationUser("Pawel","Pawel123","USER");
        aplicationUserRepository.save(aplicationUser);
    }
}
