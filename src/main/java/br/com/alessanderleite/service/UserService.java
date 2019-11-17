package br.com.alessanderleite.service;

import java.util.List;

import br.com.alessanderleite.dto.UserDto;

public interface UserService {
	UserDto getUserById(Integer userId);
	void saveUser(UserDto userDto);
	List<UserDto> getAllUsers();
}
