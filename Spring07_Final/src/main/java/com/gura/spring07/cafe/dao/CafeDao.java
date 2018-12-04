package com.gura.spring07.cafe.dao;

import java.util.List;

import com.gura.spring07.cafe.dto.CafeDto;

public interface CafeDao {
	public int getCount(CafeDto dto);
	public List<CafeDto> getList(CafeDto dto);
	public void insert(CafeDto dto);
}









