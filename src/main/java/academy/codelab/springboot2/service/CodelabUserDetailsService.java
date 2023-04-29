package academy.codelab.springboot2.service;

import academy.codelab.springboot2.repository.CodelabUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CodelabUserDetailsService implements UserDetailsService {
    private final CodelabUserRepository codelabUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username){
        return Optional.ofNullable(codelabUserRepository.findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException("DevDojo User not found"));
    }
}