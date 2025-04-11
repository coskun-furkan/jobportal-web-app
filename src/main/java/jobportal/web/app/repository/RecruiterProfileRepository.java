package jobportal.web.app.repository;

import jobportal.web.app.entity.RecruiterProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile, Integer> {
}
