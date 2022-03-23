package com.example.demo;

public interface UserService {

  String getName(Long userId);

  int getAge(Long userId);


  /**
   * @implSpec 이 구현체는 주소를 반환한다.
   * @param userId
   * @return
   */
  default String getUserAddress(Long userId){
    return getName(userId) + "의 주소는 ";
  }

}
