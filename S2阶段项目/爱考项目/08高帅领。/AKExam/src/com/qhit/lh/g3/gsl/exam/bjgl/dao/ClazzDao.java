package com.qhit.lh.g3.gsl.exam.bjgl.dao;

import java.util.List;

import com.qhit.lh.g3.gsl.exam.bjgl.bean.ClassInfo;

public interface ClazzDao {
	/**
	 * @return
	 * 获取班级集合
	 */
	public List<ClassInfo> getClazzList();
}
