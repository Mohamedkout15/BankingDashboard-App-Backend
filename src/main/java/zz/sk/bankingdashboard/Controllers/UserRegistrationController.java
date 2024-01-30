// UserRegistrationController.java
package zz.sk.bankingdashboard.Controllers;
/*
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import zz.sk.bankingdashboard.Entities.User;
import zz.sk.bankingdashboard.Repositories.UserRegistrationAndDetailsService;
import zz.sk.bankingdashboard.Repositories.UserRepository;

import java.util.Optional;


@RestController
@Component
@EnableSwagger2
@RequestMapping("/user")
@Api(tags = "user")*/
public class UserRegistrationController {
    /*
    private final UserRepository userRepository;
    private final UserRegistrationAndDetailsService userRegistrationAndDetailsService;

    @Autowired
    public UserRegistrationController(UserRepository userRepository, UserRegistrationAndDetailsService userRegistrationAndDetailsService) {
        this.userRepository = userRepository;
        this.userRegistrationAndDetailsService = userRegistrationAndDetailsService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        User registeredUser = userRegistrationAndDetailsService.register(user);
        return ResponseEntity.ok(registeredUser);
    }

    @GetMapping("/getuser/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable long userId){
        Optional<User> user = userRepository.findById(userId);
        return user.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }*/
}
