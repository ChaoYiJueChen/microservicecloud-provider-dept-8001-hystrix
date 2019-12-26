package com.everjiankang.springcloud.service;

import java.util.List;

import com.everjiankang.springcloud.entity.Dept;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
