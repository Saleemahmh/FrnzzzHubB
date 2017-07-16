package com.frnzzzhubb.dao;

import com.frnzzzhubb.model.UploadFile;

public interface UploadFileDao {

	void save(UploadFile uploadFile);

	UploadFile getFile(String userName);
}
