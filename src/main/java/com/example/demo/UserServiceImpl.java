package com.example.demo;


public class UserServiceImpl implements UserService {

  @Override
  public String getName(Long userId) {
    return "";
  }

  @Override
  public int getAge(Long userId) {
    return 0;
  }

  @Override
  public String getUserAddress(Long userId) {
    return userId + "의 주소는 없을 것임 계소옥";
  }
}
