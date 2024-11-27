package com.human.notice.respository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface NoticeDAO {

    /*
     * 코드 그룹 관리 조회
     * @return
     * @throws DataAccessException
     * */

    public List NoticeDAO() throws DataAccessException;

    public List NoticeDAO() throws DataAccessException;
}

