package com.digitalisation.ims.Service;
import com.digitalisation.ims.model.ims;
import com.digitalisation.ims.Repository.ImsRepository;
import com.digitalisation.ims.Repository.userRepository;
import com.digitalisation.ims.model.user;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ImsService {
    private final ImsRepository imsRepository;
    private final userRepository userRepository;

    public void createImsRecord(ims ims, Integer userId) {
        user user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        ims.setResponsable(user.getName());
        imsRepository.save(ims);
    }

    public List<ims> getAllIms() {
        return imsRepository.findAll();
    }
    public Optional<ims> getImsById(Double id) {
        return imsRepository.findById(id);
    }
    public ims createIms(ims ims) {
        return imsRepository.save(ims);
    }
    public ims updateIms(Double id, ims imsDetails) {
        return imsRepository.findById(id)
                .map(ims -> {
                    ims.setDate(imsDetails.getDate());
                    ims.setResponsable(imsDetails.getResponsable());
                    ims.setTraitement(imsDetails.getTraitement());
                    ims.setTauxretard(imsDetails.getTauxretard());
                    ims.setAudit(imsDetails.getAudit());
                    ims.setSucesscheck(imsDetails.getSucesscheck());
                    return imsRepository.save(ims);
                })
                .orElseThrow(() -> new RuntimeException("IMS not found with id " + id));
    }

    public void deleteIms(Double id) {
        imsRepository.deleteById(id);
    }
}
