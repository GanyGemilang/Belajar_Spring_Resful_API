package programmerjava.resful.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import programmerjava.resful.Entity.User;
import programmerjava.resful.Models.RegisterUserRequest;
import programmerjava.resful.Models.UpdateUserRequest;
import programmerjava.resful.Models.UsersResponse;
import programmerjava.resful.Models.WebResponse;
import programmerjava.resful.Service.UserService;

import java.awt.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path= "/api/users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<String> register(@RequestBody RegisterUserRequest request){

        userService.register(request);

        return WebResponse.<String>builder().data("Ok").build();

    }

    @GetMapping(
            path = "/api/user/current",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<UsersResponse> get(User user){
        UsersResponse usersResponse = userService.get(user);

        return  WebResponse.<UsersResponse>builder().data(usersResponse).build();
    }

    @PatchMapping(
            path = "/api/user/current",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<UsersResponse> update(User user, @RequestBody UpdateUserRequest request){
        UsersResponse usersResponse = userService.update(user, request);
        return WebResponse.<UsersResponse>builder().data(usersResponse).build();
    }
}
