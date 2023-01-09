package com.xworkz.tree.repo;

import com.xworkz.tree.dto.TreeDto;

public interface TreeRepo {
	
	public boolean save(TreeDto dto);
	
	public TreeDto read();

}
