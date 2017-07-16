package com.frnzzzhubb.service;

import java.util.List;

import com.frnzzzhubb.model.JobApplication;



public interface JobAppService {

	boolean applyJob(JobApplication jobApp);
	
	List<JobApplication> getAppliedJobs(String userId);
}
