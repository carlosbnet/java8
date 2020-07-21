package br.com.startsl.apppet.config;


import br.com.startsl.apppet.security.UserPrincipalDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService(){
        return new UserPrincipalDetailsService();
    }


    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }




    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {


        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());

    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                    .antMatchers("/resources/**").permitAll()
                    .antMatchers("/usuario/**").hasAnyRole("ADMIN")
                    .anyRequest()
                    .authenticated()
                .and()
                .formLogin()
                    .loginPage("/home/login")
                    .permitAll()
                    .loginProcessingUrl("/login")
                    .defaultSuccessUrl("/home/hello")
                .and()
                .logout()
                    .invalidateHttpSession(true)
                    .logoutSuccessUrl("/home/login")
                .and()
                .rememberMe()
                    .userDetailsService(userDetailsService())
                .and()
                .csrf().disable();

    }


}
