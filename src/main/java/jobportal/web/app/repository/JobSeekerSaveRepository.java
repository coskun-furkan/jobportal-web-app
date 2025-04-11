package jobportal.web.app.repository;

import jobportal.web.app.entity.JobPostActivity;
import jobportal.web.app.entity.JobSeekerProfile;
import jobportal.web.app.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
