package com.example.trial.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.trial.dto.UserSearchRequest;
import com.example.trial.entity.User;
/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface UserMapper {
  /**
   * ユーザー情報検索
   * @param id ID
   * @return ユーザー情報
   */
  User search(UserSearchRequest user);
}