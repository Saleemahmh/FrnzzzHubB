package com.frnzzzhubb.dao;

import java.util.List;

import com.frnzzzhubb.model.JobApplication;



public interface JobAppDao {

	boolean applyJob(JobApplication jobapp);

	List<JobApplication> getAppliedJobs(String userId);
}
