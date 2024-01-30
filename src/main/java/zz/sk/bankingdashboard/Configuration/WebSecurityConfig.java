package zz.sk.bankingdashboard.Configuration;

//@Configuration
//@EnableWebSecurity
//@EnableSwagger2
public class WebSecurityConfig {

   /* private final UserRegistrationAndDetailsService userRegistrationAndDetailsService;
    private static final String[] AUTH_WHITE_LIST = {
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/v2/api-docs/**",
            "/swagger-resources/**"
    };

    @Autowired
    public WebSecurityConfig(UserRegistrationAndDetailsService userRegistrationAndDetailsService) {
        this.userRegistrationAndDetailsService = userRegistrationAndDetailsService;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userRegistrationAndDetailsService);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers(AUTH_WHITE_LIST).permitAll()
                        .anyRequest().authenticated()
                )
                .httpBasic();
        return http.build();
    }*/
}
